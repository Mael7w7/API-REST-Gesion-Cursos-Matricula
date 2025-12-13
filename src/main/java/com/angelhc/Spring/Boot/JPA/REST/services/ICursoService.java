package com.angelhc.Spring.Boot.JPA.REST.services;

import com.angelhc.Spring.Boot.JPA.REST.dto.CursoRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.CursoResponse;

public interface ICursoService {
        CursoResponse saveCurso(CursoRequest cursoRequest);
}
