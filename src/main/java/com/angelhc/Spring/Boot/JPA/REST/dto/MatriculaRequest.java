package com.angelhc.Spring.Boot.JPA.REST.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MatriculaRequest {

    private Long cursoId;
    private Long estudianteId;


}
