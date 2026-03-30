
package com.castagno.dev.prueba_tecnica_supermercado.repository;

import com.castagno.dev.prueba_tecnica_supermercado.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends JpaRepository <Venta, Long>{
    
}
