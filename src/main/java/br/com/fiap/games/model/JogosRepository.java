package br.com.fiap.games.model;

import br.com.fiap.games.model.entity.Jogo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogosRepository extends JpaRepository<Jogo, Long> {
    Page<Jogo> findAllByAtivoTrue(Pageable paginacao);
}
