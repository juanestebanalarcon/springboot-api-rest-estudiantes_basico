package com.estudiantes.apirest_1_prueba.service;
import com.estudiantes.apirest_1_prueba.model.EstudianteDTO;
import java.util.List;
import java.util.Optional;

import com.estudiantes.apirest_1_prueba.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EstudianteServiceImpl  implements EstudianteService{

    @Autowired
    private EstudianteRepository estudianteRepository;
    @Override
    public EstudianteDTO createEstudiante(EstudianteDTO estudianteDTO) {
        return estudianteRepository.save(estudianteDTO);
    }

    @Override
    public EstudianteDTO updateEstudiante(Long id, EstudianteDTO estudianteDTO) {
        Optional<EstudianteDTO> studiousnessDB = this.estudianteRepository.findById(id);
        if(studiousnessDB.isPresent()){
            EstudianteDTO studiousnessUpdate = studiousnessDB.get();
            studiousnessUpdate.setNombre(estudianteDTO.getNombre());
            studiousnessUpdate.setApellido(estudianteDTO.getApellido());
            studiousnessUpdate.setCedula(estudianteDTO.getCedula());
            return this.estudianteRepository.save(studiousnessUpdate);
        }
        else {
            return null;
        }
    }

    @Override
    public void deleteEstudiante(Long id) {
        Optional<EstudianteDTO> studiousnessDB = this.estudianteRepository.findById(id);
        if(studiousnessDB.isPresent()){
             estudianteRepository.delete(studiousnessDB.get());
        }
    }

    @Override
    public EstudianteDTO readEstudianteById(Long id) {
        Optional<EstudianteDTO> studiousnessDB = this.estudianteRepository.findById(id);
        if(studiousnessDB.isPresent()){
            return studiousnessDB.get();
        }
        return null;
    }

    @Override
    public List<EstudianteDTO> readEstudiantes() {
        return estudianteRepository.findAll();
    }
}