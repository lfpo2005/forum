package com.lfcode.forum.repository;

import com.lfcode.forum.model.Curso;
import com.lfcode.forum.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
