package com.estudiantes.apirest_1_prueba.repository;

import com.estudiantes.apirest_1_prueba.model.MateriaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends  JpaRepository<MateriaDTO,Long>{
}