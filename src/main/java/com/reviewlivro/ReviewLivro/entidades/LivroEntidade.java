package com.reviewlivro.ReviewLivro.entidades;


import com.reviewlivro.ReviewLivro.enums.GeneroLivroEnum;
import com.reviewlivro.ReviewLivro.enums.StatusReviewsEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "livro")
public class LivroEntidade {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "titulo", nullable = false)
    private String titulo;


    @Column(name = "autor_list", nullable = false)
    private String autor;

    @Column(name = "subtitulo")
    private String subtitulo;


    @Column(name = "thumbnail", nullable = false)
    private String thumbnail;

    @Column(name = "sinopse", nullable = false)
    private String sinopse;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero", nullable = false)
    private GeneroLivroEnum genero;

    @Column(name = "statussugestao", nullable = false)
    private StatusReviewsEnum statusReview;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public GeneroLivroEnum getGenero() {
        return genero;
    }

    public void setGenero(GeneroLivroEnum genero) {
        this.genero = genero;
    }

    public StatusReviewsEnum getStatusReview() {
        return statusReview;
    }

    public void setStatusReview(StatusReviewsEnum statusReview) {
        this.statusReview = statusReview;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }
}

