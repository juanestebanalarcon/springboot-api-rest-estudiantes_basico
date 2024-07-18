package com.estudiantes.apirest_1_prueba.service;
import com.estudiantes.apirest_1_prueba.model.MateriaDTO;

import java.util.List;

public interface MateriaService{
    MateriaDTO createMateria(MateriaDTO materiaDTO);
    MateriaDTO updateMateria(MateriaDTO materiaDTO);
    void deleteMateria(Long id);
    MateriaDTO readMateriaById(Long id);
    List<MateriaDTO> readMaterias();
}
