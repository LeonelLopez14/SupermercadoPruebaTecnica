
package com.castagno.dev.prueba_tecnica_supermercado.controller;

import com.castagno.dev.prueba_tecnica_supermercado.dto.VentaDTO;
import com.castagno.dev.prueba_tecnica_supermercado.service.IVentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/venta")
public class VentaController {
    
    @Autowired
    private IVentaService venta_serv;
    
    //ENDPOINT CREATE VENTA 
    //sucursalId se para como parametro en la url /ap/venta/crear?sucursalId=
    @PostMapping("/crear")
    public ResponseEntity<String> createVenta (@RequestBody VentaDTO dto,
                                                                            @RequestParam Long sucursalId) {
        venta_serv.createVenta(dto, sucursalId);
        return ResponseEntity.status(HttpStatus.CREATED).body("Venta creada con exito");
    }
    
    //ENDPOINT READ VENTAS
    @GetMapping("/todas")
    public ResponseEntity<List<VentaDTO>> getVentas() {
        List <VentaDTO> lista = venta_serv.getVentas();
       return ResponseEntity.ok(lista);
    }
    
    //ENDPOINT READ UNA VENTA BY ID
    @GetMapping("/{id}")
    public ResponseEntity <VentaDTO> getVenta(@PathVariable Long id) {
        VentaDTO dto = venta_serv.findVenta(id);
        if (dto ==  null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }
    
    //ENDPOINT UPDATE VENTA
    @PutMapping("/actualizar")
    public ResponseEntity<String> updateVenta(@RequestBody VentaDTO dto) {
        if (venta_serv.findVenta(dto.getId()) == null)
            return ResponseEntity.notFound().build();
        venta_serv.updateVenta(dto);
        return ResponseEntity.ok("Venta actualizada correctamente");
    }
    
    //ENDPOINT DELETE VENTA
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteVenta (@PathVariable Long id) {
        if (venta_serv.findVenta(id) == null )
            return ResponseEntity.notFound().build();
        venta_serv.deleteVenta(id);
        return ResponseEntity.ok("Venta eliminada correctamente");
    }
}    

