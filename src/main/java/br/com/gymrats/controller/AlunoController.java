package br.com.gymrats.controller;

import br.com.gymrats.dto.aluno.AlunoAtualizacaoDto;
import br.com.gymrats.dto.aluno.AlunoRequestComIdDTO;
import br.com.gymrats.dto.aluno.AlunoRequestDTO;
import br.com.gymrats.dto.aluno.AlunoResponseDTO;
import br.com.gymrats.service.aluno.IAlunoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private final IAlunoService service;


    @GetMapping()
    public ResponseEntity<List<AlunoResponseDTO>> retorna() {
        return ResponseEntity.ok(service.retornaTudo());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoResponseDTO> retornaPorId(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(service.retornaPorId(id));
    }

    @PostMapping()
    public ResponseEntity<AlunoResponseDTO> cadastrarAluno(@Valid @RequestBody AlunoRequestDTO aluno) {;
        return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarAluno(aluno));
    }

    @PutMapping()
    public ResponseEntity<AlunoAtualizacaoDto> atualizarAluno(@Valid @RequestBody AlunoRequestComIdDTO aluno){
        return ResponseEntity.status(HttpStatus.OK).body(service.atualizarAluno(aluno));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletaAluno(@PathVariable Integer id){
        service.deletaAluno(id);
        return ResponseEntity.ok("Aluno Removido com sucesso");
    }

}
