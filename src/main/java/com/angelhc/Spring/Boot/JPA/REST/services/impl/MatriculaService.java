package com.angelhc.Spring.Boot.JPA.REST.services.impl;

import com.angelhc.Spring.Boot.JPA.REST.dto.CursoRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.CursoResponse;
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

import java.util.List;
import java.util.stream.Collectors;

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
        matriculasEntity.setCurso(cursoEntity);
        matriculasEntity.setEstudiante(estudiantes);

            var tar = matriculaRepository.save(matriculasEntity);



        return MatriculaResponse.builder()
                .id(tar.getId())
                .fechaMatricula(tar.getFechaMatricula())
                .cursoId(tar.getCurso().getId())
                .estudianteId(tar.getEstudiante().getId())
                .build();
    }
    @Override
    public List<CursoResponse> listarCursosEstudiante(Long idEstudiante) {
        return matriculaRepository.findByEstudiante_Id(idEstudiante)
                .stream()
                .map(r->{
                    CursoEntity cursoEntity = r.getCurso();
                    return CursoResponse.builder()
                            .id(cursoEntity.getId())
                            .descripcion(cursoEntity.getDescripcion())
                            .activo(cursoEntity.getActivo())
                            .nombreCurso(cursoEntity.getNombreCurso())
                            .build();

                })
                .collect(Collectors.toList());
    }


    @Override
    public CursoResponse updateCurso(Long id) {
        CursoEntity curso = cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso id not found"));

        curso.setActivo(false);
        var tar = cursoRepository.save(curso);


        return CursoResponse.builder()
                .id(tar.getId())
                .nombreCurso(tar.getNombreCurso())
                .activo(tar.getActivo())
                .descripcion(tar.getDescripcion())
                .build();

    }


}
