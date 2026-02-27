package com.reviewlivro.ReviewLivro.servico;

import com.reviewlivro.ReviewLivro.dtos.LivroDto;
import com.reviewlivro.ReviewLivro.dtos.VolumeInfo;

import java.io.IOException;
import java.util.List;

public interface LivroServico {

       List<LivroDto> buscarLivroParaReview(String busca) throws IOException, InterruptedException;

}
