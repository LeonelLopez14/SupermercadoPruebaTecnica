
package com.castagno.dev.prueba_tecnica_supermercado.controller;

import com.castagno.dev.prueba_tecnica_supermercado.dto.DetalleVentaDTO;
import com.castagno.dev.prueba_tecnica_supermercado.service.IDetalleVentaService;
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
@RequestMapping("/api/detalle-venta")
public class DetalleVentaController {
    
    @Autowired
    private IDetalleVentaService detalle_serv;
    
    //ENDPOINT CREATE DETALLE VENTA
    //ventaID se pasa como parametro en la url /ap/detalle-venta/crear?ventaId=
    @PostMapping("/crear")
    public ResponseEntity<String> createDetalle (@RequestBody DetalleVentaDTO dto,
                                                                                @RequestParam Long ventaId) {
        detalle_serv.createDetalleVenta(dto, ventaId);
        return ResponseEntity.status(HttpStatus.CREATED).body("Detalle de venta creado correctamente");
    } 
    
    //ENDPOINT READ TODAS LOS DETALLES DE VENTA
    @GetMapping("/todos")
    public ResponseEntity<List<DetalleVentaDTO>> getDetalles() {
        List<DetalleVentaDTO> lista =  detalle_serv.getDetallesVentas();
        return ResponseEntity.ok(lista);
    }
    
    //ENDPOINT READ UN DETALLE VENTA POR ID
    @GetMapping ("/{id}")
    public ResponseEntity <DetalleVentaDTO> getDetalle (@PathVariable Long id) {
        DetalleVentaDTO dto = detalle_serv.findDetalleVenta(id);
        if (dto == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }
    
    //ENDPOINT UPDATE DETALLE VENTA
    @PutMapping("/actualizar")
    public ResponseEntity<String> updateDetalle(@RequestBody DetalleVentaDTO dto) {
        if (detalle_serv.findDetalleVenta(dto.getProductoId()) == null)
            return ResponseEntity.notFound().build();
        detalle_serv.updateDetalleVenta(dto);
        return ResponseEntity.ok("Detalle de venta Actualizado correctamente");
    }
    
    //ENDPOINT DELETE DETALLE VENTA
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<String> deleteDetalle (@PathVariable Long id) {
        if (detalle_serv.findDetalleVenta(id) == null)
            return ResponseEntity.notFound().build();
        detalle_serv.deleteDetalleVenta(id);
        return ResponseEntity.ok("Detalle de venta eliminado correectamente");
    }
}
