
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.model.Venta;
import java.util.List;

public interface IVentaService {
    
    //metodo READ todas las ventas
    public List<Venta> getVentas();
    
    //metodo CREATE venta
    public void createVenta(Venta venta);
    
    //metodo DELETE venta
    public void deleteVenta(Long id);
    
    //metodo UPDATE venta
    public void updateVenta(Venta venta);
    
    //metodo READ una sola venta por ID
    public Venta findVenta(Long id);
}
