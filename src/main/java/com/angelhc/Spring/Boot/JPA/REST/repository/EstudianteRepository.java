package com.angelhc.Spring.Boot.JPA.REST.repository;

import com.angelhc.Spring.Boot.JPA.REST.entity.EstudiantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<EstudiantesEntity, Long> {

}
