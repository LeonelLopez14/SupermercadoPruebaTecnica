
package com.castagno.dev.prueba_tecnica_supermercado.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DetalleVentaDTO {
    
    private Long productoId;
    private String productoNombre;
    private Integer cantidad;
    private BigDecimal precio_unitario;
    private BigDecimal subtotal;

    public DetalleVentaDTO() {
    }

    public DetalleVentaDTO(Long productoId, String productoNombre, Integer cantidad, BigDecimal precio_unitario, BigDecimal subtotal) {
        this.productoId = productoId;
        this.productoNombre = productoNombre;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.subtotal = subtotal;
    }


    
    
}
