package br.com.fiap.games.model.dto;

import br.com.fiap.games.model.entity.Genero;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoJogo(
        @NotNull
        Long id,
        String titulo,
        String desenvolvedora,
        String distribuidora,
        String idioma,
        @NotNull
        @Pattern(regexp = "\\d{1,4}")
        String numeroJogadores,
        @NotBlank
        @Pattern(regexp = "\\d{4}")
        String lancamento,
        Genero genero,
        DadosRequisitos requisitos
) {
}
