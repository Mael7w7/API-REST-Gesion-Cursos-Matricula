package com.angelhc.Spring.Boot.JPA.REST.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CursoResponse {
    private Long id;
    private String nombreCurso;
    private String descripcion;
    private Boolean activo=true;
}
