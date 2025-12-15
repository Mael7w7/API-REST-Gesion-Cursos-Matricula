package com.angelhc.Spring.Boot.JPA.REST.services.impl;

import com.angelhc.Spring.Boot.JPA.REST.dto.CursoRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.CursoResponse;
import com.angelhc.Spring.Boot.JPA.REST.entity.CursoEntity;
import com.angelhc.Spring.Boot.JPA.REST.mapper.CursoMapper;
import com.angelhc.Spring.Boot.JPA.REST.repository.CursoRepository;
import com.angelhc.Spring.Boot.JPA.REST.services.ICursoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CursoService implements ICursoService {
    private final CursoRepository repository;


    @Override
    public CursoResponse saveCurso(CursoRequest cursoRequest) {
        CursoEntity cursoEntity = new CursoEntity();
        cursoEntity.setNombreCurso(cursoRequest.getNombre());
        cursoEntity.setDescripcion(cursoRequest.getDescripcion());
        var tar = repository.save(cursoEntity);

        return CursoMapper.toResponseCurso(tar);

    }
}
