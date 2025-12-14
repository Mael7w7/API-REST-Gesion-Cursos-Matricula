package com.angelhc.Spring.Boot.JPA.REST.repository;

import com.angelhc.Spring.Boot.JPA.REST.dto.CursoResponse;
import com.angelhc.Spring.Boot.JPA.REST.entity.EstudiantesEntity;
import com.angelhc.Spring.Boot.JPA.REST.entity.MatriculasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MatriculaRepository extends JpaRepository<MatriculasEntity, Long> {
    List<MatriculasEntity> findByEstudiante_Id(Long EstudianteId);

}
