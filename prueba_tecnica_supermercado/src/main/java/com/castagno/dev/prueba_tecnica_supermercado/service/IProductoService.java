
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.dto.ProductoDTO;

import java.util.List;


public interface IProductoService {
   
    //metodo READ
    public List<ProductoDTO> getProdcutos();

    //metodo CREATE
    public void createProducto(ProductoDTO dto);

    //metodo DELETE
    public void deleteProducto(Long id);

    //metodo UPDATE
    public void updateProducto(ProductoDTO dto);

    //metodo FIND by id
    public ProductoDTO findProducto(Long id);
}

