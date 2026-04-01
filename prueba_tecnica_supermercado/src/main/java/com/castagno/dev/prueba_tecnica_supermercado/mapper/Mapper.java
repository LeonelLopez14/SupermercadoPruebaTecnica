
package com.castagno.dev.prueba_tecnica_supermercado.mapper;

import com.castagno.dev.prueba_tecnica_supermercado.dto.DetalleVentaDTO;
import com.castagno.dev.prueba_tecnica_supermercado.dto.ProductoDTO;
import com.castagno.dev.prueba_tecnica_supermercado.dto.SucursalDTO;
import com.castagno.dev.prueba_tecnica_supermercado.dto.VentaDTO;
import com.castagno.dev.prueba_tecnica_supermercado.model.DetalleVenta;
import com.castagno.dev.prueba_tecnica_supermercado.model.EstadoVenta;
import com.castagno.dev.prueba_tecnica_supermercado.model.Producto;
import com.castagno.dev.prueba_tecnica_supermercado.model.Sucursal;
import com.castagno.dev.prueba_tecnica_supermercado.model.Venta;


public class Mapper {
    //---------------------------------//    
    //mappeado de PRODUCTO
    //---------------------------------//
    
    public static ProductoDTO toProductoDTO(Producto producto) {
        if (producto == null) return null;
        
        return new ProductoDTO(
                producto.getId(),
                producto.getNombre(),
                producto.getCategoria(),
                producto.getPrecio_actual()   // precio_actual -> precio
        );
    }
    
    public static Producto toProductoEntity(ProductoDTO dto) {
        if (dto == null) return null;
        
        Producto producto = new Producto();
        producto.setId(dto.getId());
        producto.setNombre(dto.getNombre());
        producto.setCategoria(dto.getCategoria());
        producto.setPrecio_actual(dto.getPrecio()); //precio -> precio_actual
        return producto;
    }
    
    //---------------------------------//
    //mappeado SUCURSAL
    //---------------------------------//
    
    public static SucursalDTO toSucursalDTO(Sucursal sucursal) {
        if (sucursal == null ) return null;
        
        return new SucursalDTO(
                sucursal.getId(),
                sucursal.getNombre(),
                sucursal.getDireccion()
        );
    }
    
    public static Sucursal toSucursalEntity(SucursalDTO dto) {
        if (dto == null) return null;
        
        Sucursal sucursal = new Sucursal();
        sucursal.setId(dto.getId());
        sucursal.setDireccion(dto.getDireccion());
        return sucursal;
    }
    
    //---------------------------------//
    //mappeado DETALLE VENTA
    //---------------------------------//    
    
    public static DetalleVentaDTO toDetalleVentaDTO(DetalleVenta detalle) {
        if (detalle == null) return null;
 
        Long productoId = detalle.getProducto() != null ? detalle.getProducto().getId() : null;
        String productoNombre = detalle.getProducto() != null ? detalle.getProducto().getNombre() : null;
 
        return new DetalleVentaDTO(
            productoId,
            productoNombre,                
            detalle.getCantidad(),
            detalle.getPrecio_unitario(),
            detalle.subTotal()              
        );
    }
 
    public static DetalleVenta toDetalleVentaEntity(DetalleVentaDTO dto) {
        if (dto == null) return null;
 
        DetalleVenta detalle = new DetalleVenta();
        detalle.setCantidad(dto.getCantidad());
        detalle.setPrecio_unitario(dto.getPrecio_unitario());
        return detalle;
    }    
    
    //---------------------------------//
    //mappeado VENTA
    //---------------------------------//   

    public static VentaDTO toVentaDTO(Venta venta) {
        if (venta == null) return null;
 
        EstadoVenta estado = Boolean.TRUE.equals(venta.getBorrador_logico())
                ? EstadoVenta.ANULADA
                : EstadoVenta.REGISTRADA;
 
        DetalleVentaDTO detalle = toDetalleVentaDTO(venta.getDetalle());
 
        Long sucursalId = venta.getSucursal() != null ? venta.getSucursal().getId() : null;
 
        return new VentaDTO(
            venta.getId(),
            venta.getFecha(),
            sucursalId,
            estado,
            detalle,
            venta.total()
        );
    }
 
    public static Venta toVentaEntity(VentaDTO dto) {
        if (dto == null) return null;
 
        Venta venta = new Venta();
        venta.setId(dto.getId());
        venta.setFecha(dto.getFecha());
        venta.setBorrador_logico(EstadoVenta.ANULADA.equals(dto.getEstado()));
        return venta;
    }    
}


