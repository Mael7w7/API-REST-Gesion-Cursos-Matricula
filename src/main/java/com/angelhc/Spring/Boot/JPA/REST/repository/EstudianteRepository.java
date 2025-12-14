package com.angelhc.Spring.Boot.JPA.REST.repository;

import com.angelhc.Spring.Boot.JPA.REST.entity.EstudiantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudianteRepository extends JpaRepository<EstudiantesEntity, Long> {

}
