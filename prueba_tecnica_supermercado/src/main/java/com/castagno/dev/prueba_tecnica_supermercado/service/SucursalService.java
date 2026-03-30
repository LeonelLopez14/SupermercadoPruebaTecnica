
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.model.Sucursal;
import com.castagno.dev.prueba_tecnica_supermercado.repository.ISucursalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService implements ISucursalService {
    
    @Autowired
    private ISucursalRepository sucursal_repo;

    @Override
    public List<Sucursal> getSucursales() {
        List<Sucursal> listaSucursales = sucursal_repo.findAll();
        return listaSucursales;
    }

    @Override
    public void createSucursal(Sucursal sucursal) {
        sucursal_repo.save(sucursal);
    }

    @Override
    public void deleteSucursal(Long id) {
        sucursal_repo.deleteById(id);
    }

    @Override
    public void updateSucursal(Sucursal sucursal) {
        this.createSucursal(sucursal);
    }

    @Override
    public Sucursal findSucursal(Long id) {
        Sucursal sucursal = sucursal_repo.findById(id).orElse(null);
        return sucursal;
    }
    
}
