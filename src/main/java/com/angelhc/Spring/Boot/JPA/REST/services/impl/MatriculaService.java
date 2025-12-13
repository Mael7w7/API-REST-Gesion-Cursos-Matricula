package com.angelhc.Spring.Boot.JPA.REST.services.impl;

import com.angelhc.Spring.Boot.JPA.REST.dto.MatriculaRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.MatriculaResponse;
import com.angelhc.Spring.Boot.JPA.REST.entity.CursoEntity;
import com.angelhc.Spring.Boot.JPA.REST.entity.EstudiantesEntity;
import com.angelhc.Spring.Boot.JPA.REST.entity.MatriculasEntity;
import com.angelhc.Spring.Boot.JPA.REST.repository.CursoRepository;
import com.angelhc.Spring.Boot.JPA.REST.repository.EstudianteRepository;
import com.angelhc.Spring.Boot.JPA.REST.repository.MatriculaRepository;
import com.angelhc.Spring.Boot.JPA.REST.services.IMatriculaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MatriculaService implements IMatriculaService {

    private final CursoRepository cursoRepository;
    private final EstudianteRepository estudianteRepository;
    private final MatriculaRepository matriculaRepository;

    @Override
    public MatriculaResponse saveMatricula(MatriculaRequest matriculaRequest) {
        CursoEntity cursoEntity = cursoRepository.findById(matriculaRequest.getCursoId())
                .orElseThrow(() -> new RuntimeException("Curso id not found"));

        EstudiantesEntity estudiantes = estudianteRepository.findById(matriculaRequest.getEstudianteId())
                .orElseThrow(() -> new RuntimeException("Estudiante id not found"));

        MatriculasEntity  matriculasEntity = new MatriculasEntity();
        matriculasEntity.setIdCurso(cursoEntity.getId());
        matriculasEntity.setIdEstudiante(estudiantes.getId());

        var tar = matriculaRepository.save(matriculasEntity);

        return MatriculaResponse.builder()
                .id(tar.getId())
                .fechaMatricula(tar.getFechaMatricula())
                .cursoId(tar.getIdCurso())
                .estudianteId(tar.getIdEstudiante())
                .build();
    }
}
