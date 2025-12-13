package com.angelhc.Spring.Boot.JPA.REST.services;

import com.angelhc.Spring.Boot.JPA.REST.dto.MatriculaRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.MatriculaResponse;
import com.angelhc.Spring.Boot.JPA.REST.entity.MatriculasEntity;

public interface IMatriculaService {
    MatriculaResponse saveMatricula(MatriculaRequest matriculaRequest);

}
