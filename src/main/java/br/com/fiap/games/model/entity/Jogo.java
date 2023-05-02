package br.com.fiap.games.model.entity;

import br.com.fiap.games.model.dto.DadosAtualizacaoJogo;
import br.com.fiap.games.model.dto.DadosCadastroJogo;
import jakarta.persistence.*;

@Table(name = "jogos")
@Entity(name = "Jogo")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String desenvolvedora;
    private String distribuidora;
    private String idioma;
    private String numeroJogadores;
    private String lancamento;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Embedded
    private Requisitos requisitos;
    private boolean ativo;

    public Jogo() {
    }

    public Jogo (DadosCadastroJogo dados){
        this.ativo = true;
        this.titulo = dados.titulo();
        this.desenvolvedora = dados.desenvolvedora();
        this.distribuidora = dados.distribuidora();
        this.idioma = dados.idioma();
        this.numeroJogadores = dados.numeroJogadores();
        this.lancamento = dados.lancamento();
        this.genero = dados.genero();
        this.requisitos = new Requisitos(dados.requisitos());
    }

    public void atualizarInformacoes(DadosAtualizacaoJogo dados){
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.desenvolvedora() != null){
            this.desenvolvedora = dados.desenvolvedora();
        }
        if(dados.distribuidora() != null){
            this.distribuidora = dados.distribuidora();
        }
        if(dados.idioma() != null){
            this.idioma = dados.idioma();
        }
        if(dados.numeroJogadores() != null){
            this.numeroJogadores = dados.numeroJogadores();
        }
        if(dados.lancamento() != null){
            this.lancamento = dados.lancamento();
        }
        if(dados.genero() != null){
            this.genero = dados.genero();
        }
        if(dados.requisitos() != null){
            this.requisitos.atualizarInformacoes(dados.requisitos());
        }
    }

    public void excluir(){
        this.ativo = false;
    }

    public Long getId() {
        return id;
    }

    public Jogo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Jogo setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public Jogo setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
        return this;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public Jogo setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
        return this;
    }

    public String getIdioma() {
        return idioma;
    }

    public Jogo setIdioma(String idioma) {
        this.idioma = idioma;
        return this;
    }

    public String getNumeroJogadores() {
        return numeroJogadores;
    }

    public Jogo setNumeroJogadores(String numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
        return this;
    }

    public String getLancamento() {
        return lancamento;
    }

    public Jogo setLancamento(String lancamento) {
        this.lancamento = lancamento;
        return this;
    }

    public Genero getGenero() {
        return genero;
    }

    public Jogo setGenero(Genero genero) {
        this.genero = genero;
        return this;
    }

    public Requisitos getRequisitos() {
        return requisitos;
    }

    public Jogo setRequisitos(Requisitos requisitos) {
        this.requisitos = requisitos;
        return this;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public Jogo setAtivo(boolean ativo) {
        this.ativo = ativo;
        return this;
    }
}
