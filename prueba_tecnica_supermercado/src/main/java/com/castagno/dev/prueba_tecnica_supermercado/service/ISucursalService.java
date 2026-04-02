
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.dto.SucursalDTO;
import java.util.List;


public interface ISucursalService {
    
    //metodo READ
    public List<SucursalDTO> getSucursales();

    //metodo CREATE
    public void createSucursal(SucursalDTO dto);

    //metodo DELETE
    public void deleteSucursal(Long id);

    //metodo UPDATE
    public void updateSucursal(SucursalDTO dto);

    //metodo FIND by id
    public SucursalDTO findSucursal(Long id);
}
