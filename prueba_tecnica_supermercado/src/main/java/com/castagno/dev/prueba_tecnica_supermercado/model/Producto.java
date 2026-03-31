
package com.castagno.dev.prueba_tecnica_supermercado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Producto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    private Long id;
    private String nombre;
    private String categoria;
    
    private BigDecimal precio_actual;
    
    @OneToMany (mappedBy = "producto")
    private List<DetalleVenta> lista_detalles_ventas;

    public Producto() {
    }

    public Producto(Long id, String nombre, String categoria, BigDecimal precio_actual, List<DetalleVenta> lista_detalles_ventas) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio_actual = precio_actual;
        this.lista_detalles_ventas = lista_detalles_ventas;
    }


}
