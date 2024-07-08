package com.br.glm.forumhub.dto;

import com.br.glm.forumhub.model.Curso;
import com.br.glm.forumhub.model.Topico;
import com.br.glm.forumhub.repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TopicoForm {

    private String titulo;
    private String mensagem;
    private String nomeCurso;


    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
