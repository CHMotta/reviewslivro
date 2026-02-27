package com.reviewlivro.ReviewLivro.dtos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public record VolumeInfo(
        @JsonProperty("title")
        String titulo,

        @JsonProperty("subtitle")
        String subtitulo,

        @JsonProperty("authors")
        List<String> autor,

        ImageLinks imageLinks,

        @JsonProperty("categories")
        List<String> genero
) {


}
