package br.com.frozen.forum.controller;

import br.com.frozen.forum.model.Curso;
import br.com.frozen.forum.model.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public List<Topico> lista(){
        Topico topico = new Topico("Dúvida", "Não sei de nada", new Curso("Spring", "Programação"));

        return Arrays.asList(topico, topico, topico);

    }
}
