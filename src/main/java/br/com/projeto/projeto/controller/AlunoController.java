package br.com.projeto.projeto.controller;

import br.com.projeto.projeto.dto.aluno.AlunoRequestDTO;
import br.com.projeto.projeto.dto.aluno.AlunoResponseDTO;
import br.com.projeto.projeto.service.aluno.IAlunoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AlunoController {

    private final IAlunoService serv;

    @GetMapping("/aluno")
    public ResponseEntity<List<AlunoResponseDTO>> retorna() {
        return ResponseEntity.ok(serv.retornaTudo());
    }

    @GetMapping(value = "/aluno/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<AlunoResponseDTO> retornaPorId(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(serv.retornaPorId(id));
    }

    @PostMapping("/aluno")
    public ResponseEntity<AlunoResponseDTO> cadastrarAluno(@Valid @RequestBody AlunoRequestDTO aluno) {
        AlunoResponseDTO result = serv.cadastrarAluno(aluno);
        return ResponseEntity.ok().body(result);
    }


}
