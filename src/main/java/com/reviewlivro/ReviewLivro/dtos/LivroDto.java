package com.reviewlivro.ReviewLivro.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LivroDto(
        String id, //O ID do Google
        VolumeInfo volumeInfo // Onde os dados reais estão
) {


}
