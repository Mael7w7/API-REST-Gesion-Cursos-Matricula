package com.angelhc.Spring.Boot.JPA.REST.services;

import com.angelhc.Spring.Boot.JPA.REST.dto.CursoRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.CursoResponse;
import com.angelhc.Spring.Boot.JPA.REST.dto.MatriculaRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.MatriculaResponse;
import com.angelhc.Spring.Boot.JPA.REST.entity.MatriculasEntity;

import java.util.List;

public interface IMatriculaService {
    MatriculaResponse saveMatricula(MatriculaRequest matriculaRequest);
    List<CursoResponse> listarCursosEstudiante(Long idEstudiante);
    CursoResponse updateCurso(Long id);
}
