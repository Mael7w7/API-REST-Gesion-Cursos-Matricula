package com.angelhc.Spring.Boot.JPA.REST.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MatriculaResponse {

    private Long id;
    private Long cursoId;
    private Long estudianteId;
    private LocalDate fechaMatricula;
}
