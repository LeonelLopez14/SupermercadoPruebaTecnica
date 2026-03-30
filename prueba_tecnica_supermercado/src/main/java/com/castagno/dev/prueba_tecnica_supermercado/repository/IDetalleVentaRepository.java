
package com.castagno.dev.prueba_tecnica_supermercado.repository;

import com.castagno.dev.prueba_tecnica_supermercado.model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleVentaRepository extends JpaRepository <DetalleVenta, Long> {
    
}
