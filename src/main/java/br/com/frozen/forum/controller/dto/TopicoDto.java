package br.com.frozen.forum.controller.dto;

import br.com.frozen.forum.model.Topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicoDto {
    private Long id;
    private String titulo;
    private String messagem;
    private LocalDateTime dataCricao;

    public TopicoDto(Topico topico){
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.messagem = topico.getMensagem();
        this.dataCricao = topico.getDataCriacao();
    }

    public static List<TopicoDto> converter(List<Topico> topicos) {
        return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMessagem() {
        return messagem;
    }

    public LocalDateTime getDataCricao() {
        return dataCricao;
    }

}
