package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;
import org.antlr.v4.runtime.misc.*;
import org.hibernate.annotations.processing.Pattern;

public record DadosCadastroMedico(
        @NotNull
        String nome,
        @NotNull
        @Email
        String email,

        @NotNull
        String telefone,
        @NotNull
        @Pattern
        String crm,
        @NotNull
        Especialidade especialidade,

        @NotNull @Valid DadosEndereco endereco) {
}