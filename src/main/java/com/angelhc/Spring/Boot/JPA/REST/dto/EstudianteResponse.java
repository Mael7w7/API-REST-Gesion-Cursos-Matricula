package com.angelhc.Spring.Boot.JPA.REST.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EstudianteResponse {

    private Long id;
    private String nombre;
    private String email;

}
