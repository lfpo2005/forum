package com.lfcode.forum.repository;

import com.lfcode.forum.model.Curso;
import com.lfcode.forum.model.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespostaRepository extends JpaRepository<Resposta, Long> {
}
