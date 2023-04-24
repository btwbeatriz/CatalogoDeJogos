package br.com.fiap.catalogo.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosRequisitos(
        String sistemaOperacional,
        @NotBlank
        String processador,
        @NotBlank
        String memoria,
        @NotBlank
        String placaDeVideo,
        @NotBlank
        String armazenamento
) {
}
