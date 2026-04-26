package br.com.projeto.projeto.controller;

import br.com.projeto.projeto.dto.AlunoDTO;
import br.com.projeto.projeto.service.aluno.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    private IAlunoService serv;

    @GetMapping("/aluno")
    public ResponseEntity<List<AlunoDTO>> retorna(){
        return ResponseEntity.ok(serv.retornaTudo());

    }

    @GetMapping("/aluno/{id}")
    public ResponseEntity<AlunoDTO> retornaPorId(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(serv.retornaPorId(id));
    }


}
