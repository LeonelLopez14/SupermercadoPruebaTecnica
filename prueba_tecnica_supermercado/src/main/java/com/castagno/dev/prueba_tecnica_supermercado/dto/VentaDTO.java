
package com.castagno.dev.prueba_tecnica_supermercado.dto;

import com.castagno.dev.prueba_tecnica_supermercado.model.DetalleVenta;
import com.castagno.dev.prueba_tecnica_supermercado.model.EstadoVenta;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentaDTO implements Serializable {
    
    private Long id;
    private LocalDate fecha;
    private Long sucursalId;
    private EstadoVenta estado;
    private DetalleVenta venta;
    private BigDecimal total;

    public VentaDTO() {
    }

    public VentaDTO(Long id, LocalDate fecha, Long sucursalId, EstadoVenta estado, DetalleVenta venta, BigDecimal total) {
        this.id = id;
        this.fecha = fecha;
        this.sucursalId = sucursalId;
        this.estado = estado;
        this.venta = venta;
        this.total = total;
    }


    
    
}
