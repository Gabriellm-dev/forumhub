package com.br.glm.forumhub.repository;

import com.br.glm.forumhub.model.Curso;

public interface CursoRepository {
    Curso findByNome(String nomeCurso);
}
