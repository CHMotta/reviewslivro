package com.reviewlivro.ReviewLivro.servico;

import com.reviewlivro.ReviewLivro.repositorio.ReviewRepositorio;
import org.springframework.stereotype.Service;


@Service
public class ReviewServicoImpl implements ReviewServico{

    private final ReviewRepositorio reviewRepositorio;

    public ReviewServicoImpl(ReviewRepositorio reviewRepositorio) {
        this.reviewRepositorio = reviewRepositorio;
    }




}
