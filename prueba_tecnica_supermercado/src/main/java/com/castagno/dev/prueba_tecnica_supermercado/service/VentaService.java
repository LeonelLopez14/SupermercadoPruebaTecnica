
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.model.Venta;
import com.castagno.dev.prueba_tecnica_supermercado.repository.IVentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService{
    
    @Autowired
    private IVentaRepository venta_repo;

    @Override
    public List<Venta> getVentas() {
        List<Venta>listaVentas = venta_repo.findAll();
        return listaVentas;
    }

    @Override
    public void createVenta(Venta venta) {
        venta_repo.save(venta);
    }

    @Override
    public void deleteVenta(Long id) {
        venta_repo.deleteById(id);
    }

    @Override
    public void updateVenta(Venta venta) {
        this.createVenta(venta);
    }

    @Override
    public Venta findVenta(Long id) {
        Venta venta = venta_repo.findById(id).orElse(null);
        return venta;
    }
    
}
