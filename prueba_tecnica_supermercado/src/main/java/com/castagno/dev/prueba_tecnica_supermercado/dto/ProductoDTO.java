
package com.castagno.dev.prueba_tecnica_supermercado.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoDTO {
    
private Long id;
private String nombre;
private String categoria;
private BigDecimal precio;

    public ProductoDTO() {
    }

    public ProductoDTO(Long id, String nombre, String categoria, BigDecimal precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }


}
