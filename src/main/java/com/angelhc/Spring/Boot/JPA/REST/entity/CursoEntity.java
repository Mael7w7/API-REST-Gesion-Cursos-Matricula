package com.angelhc.Spring.Boot.JPA.REST.entity;

import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="cursos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_curso")
    private String nombreCurso;

    private String descripcion;
    private Boolean activo=true;


}
