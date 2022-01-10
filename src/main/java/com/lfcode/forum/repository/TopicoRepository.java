package com.lfcode.forum.repository;

import com.lfcode.forum.model.Curso;
import com.lfcode.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
