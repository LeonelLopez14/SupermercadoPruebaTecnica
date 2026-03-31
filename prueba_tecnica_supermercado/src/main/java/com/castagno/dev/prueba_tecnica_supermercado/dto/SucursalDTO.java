
package com.castagno.dev.prueba_tecnica_supermercado.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SucursalDTO {
    
    private Long id;
    private String nombre;
    private String direccion;

    public SucursalDTO() {
    }

    public SucursalDTO(Long id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

}
