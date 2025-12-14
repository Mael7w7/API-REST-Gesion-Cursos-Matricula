package com.angelhc.Spring.Boot.JPA.REST.repository;

import com.angelhc.Spring.Boot.JPA.REST.dto.CursoResponse;
import com.angelhc.Spring.Boot.JPA.REST.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<CursoEntity, Long> {

}
