
package com.castagno.dev.prueba_tecnica_supermercado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private Boolean borrador_logico = true;

    public Venta() {
    }

    public Venta(Long id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }
    
    
    
}
