package br.com.fiap.catalogo.model.dto;

import br.com.fiap.catalogo.model.entity.Genero;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoJogo(
        @NotNull
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String desenvolvedora,
        String distribuidora,
        @NotBlank
        String idioma,
        @NotBlank
        String numeroJogadores,
        @NotBlank
        @Pattern(regexp = "\\d{4}")
        String lancamento,
        @NotNull
        Genero genero,
        @NotNull @Valid
        DadosRequisitos requisitos
) {
}
