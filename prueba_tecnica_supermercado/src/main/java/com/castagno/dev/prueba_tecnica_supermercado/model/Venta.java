
package com.castagno.dev.prueba_tecnica_supermercado.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Venta {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    private Long id;
    private LocalDate fecha;
    private Boolean borrador_logico;
     
    @ManyToOne
    @JoinColumn (name = "id_sucursal", nullable = false)
    private Sucursal sucursal;

    @OneToOne(mappedBy = "venta", cascade = CascadeType.ALL)
    private DetalleVenta detalle;
     
    public Venta() {
    }

    public Venta(Long id, LocalDate fecha, Boolean borrador_logico, Sucursal sucursal) {
        this.id = id;
        this.fecha = fecha;
        this.borrador_logico = borrador_logico;
        this.sucursal = sucursal;
    }

public BigDecimal total() {
    return detalle != null ? detalle.subTotal() : BigDecimal.ZERO;
}
    
    
    
}
