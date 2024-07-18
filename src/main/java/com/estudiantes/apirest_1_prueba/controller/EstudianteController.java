package com.estudiantes.apirest_1_prueba.controller;
import com.estudiantes.apirest_1_prueba.model.EstudianteDTO;
import com.estudiantes.apirest_1_prueba.service.EstudianteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstudianteController {
    @Autowired
    private EstudianteServiceImpl estudianteService;

    @GetMapping("/estudiantes")
    public ResponseEntity<List<EstudianteDTO>> getAllEstudiantes() {
        return ResponseEntity.ok().body(this.estudianteService.readEstudiantes());
    }

    @GetMapping("/estudiantes/{id}")
    public ResponseEntity<EstudianteDTO> getEstudianteById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.estudianteService.readEstudianteById(id));
    }

    @PostMapping("/estudiantes")
    public ResponseEntity<EstudianteDTO> createEstudiante(@RequestBody EstudianteDTO estudiante) {
        return ResponseEntity.ok().body(this.estudianteService.createEstudiante(estudiante));
    }

    @PutMapping("/estudiantes/{id}")
    public ResponseEntity<EstudianteDTO> updateEstudiante(@PathVariable Long id, @RequestBody EstudianteDTO estudiante) {
        return ResponseEntity.ok().body(this.estudianteService.updateEstudiante(id, estudiante));
    }

    @DeleteMapping("/estudiantes/{id}")
    public ResponseEntity<Void> deleteEstudiante(@PathVariable Long id) {
        this.estudianteService.deleteEstudiante(id);
        return null;
    }
}