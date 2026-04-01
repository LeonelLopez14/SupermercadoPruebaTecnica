
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.dto.DetalleVentaDTO;
import com.castagno.dev.prueba_tecnica_supermercado.mapper.Mapper;
import com.castagno.dev.prueba_tecnica_supermercado.model.DetalleVenta;
import com.castagno.dev.prueba_tecnica_supermercado.model.Producto;
import com.castagno.dev.prueba_tecnica_supermercado.model.Venta;
import com.castagno.dev.prueba_tecnica_supermercado.repository.IDetalleVentaRepository;
import com.castagno.dev.prueba_tecnica_supermercado.repository.IProductoRepository;
import com.castagno.dev.prueba_tecnica_supermercado.repository.IVentaRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleVentaService implements IDetalleVentaService{
    
    @Autowired
    private IDetalleVentaRepository detalle_repo;
    
   @Autowired
    private IProductoRepository producto_repo; 

    @Autowired
    private IVentaRepository venta_repo;    

@Override
public List<DetalleVentaDTO> getDetallesVentas() {
    return detalle_repo.findAll()
        .stream()
        .map(Mapper::toDetalleVentaDTO)
        .collect(Collectors.toList());
}

@Override
public void createDetalleVenta(DetalleVentaDTO dto, Long ventaId) {
    DetalleVenta detalle = Mapper.toDetalleVentaEntity(dto);

    Producto producto = producto_repo.findById(dto.getProductoId()).orElseThrow();
    detalle.setProducto(producto);

    Venta venta = venta_repo.findById(ventaId).orElseThrow();
    detalle.setVenta(venta);

    detalle_repo.save(detalle);
}

@Override
public void updateDetalleVenta(DetalleVentaDTO dto) {
    DetalleVenta detalle = Mapper.toDetalleVentaEntity(dto);

    Producto producto = producto_repo.findById(dto.getProductoId()).orElseThrow();
    detalle.setProducto(producto);

    detalle_repo.save(detalle);
}

@Override
public DetalleVentaDTO findDetalleVenta(Long id) {
    DetalleVenta detalle = detalle_repo.findById(id).orElse(null);
    return Mapper.toDetalleVentaDTO(detalle);
}

@Override
public void deleteDetalleVenta(Long id) {
    detalle_repo.deleteById(id);
}
    
}
