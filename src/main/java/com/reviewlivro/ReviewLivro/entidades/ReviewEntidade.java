package com.reviewlivro.ReviewLivro.entidades;


import jakarta.persistence.*;

@Entity
@Table(name ="review")
public class ReviewEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "conteudo", nullable = false)
    private String conteudo;

    @Column(name = "nota", nullable = false)
    private int nota;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private UsuarioEntidade usuario;

    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
    private LivroEntidade livro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public UsuarioEntidade getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntidade usuario) {
        this.usuario = usuario;
    }

    public LivroEntidade getLivro() {
        return livro;
    }

    public void setLivro(LivroEntidade livro) {
        this.livro = livro;
    }
}
