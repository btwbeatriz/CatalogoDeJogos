package br.com.fiap.catalogo.model.dto;


import br.com.fiap.catalogo.model.entity.Genero;
import br.com.fiap.catalogo.model.entity.Jogo;

public record DadosListagemJogo(
        Long id,
        String titulo,
        String desenvolvedora,
        String numeroJogadores,
        Genero genero,
        String armazenamento
) {
    public DadosListagemJogo (Jogo jogo){
        this(
               jogo.getId(),
               jogo.getTitulo(),
                jogo.getDesenvolvedora(),
                jogo.getNumeroJogadores(),
                jogo.getGenero(),
                jogo.getRequisitos().getArmazenamento()

        );
    }
}
