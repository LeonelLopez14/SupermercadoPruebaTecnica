
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.dto.SucursalDTO;
import com.castagno.dev.prueba_tecnica_supermercado.mapper.Mapper;
import com.castagno.dev.prueba_tecnica_supermercado.model.Sucursal;
import com.castagno.dev.prueba_tecnica_supermercado.repository.ISucursalRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService implements ISucursalService {
    
    @Autowired
    private ISucursalRepository sucursal_repo;

    @Override
    public List<SucursalDTO> getSucursales() {
        return sucursal_repo.findAll()
            .stream()
            .map(Mapper::toSucursalDTO)
            .collect(Collectors.toList());
}

    @Override
    public void createSucursal(SucursalDTO dto) {
        Sucursal sucursal = Mapper.toSucursalEntity(dto);
        sucursal_repo.save(sucursal);
}

    @Override
    public void updateSucursal(SucursalDTO dto) {
        Sucursal sucursal = Mapper.toSucursalEntity(dto);
        sucursal_repo.save(sucursal);
}

    @Override
    public SucursalDTO findSucursal(Long id) {
        Sucursal sucursal = sucursal_repo.findById(id).orElse(null);
        return Mapper.toSucursalDTO(sucursal);
}

    @Override
    public void deleteSucursal(Long id) {
        sucursal_repo.deleteById(id);
}
    
}
