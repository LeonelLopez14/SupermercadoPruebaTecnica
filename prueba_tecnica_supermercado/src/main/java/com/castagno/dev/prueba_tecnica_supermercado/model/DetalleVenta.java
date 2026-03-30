
package com.castagno.dev.prueba_tecnica_supermercado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter 
public class DetalleVenta {
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO) 
  private Long id;
  private Integer cantidad;
  private BigDecimal precio_unitario;

    public DetalleVenta() {
    }

    public DetalleVenta(Long id, int cantidad, BigDecimal precio_unitario) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }
  
    //metodo para calcular subtotal de la venta
  public BigDecimal subTotal() {
      return precio_unitario.multiply(BigDecimal.valueOf(cantidad));
  }
    
}
