package com.estudiantes.apirest_1_prueba.service;
import com.estudiantes.apirest_1_prueba.model.EstudianteDTO;
import com.estudiantes.apirest_1_prueba.model.MateriaDTO;
import java.util.List;
import java.util.Optional;

import com.estudiantes.apirest_1_prueba.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MateriaServiceImpl  implements MateriaService{

    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public MateriaDTO createMateria(MateriaDTO materiaDTO) {
        return materiaRepository.save(materiaDTO);
    }

    @Override
    public MateriaDTO updateMateria(MateriaDTO materiaDTO) {
        Optional<MateriaDTO> courseDTO = this.materiaRepository.findById(materiaDTO.getId());
        if(courseDTO.isPresent()){
            MateriaDTO courseUpdate = courseDTO.get();
            courseUpdate.setName(courseDTO.get().getName());
            courseUpdate.setStudent(materiaDTO.getStudent());
            return this.materiaRepository.save(courseUpdate);
        }
        else {
            return null;
        }
    }

    @Override
    public void deleteMateria(Long id) {
        Optional<MateriaDTO> courseDB = this.materiaRepository.findById(id);
        if(courseDB.isPresent()){
            materiaRepository.delete(courseDB.get());
        }
    }

    @Override
    public MateriaDTO readMateriaById(Long id) {
        Optional<MateriaDTO> coursedb = this.materiaRepository.findById(id);
        if(coursedb.isPresent()){
            return coursedb.get();
        }
        return null;
    }

    @Override
    public List<MateriaDTO> readMaterias() {
        return materiaRepository.findAll();
    }
}