
package com.castagno.dev.prueba_tecnica_supermercado.controller;

import com.castagno.dev.prueba_tecnica_supermercado.dto.ProductoDTO;
import com.castagno.dev.prueba_tecnica_supermercado.service.IProductoService;
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
@RequestMapping("/api/producto")
public class ProductoController {
    
    @Autowired
    private IProductoService prod_serv;
    
    //ENDPOINT CREATE PRODUCTO
    @PostMapping("/crear")
    public ResponseEntity<String> createSucursal (@RequestBody ProductoDTO dto) {
        prod_serv.createProducto(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body("prodcuto creado correctamente");
    }
    
    //ENDPOINT READ PRODUCTOS
    @GetMapping("/todos")
    public ResponseEntity<List<ProductoDTO>> getProductos() {
        List<ProductoDTO> lista = prod_serv.getProdcutos();
        return ResponseEntity.ok(lista);
    }
    
    //ENDPOINT READ PRODUCTO BY ID
    @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> getProducto(@PathVariable Long id) {
        ProductoDTO dto = prod_serv.findProducto(id);
        if (dto == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }
    
    //ENDPOINT UPDATE PRODUCTO
    @PutMapping ("/actualizar")
    public ResponseEntity<String> updateProducto(@RequestBody ProductoDTO dto) {
        if (prod_serv.findProducto(dto.getId()) == null)
            return ResponseEntity.notFound().build();
        prod_serv.updateProducto(dto);
        return ResponseEntity.ok("Producto actualizado correctamente");
    }
    
    //ENDPOINT DELETE PRODUCTO
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteProducto (@PathVariable Long id) {
        if (prod_serv.findProducto(id) == null)
            return ResponseEntity.notFound().build();
        prod_serv.deleteProducto(id);
        return ResponseEntity.ok("Producto eliminado correctamente");
    }
}
