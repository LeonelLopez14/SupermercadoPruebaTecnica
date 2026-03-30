
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.model.DetalleVenta;
import com.castagno.dev.prueba_tecnica_supermercado.repository.IDetalleVentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleVentaService implements IDetalleVentaService{
    
    @Autowired
    private IDetalleVentaRepository detalle_repo;

    @Override
    public List<DetalleVenta> getDetallesVentas() {
        List<DetalleVenta> listaDetallesVentas = detalle_repo.findAll();
        return listaDetallesVentas;
    }

    @Override
    public void createDetalleVenta(DetalleVenta detalle_venta) {
        detalle_repo.save(detalle_venta);
    }

    @Override
    public void deleteDetalleVenta(Long id) {
        detalle_repo.deleteById(id);
    }

    @Override
    public void updateDetalleVenta(DetalleVenta detalle_venta) {
        this.createDetalleVenta(detalle_venta);
    }

    @Override
    public DetalleVenta findDetalleVenta(Long id) {
        DetalleVenta detalle_venta = detalle_repo.findById(id).orElse(null);
        return detalle_venta;
    }
    
}
