
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.dto.VentaDTO;
import java.util.List;

public interface IVentaService {
    
//metodo READ
    public List<VentaDTO> getVentas();
//metodo CREATE
    public void createVenta(VentaDTO dto, Long sucursalId);
//metodo DELETE
    public void deleteVenta(Long id);
//metodo UPDATE
    public void updateVenta(VentaDTO dto);
//metodo FIND by id
    public VentaDTO findVenta(Long id);
}
