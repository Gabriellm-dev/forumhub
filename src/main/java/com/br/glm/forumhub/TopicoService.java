package com.br.glm.forumhub;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    public Topico criarTopico(Topico topico) {
        return topicoRepository.save(topico);
    }

    public List<Topico> listarTopicos() {
        return topicoRepository.findAll();
    }

    public Optional<Topico> buscarTopicoPorId(Long id) {
        return topicoRepository.findById(id);
    }

    public Topico atualizarTopico(Long id, Topico topicoAtualizado) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico não encontrado"));
        topico.setTitulo(topicoAtualizado.getTitulo());
        topico.setMensagem(topicoAtualizado.getMensagem());
        topico.setEstado(topicoAtualizado.getEstado());
        topico.setAutor(topicoAtualizado.getAutor());
        topico.setCurso(topicoAtualizado.getCurso());
        return topicoRepository.save(topico);
    }

    public void deletarTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}
