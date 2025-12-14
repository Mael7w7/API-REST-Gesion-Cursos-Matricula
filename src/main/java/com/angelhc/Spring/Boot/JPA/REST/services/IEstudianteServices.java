package com.angelhc.Spring.Boot.JPA.REST.services;

import com.angelhc.Spring.Boot.JPA.REST.dto.CursoResponse;
import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteRequest;
import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteResponse;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEstudianteServices {
    EstudianteResponse saveEstudiante(EstudianteRequest estudianteRequest);


}
