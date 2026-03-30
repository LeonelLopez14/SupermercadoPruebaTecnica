
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.model.Producto;
import com.castagno.dev.prueba_tecnica_supermercado.repository.IProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
    
    @Autowired
    private IProductoRepository producto_repo;

    @Override
    public List<Producto> getProdcutos() {
        List<Producto> listaProductos = producto_repo.findAll();
        return listaProductos;
    }

    @Override
    public void createProducto(Producto producto) {
        producto_repo.save(producto);
    }

    @Override
    public void deleteProducto(Long id) {
        producto_repo.deleteById(id);
    }

    @Override
    public void updateProducto(Producto producto) {
        this.createProducto(producto);
    }

    @Override
    public Producto findProducto(Long id) {
        Producto producto = producto_repo.findById(id).orElse(null);
        return producto;
    }
    
}
