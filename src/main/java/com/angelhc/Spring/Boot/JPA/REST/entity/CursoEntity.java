package com.angelhc.Spring.Boot.JPA.REST.entity;

import com.angelhc.Spring.Boot.JPA.REST.dto.EstudianteRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="cursos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCurso;
    private String descripcion;
    private Boolean activo=true;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="curso_id")
    private List<MatriculasEntity> matriculas;

}
