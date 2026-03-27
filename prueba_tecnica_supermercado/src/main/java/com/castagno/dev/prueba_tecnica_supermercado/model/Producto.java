
package com.castagno.dev.prueba_tecnica_supermercado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    public Producto() {
    }

    public Producto(Long id, String nombre, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }
    
    
}
