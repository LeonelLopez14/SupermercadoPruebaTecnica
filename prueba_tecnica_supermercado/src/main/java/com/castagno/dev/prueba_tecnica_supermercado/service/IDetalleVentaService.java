
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.dto.DetalleVentaDTO;

import java.util.List;


public interface IDetalleVentaService {
    
//metodo READ
    public List<DetalleVentaDTO> getDetallesVentas();
// metodo CREATE
    public void createDetalleVenta(DetalleVentaDTO dto, Long ventaId);
//metodo DELETE
    public void deleteDetalleVenta(Long id);
//metodo UPDATE
    public void updateDetalleVenta(DetalleVentaDTO dto);
//metodo FIND
    public DetalleVentaDTO findDetalleVenta(Long id);
}

