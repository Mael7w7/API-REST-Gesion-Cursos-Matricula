package com.angelhc.Spring.Boot.JPA.REST.mapper;

import com.angelhc.Spring.Boot.JPA.REST.dto.MatriculaResponse;
import com.angelhc.Spring.Boot.JPA.REST.entity.MatriculasEntity;

public class MatriculaMapper {
    public static MatriculaResponse toResponseMatricula (MatriculasEntity matricula){
        if(matricula == null){return null;}

        return MatriculaResponse.builder()
                .id(matricula.getId())
                .fechaMatricula(matricula.getFechaMatricula())
                .cursoId(matricula.getCurso().getId())
                .estudianteId(matricula.getEstudiante().getId())
                .build();
    }
}
