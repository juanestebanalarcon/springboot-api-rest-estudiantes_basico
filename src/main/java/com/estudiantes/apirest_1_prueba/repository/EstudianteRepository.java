package com.estudiantes.apirest_1_prueba.repository;

import com.estudiantes.apirest_1_prueba.model.EstudianteDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends  JpaRepository<EstudianteDTO,Long>{
}