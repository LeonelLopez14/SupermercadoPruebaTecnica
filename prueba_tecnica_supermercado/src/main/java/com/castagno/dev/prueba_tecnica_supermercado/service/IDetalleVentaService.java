
package com.castagno.dev.prueba_tecnica_supermercado.service;

import com.castagno.dev.prueba_tecnica_supermercado.model.DetalleVenta;
import java.util.List;


public interface IDetalleVentaService {
    
    //metodo READ todas los detalles de ventas
    public List<DetalleVenta> getDetallesVentas();
    
    //metodo CREATE detalle venta
    public void createDetalleVenta(DetalleVenta dettale_venta);
    
    //metodo DELETE detalle venta
    public void deleteDetalleVenta(Long id);
    
    //metodo UPDATE detalle venta
    public void updateDetalleVenta(DetalleVenta detalle_venta);
    
    //metodo READ un solo detalle de venta por ID
    public DetalleVenta findDetalleVenta(Long id);
}
