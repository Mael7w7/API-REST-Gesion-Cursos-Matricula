package com.angelhc.Spring.Boot.JPA.REST.mapper;

import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteResponse;
import com.angelhc.Spring.Boot.JPA.REST.entity.EstudiantesEntity;

public class EstudianteMapper {
    public static EstudianteResponse toEstudianteResponse (EstudiantesEntity estudiante) {
        if (estudiante == null) {return null;}

        return EstudianteResponse.builder()
                .id(estudiante.getId())
                .nombre(estudiante.getNombre())
                .email(estudiante.getEmail())
                .build();
    }
}
