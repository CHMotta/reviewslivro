package com.reviewlivro.ReviewLivro.controlador;


import com.reviewlivro.ReviewLivro.dtos.LivroDto;
import com.reviewlivro.ReviewLivro.servico.LivroServico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/livros")
public class LivroControlador {

    private final LivroServico livroServico;

    public LivroControlador(LivroServico livroServico){
        this.livroServico = livroServico;
    }

    //busca para criação da review
    @GetMapping("busca")
    public List<LivroDto> buscarLivroReview(String busca) throws IOException, InterruptedException {
        return livroServico.buscarLivroParaReview(busca);
    }
}
