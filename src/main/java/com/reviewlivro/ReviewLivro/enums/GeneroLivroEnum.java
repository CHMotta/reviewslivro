package com.reviewlivro.ReviewLivro.enums;

public enum GeneroLivroEnum {
    // FICÇÃO
    FANTASIA("Fantasia"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    DISTOPIA("Distopia"),
    MISTERIO("Mistério"),
    SUSPENSE("Suspense"),
    THRILLER("Thriller"),
    TERROR("Terror"),
    ROMANCE("Romance"),
    FICCAO_HISTORICA("Ficção Histórica"),
    AVENTURA("Aventura"),
    CONTO("Conto"),
    LITERATURA_CLASSICA("Literatura Clássica"),
    LITERATURA_CONTEMPORANEA("Literatura Contemporânea"),

    // NÃO-FICÇÃO
    BIOGRAFIA("Biografia"),
    MEMORIAS("Memórias"),
    AUTO_AJUDA("Autoajuda"),
    HISTORIA("História"),
    FILOSOFIA("Filosofia"),
    SOCIOLOGIA("Sociologia"),
    PSICOLOGIA("Psicologia"),
    CIENCIA("Ciência"),
    RELIGIAO_ESPIRITUALIDADE("Religião e Espiritualidade"),
    TRUE_CRIME("True Crime"),
    GASTRONOMIA("Gastronomia"),

    // TÉCNICO E PROFISSIONAL
    COMPUTACAO_TECNOLOGIA("Computação e Tecnologia"),
    NEGOCIOS_ECONOMIA("Negócios e Economia"),
    DIREITO("Direito"),
    MEDICINA_SAUDE("Medicina e Saúde"),
    EDUCACAO("Educação"),

    // INFANTO-JUVENIL
    INFANTIL("Infantil"),
    YOUNG_ADULT("Jovem Adulto (YA)"),
    HQS_MANGAS("HQs e Mangás"),

    // OUTROS
    OUTROS("Outros");

    private final String descricao;

    GeneroLivroEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
