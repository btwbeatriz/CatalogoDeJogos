package br.com.fiap.games.model.entity;

import br.com.fiap.games.model.dto.DadosRequisitos;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class Requisitos {
    private String sistemaOperacional;
    @NotBlank
    private String processador;
    @NotBlank
    private String memoria;
    @NotBlank
    private String placaDeVideo;
    @NotBlank
    private String armazenamento;

    public Requisitos() {
    }

    public Requisitos(DadosRequisitos requisitos){
        this.sistemaOperacional = requisitos.sistemaOperacional();
        this.processador = requisitos.processador();
        this.memoria = requisitos.memoria();
        this.placaDeVideo = requisitos.placaDeVideo();
        this.armazenamento = requisitos.armazenamento();
    }
    public void atualizarInformacoes(DadosRequisitos dados) {
        if(dados.sistemaOperacional() != null){
            this.sistemaOperacional = dados.sistemaOperacional();
        }
        if(dados.processador() != null){
            this.processador = dados.processador();
        }
        if(dados.memoria() != null){
            this.memoria = dados.memoria();
        }
        if(dados.placaDeVideo() != null){
            this.placaDeVideo = dados.placaDeVideo();
        }
        if(dados.armazenamento() != null){
            this.armazenamento = dados.armazenamento();
        }
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public Requisitos setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public String getProcessador() {
        return processador;
    }

    public Requisitos setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public String getMemoria() {
        return memoria;
    }

    public Requisitos setMemoria(String memoria) {
        this.memoria = memoria;
        return this;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public Requisitos setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public Requisitos setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

}
