package com.angelhc.Spring.Boot.JPA.REST.mapper;

import com.angelhc.Spring.Boot.JPA.REST.dto.CursoResponse;
import com.angelhc.Spring.Boot.JPA.REST.entity.CursoEntity;
import com.angelhc.Spring.Boot.JPA.REST.repository.CursoRepository;

public class CursoMapper {

    //Mapeo de CursoEntity a CursoRsponse
    public static CursoResponse toResponseCurso(CursoEntity cursoEntity) {
        if (cursoEntity == null) return null;

        return CursoResponse.builder()
                .id(cursoEntity.getId())
                .nombreCurso(cursoEntity.getNombreCurso())
                .activo(cursoEntity.getActivo())
                .descripcion(cursoEntity.getDescripcion())
                .build();

    };
}
