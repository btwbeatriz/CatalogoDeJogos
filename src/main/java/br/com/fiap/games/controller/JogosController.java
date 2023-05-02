package br.com.fiap.games.controller;

import br.com.fiap.games.model.JogosRepository;
import br.com.fiap.games.model.dto.DadosAtualizacaoJogo;
import br.com.fiap.games.model.dto.DadosCadastroJogo;
import br.com.fiap.games.model.dto.DadosListagemJogo;
import br.com.fiap.games.model.entity.Jogo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogos")
public class JogosController {

    @Autowired
    private JogosRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroJogo dados){
        repository.save(new Jogo(dados));
    }

    @GetMapping
    public Page<DadosListagemJogo> listar(
            @PageableDefault(size = 5, sort = {"titulo"})Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemJogo :: new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoJogo dados){
        Jogo jogo = new Jogo();
        jogo = repository.getReferenceById(dados.id());
        jogo.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        Jogo jogo = new Jogo();
        jogo = repository.getReferenceById(id);
        jogo.excluir();
    }
}
