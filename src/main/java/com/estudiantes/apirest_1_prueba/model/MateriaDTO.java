package com.estudiantes.apirest_1_prueba.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MateriaDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn()
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private EstudianteDTO student;

    // Getters and setters

    @Override
    public String toString() {
        return "MateriaDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public MateriaDTO(Long id, String name, EstudianteDTO student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public MateriaDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EstudianteDTO getStudent() {
        return student;
    }

    public void setStudent(EstudianteDTO student) {
        this.student = student;
    }
}
