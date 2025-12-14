package com.angelhc.Spring.Boot.JPA.REST.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Entity
@Table(name="matricula")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MatriculasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDate fechaMatricula;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private CursoEntity curso;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private EstudiantesEntity estudiante;
}

