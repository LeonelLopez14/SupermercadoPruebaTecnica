
package com.castagno.dev.prueba_tecnica_supermercado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Sucursal {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    
    @OneToMany (mappedBy = "sucursal")
    private List<Venta> lista_ventas;

    public Sucursal() {
    }

    public Sucursal(Long id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
    
}
