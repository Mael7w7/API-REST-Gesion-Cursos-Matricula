package com.angelhc.Spring.Boot.JPA.REST.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="estudiante")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EstudiantesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="estudiante_id")
    private List<MatriculasEntity> matriculas;



}
