package com.angelhc.Spring.Boot.JPA.REST.controller;

import com.angelhc.Spring.Boot.JPA.REST.dto.*;
import com.angelhc.Spring.Boot.JPA.REST.services.impl.MatriculaService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
@AllArgsConstructor
public class MatriculaController {

    private final MatriculaService matriculaService;

    @PostMapping
    public ResponseEntity<MatriculaResponse> saveMatricula(@RequestBody MatriculaRequest matriculaRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(matriculaService.saveMatricula(matriculaRequest));
    }

    @GetMapping("/{id}/cursos")
    public ResponseEntity<List<CursoResponse>> listarCursosEstudiante(@PathVariable("id") Long id) {
        return ResponseEntity.ok(matriculaService.listarCursosEstudiante(id));
    }

    @PutMapping("/{id}/desactivar")
    public ResponseEntity<CursoResponse> desactivarCurso(@PathVariable("id") Long id) {
        return ResponseEntity.ok(matriculaService.updateCurso(id));

    }

}
