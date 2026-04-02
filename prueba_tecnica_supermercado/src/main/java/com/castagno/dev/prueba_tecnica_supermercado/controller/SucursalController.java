
package com.castagno.dev.prueba_tecnica_supermercado.controller;

import com.castagno.dev.prueba_tecnica_supermercado.dto.SucursalDTO;
import com.castagno.dev.prueba_tecnica_supermercado.service.ISucursalService;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sucursal")
public class SucursalController {
    
    @Autowired
    private ISucursalService sucursal_serv;
    
    //ENDPOINT CREATE SUCURSAL
    @PostMapping("/crear")
    public ResponseEntity<String> createSucursal(@RequestBody SucursalDTO dto) {
        sucursal_serv.createSucursal(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body("La sucursal fue creada correctamente");
    }
    
    //ENDPOINT READ SUCURSAL
    @GetMapping("/todas")
    public ResponseEntity<List<SucursalDTO>> readSucursales() {
        List<SucursalDTO> lista = sucursal_serv.getSucursales();
        return ResponseEntity.ok(lista);
    } 
    
    //ENDPOINT READ UNA SUCURSAL
    @GetMapping("/{id}")
    public ResponseEntity<SucursalDTO> getSucursal(@PathVariable Long id) {
        SucursalDTO dto = sucursal_serv.findSucursal(id);
        if (dto == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }
    
    //ENDPOINT UPDATE SUCURSAL
    @PutMapping("/actualizar")
    public ResponseEntity<String> updateSucursal (@RequestBody SucursalDTO dto) {
        if (sucursal_serv.findSucursal(dto.getId()) == null)
            return ResponseEntity.notFound().build();
        sucursal_serv.updateSucursal(dto);
        return ResponseEntity.ok("Sucursal actualizada correctamente");                  
    }

    //ENDPOINT DELETE SUCURSAL
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteSucursal(@PathVariable Long id) {
        if (sucursal_serv.findSucursal(id) == null)
            return ResponseEntity.notFound().build();
        sucursal_serv.deleteSucursal(id);
        return ResponseEntity.ok("Sucursal eliminada correctamente");
    }
}
