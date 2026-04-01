
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.dto.VentaDTO;
import com.castagno.dev.prueba_tecnica_supermercado.mapper.Mapper;
import com.castagno.dev.prueba_tecnica_supermercado.model.Sucursal;
import com.castagno.dev.prueba_tecnica_supermercado.model.Venta;
import com.castagno.dev.prueba_tecnica_supermercado.repository.ISucursalRepository;
import com.castagno.dev.prueba_tecnica_supermercado.repository.IVentaRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService{
    
    @Autowired
    private IVentaRepository venta_repo;

    @Autowired
    private ISucursalRepository sucursal_repo;

    @Override
    public List<VentaDTO> getVentas() {
        return venta_repo.findAll()
            .stream()
            .map(Mapper::toVentaDTO)
            .collect(Collectors.toList());
    }

    @Override
    public void createVenta(VentaDTO dto, Long sucursalId) {
        Venta venta = Mapper.toVentaEntity(dto);

        Sucursal sucursal = sucursal_repo.findById(sucursalId).orElseThrow();
        venta.setSucursal(sucursal);

        venta_repo.save(venta);
    }

    @Override
    public void updateVenta(VentaDTO dto) {
        Venta venta = Mapper.toVentaEntity(dto);

        Sucursal sucursal = sucursal_repo.findById(dto.getSucursalId()).orElseThrow();
        venta.setSucursal(sucursal);

        venta_repo.save(venta);
    }

    @Override
    public VentaDTO findVenta(Long id) {
        Venta venta = venta_repo.findById(id).orElse(null);
        return Mapper.toVentaDTO(venta);
    }

    @Override
    public void deleteVenta(Long id) {
        venta_repo.deleteById(id);
    }
}
