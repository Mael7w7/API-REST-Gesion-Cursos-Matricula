package com.angelhc.Spring.Boot.JPA.REST.services.impl;

import com.angelhc.Spring.Boot.JPA.REST.dto.CursoResponse;
import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteResponse;
import com.angelhc.Spring.Boot.JPA.REST.entity.EstudiantesEntity;
import com.angelhc.Spring.Boot.JPA.REST.repository.EstudianteRepository;
import com.angelhc.Spring.Boot.JPA.REST.services.IEstudianteServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EstudianteService implements IEstudianteServices {
    private final EstudianteRepository estudianteRepository;


    @Override
    public EstudianteResponse saveEstudiante(EstudianteRequest estudianteRequest) {
        EstudiantesEntity estudiante = new EstudiantesEntity();
        estudiante.setEmail(estudianteRequest.getEmail());
        estudiante.setNombre(estudianteRequest.getNombre());

        var tar =estudianteRepository.save(estudiante);

        return EstudianteResponse.builder()
                .id(tar.getId())
                .nombre(tar.getNombre())
                .email(tar.getEmail())
                .build();

    }


}
