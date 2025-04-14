package com.curso.domains.enums;

public enum TipoPokemon {

    AGUA(0, "AGUA"), DRAGAO(1,"DRAGAO"),ELETRICO(2,"ELETRICO"),
    FADA(3,"FADA"),FANTASMA(4,"FANTASMA"),FOGO(5,"FOGO"),
    GELO(6,"GELO"),INSETO(7,"INSETO"),LUTADOR(8,"LUTADOR"),
    NORMAL(9,"NORMAL"),PEDRA(10,"PEDRA"),PLATA(11,"PLANTA"),
    PSIQUICO(12,"PSIQUICO"),SOMBRIO(13,"SOMBRIO"),TERRESTRE(14,"TERRESTRE"),
    VENENOSO(15,"VENENOSO"),VOADOR(16,"VOADOR");

    private Integer id;
    private String classePokemon;

    TipoPokemon(Integer id, String classePokemon) {
        this.id = id;
        this.classePokemon = classePokemon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassePokemon() {
        return classePokemon;
    }

    public void setClassePokemon(String classePokemon) {
        this.classePokemon = classePokemon;
    }

    public static TipoPokemon toEnum(Integer id) {
        if (id == null) return null;
        for(TipoPokemon x : TipoPokemon.values()) {
            if (id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Classe Pokemon não encontrada");
    }
}
