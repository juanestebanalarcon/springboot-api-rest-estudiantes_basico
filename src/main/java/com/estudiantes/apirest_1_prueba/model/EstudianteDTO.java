package com.estudiantes.apirest_1_prueba.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import java.util.HashSet;
import com.estudiantes.apirest_1_prueba.model.*;

import java.util.List;
import java.util.Set;
@Entity
public class EstudianteDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String cedula;
    @ManyToOne
    @JoinColumn(name = "materias_id")
    private MateriaDTO materias = new MateriaDTO();
    // Getters and setters...

    public EstudianteDTO() {
    }

    public EstudianteDTO(Long id, String nombre, String apellido, String cedula, MateriaDTO materias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.materias = materias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public MateriaDTO getMaterias() {
        return materias;
    }

    public void setMaterias(MateriaDTO materias) {
        this.materias = materias;
    }

}