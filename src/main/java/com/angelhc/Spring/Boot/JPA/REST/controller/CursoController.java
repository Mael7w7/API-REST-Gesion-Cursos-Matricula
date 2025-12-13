package com.angelhc.Spring.Boot.JPA.REST.controller;

import com.angelhc.Spring.Boot.JPA.REST.dto.CursoRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.CursoResponse;
import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteResponse;
import com.angelhc.Spring.Boot.JPA.REST.services.impl.CursoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
@AllArgsConstructor
public class CursoController {
    private final CursoService cursoService;

    @PostMapping
    public ResponseEntity<CursoResponse> saveCurso(@RequestBody CursoRequest cursoRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoService.saveCurso(cursoRequest));
    }
}
