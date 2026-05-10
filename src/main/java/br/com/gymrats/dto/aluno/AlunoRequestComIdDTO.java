package br.com.gymrats.dto.aluno;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AlunoRequestComIdDTO {

    @NotNull(message = "precisa do id")
    private Integer idaluno;

    @NotBlank(message = "Nome nao pode ser vazio")
    @Size(min = 2, max = 50, message = "Tamnaho inadequado")
    private String nome;

    @NotBlank(message = "Email nao pode ser vazio")
    @Email(message = "Precisa ser um email valido")
    private String email;

    @NotBlank(message = "Telefone não pode ser vazio")
    @Size(min = 2, max = 15, message = "numero inadequado")
    private String telefone;

    @NotNull(message = "Precisa ser ativo ou inativo")
    private Boolean ativo;
}
