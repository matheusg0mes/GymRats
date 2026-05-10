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
public class AlunoRequestDTO {


    @NotBlank(message = "nome não pode ser vazio")
    @Size(min = 2, max = 50, message = "Tamnaho inadequado")
    private String nome;

    @NotBlank(message = "Email não pode ser vazio")
    @Email(message = "email precisa ser um formato valido")
    private String email;

    @NotBlank(message = "Telefone não pode ser vazio")
    @Size(min = 2, max = 50, message = "Telefone inadequado")
    private String telefone;

    @NotNull(message = "Precisa ser ativo ou inativo")
    private Boolean ativo;

}
