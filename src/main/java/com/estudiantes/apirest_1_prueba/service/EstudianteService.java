package com.estudiantes.apirest_1_prueba.service;
import com.estudiantes.apirest_1_prueba.model.EstudianteDTO;

import java.util.List;

public interface EstudianteService{
    EstudianteDTO createEstudiante(EstudianteDTO estudianteDTO);
    EstudianteDTO updateEstudiante(Long id, EstudianteDTO estudianteDTO);
    void deleteEstudiante(Long id);
    EstudianteDTO readEstudianteById(Long id);
    List<EstudianteDTO> readEstudiantes();
}
