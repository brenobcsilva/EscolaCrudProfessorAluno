package com.example.escola5.controller;

import com.example.escola5.dto.AlunoDto;
import com.example.escola5.persistence.model.Aluno;
import com.example.escola5.service.AlunoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/mostrarAluno")
    public ResponseEntity<?> mostrarAlunos(){
        return new ResponseEntity<>(alunoService.mostrarAluno(), HttpStatus.CREATED);
    }

    @PostMapping("/salvarAluno")
    public ResponseEntity<Aluno> salvarAluno(@RequestBody AlunoDto alunoDto){
        var aluno = new Aluno();
        BeanUtils.copyProperties(alunoDto, aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(aluno));
    }
}
