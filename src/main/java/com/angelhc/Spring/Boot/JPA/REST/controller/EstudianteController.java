package com.angelhc.Spring.Boot.JPA.REST.controller;

import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteResponse;
import com.angelhc.Spring.Boot.JPA.REST.services.impl.EstudianteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiante")
@AllArgsConstructor
public class EstudianteController {

    private final EstudianteService estudianteService;

    @PostMapping
    public ResponseEntity<EstudianteResponse> saveEstudiante(@RequestBody EstudianteRequest estudianteRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(estudianteService.saveEstudiante(estudianteRequest));
    }
}
