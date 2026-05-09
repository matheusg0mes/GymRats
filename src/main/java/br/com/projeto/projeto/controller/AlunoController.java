package br.com.projeto.projeto.controller;

import br.com.projeto.projeto.dto.aluno.AlunoAtualizacaoDto;
import br.com.projeto.projeto.dto.aluno.AlunoRequestComIdDTO;
import br.com.projeto.projeto.dto.aluno.AlunoRequestDTO;
import br.com.projeto.projeto.dto.aluno.AlunoResponseDTO;
import br.com.projeto.projeto.service.aluno.IAlunoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private final IAlunoService serv;

    @GetMapping()
    public ResponseEntity<List<AlunoResponseDTO>> retorna() {
        return ResponseEntity.ok(serv.retornaTudo());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoResponseDTO> retornaPorId(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(serv.retornaPorId(id));
    }

    @PostMapping()
    public ResponseEntity<AlunoResponseDTO> cadastrarAluno(@Valid @RequestBody AlunoRequestDTO aluno) {;
        return ResponseEntity.status(HttpStatus.CREATED).body(serv.cadastrarAluno(aluno));
    }

    @PutMapping()
    public ResponseEntity<AlunoAtualizacaoDto> atualizarAluno(@Valid @RequestBody AlunoRequestComIdDTO aluno){
        return ResponseEntity.status(HttpStatus.OK).body(serv.atualizarAluno(aluno));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletaAluno(@PathVariable Integer id){
        serv.deletaAluno(id);
        return ResponseEntity.ok("Aluno Removido com sucesso");
    }

}
