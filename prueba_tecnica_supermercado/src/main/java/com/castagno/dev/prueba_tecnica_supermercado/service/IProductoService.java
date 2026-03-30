
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.model.Producto;
import java.util.List;


public interface IProductoService {
        
    //metodo READ todas las producto
    public List<Producto> getProdcutos();
    
    //metodo CREATE producto
    public void createProducto(Producto producto);
    
    //metodo DELETE producto
    public void deleteProducto(Long id);
    
    //metodo UPDATE producto
    public void updateProducto(Producto producto);
    
    //metodo READ una sola producto por ID
    public Producto findProducto(Long id);
}

