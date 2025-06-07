package med.voll.api.endereco;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.processing.Pattern;

public record DadosEndereco(
        @NotNull
        String logradouro,
        @NotNull
        String bairro,
        @NotNull
        @Pattern
        String cep,
        @NotNull
        String cidade,
        @NotNull
        String uf,
        String complemento,
        String numero) {
}