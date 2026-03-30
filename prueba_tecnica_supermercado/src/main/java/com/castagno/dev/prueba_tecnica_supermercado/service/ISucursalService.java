
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.model.Sucursal;
import java.util.List;


public interface ISucursalService {
    
    //metodo READ todas las sucursal
    public List<Sucursal> getSucursales();
    
    //metodo CREATE sucursal
    public void createSucursal(Sucursal sucursal);
    
    //metodo DELETE sucursal
    public void deleteSucursal(Long id);
    
    //metodo UPDATE sucursal
    public void updateSucursal(Sucursal sucursal);
    
    //metodo READ una sola sucursal por ID
    public Sucursal findSucursal(Long id);
}
