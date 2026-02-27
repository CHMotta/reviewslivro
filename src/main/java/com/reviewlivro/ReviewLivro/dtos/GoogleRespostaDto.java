package com.reviewlivro.ReviewLivro.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GoogleRespostaDto(
        List<LivroDto> items
) {
}
