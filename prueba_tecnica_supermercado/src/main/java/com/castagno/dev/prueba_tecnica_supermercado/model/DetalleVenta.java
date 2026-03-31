
package com.castagno.dev.prueba_tecnica_supermercado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
  
@OneToOne
@JoinColumn(name = "id_venta", nullable = false, unique = true)
private Venta venta;

  @ManyToOne
  @JoinColumn (name = "id_producto", nullable = false)
  private Producto producto;
  
    public DetalleVenta() {
    }

    public DetalleVenta(Long id, Integer cantidad, BigDecimal precio_unitario, Venta venta, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.venta = venta;
        this.producto = producto;
    }


    //metodo para calcular subtotal de la venta
  public BigDecimal subTotal() {
      return precio_unitario.multiply(BigDecimal.valueOf(cantidad));
  }
    
}
