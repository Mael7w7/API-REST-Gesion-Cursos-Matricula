package com.angelhc.Spring.Boot.JPA.REST.repository;

import com.angelhc.Spring.Boot.JPA.REST.entity.MatriculasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<MatriculasEntity, Long> {

}
