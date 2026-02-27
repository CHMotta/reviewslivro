package com.reviewlivro.ReviewLivro.servico;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.reviewlivro.ReviewLivro.dtos.GoogleRespostaDto;
import com.reviewlivro.ReviewLivro.dtos.LivroDto;
import com.reviewlivro.ReviewLivro.repositorio.LivroRepositorio;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class LivroServicoImpl implements LivroServico{

    public LivroServicoImpl(LivroRepositorio livroRepositorio) {
        this.livroRepositorio = livroRepositorio;
    }

    private final LivroRepositorio livroRepositorio;

    @Value("${googleBooksApiKey}")
    private String googleBooksApiKey;



    //falta tratar exceções
    public List<LivroDto> buscarLivroParaReview(String busca) throws IOException, InterruptedException {

        List<LivroDto> listaLivros = new ArrayList<>();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q=" + busca.replace(" ", "+") + "&key=" + googleBooksApiKey)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();

            GoogleRespostaDto googleDados = mapper.readValue(response.body(), GoogleRespostaDto.class);
            listaLivros = googleDados.items();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaLivros;
    }
}
