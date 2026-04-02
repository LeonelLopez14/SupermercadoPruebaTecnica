
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.dto.ProductoDTO;
import com.castagno.dev.prueba_tecnica_supermercado.mapper.Mapper;
import com.castagno.dev.prueba_tecnica_supermercado.model.Producto;
import com.castagno.dev.prueba_tecnica_supermercado.repository.IProductoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
    
    @Autowired
    private IProductoRepository producto_repo;

    @Override
    public List<ProductoDTO> getProdcutos() {
        return producto_repo.findAll()
            .stream()
            .map(Mapper::toProductoDTO)
            .collect(Collectors.toList());
}

    @Override
    public void createProducto(ProductoDTO dto) {
        Producto producto = Mapper.toProductoEntity(dto);
        producto_repo.save(producto);
}

    @Override
    public void updateProducto(ProductoDTO dto) {
        Producto producto = Mapper.toProductoEntity(dto);
        producto_repo.save(producto);
}

    @Override
    public ProductoDTO findProducto(Long id) {
        Producto producto = producto_repo.findById(id).orElse(null);
        return Mapper.toProductoDTO(producto);
}

    @Override
    public void deleteProducto(Long id) {
        producto_repo.deleteById(id);
}
    
}
