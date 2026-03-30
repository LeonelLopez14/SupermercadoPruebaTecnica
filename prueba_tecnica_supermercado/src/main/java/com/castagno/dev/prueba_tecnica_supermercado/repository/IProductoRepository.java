
package com.castagno.dev.prueba_tecnica_supermercado.repository;

import com.castagno.dev.prueba_tecnica_supermercado.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository <Producto, Long> {
    
}
