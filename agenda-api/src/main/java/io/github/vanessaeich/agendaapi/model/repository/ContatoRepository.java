package io.github.vanessaeich.agendaapi.model.repository;

import io.github.vanessaeich.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vanessa Eich
 * @created 06/05/2022
 */
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
