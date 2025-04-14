package com.curso.domains.enums;

public enum NivelPokemon {
    INICIANTE(0,"INICIANTE"),INTERMEDIARIO(1,"INTERMEDIARIO"),
    AVANCADO(2,"AVANCADO"),LENDARIO(3,"LENDARIO");

    private int id;
    private String nivel;

    NivelPokemon(int id, String nivel) {
        this.id = id;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public static NivelPokemon toEnum(Integer id) {
        if (id == null) return null;
        for(NivelPokemon y : NivelPokemon.values()) {
            if (id.equals(y.getId())) {
                return y;
            }
        }
        throw new IllegalArgumentException("Nivel do Pokemon não encontrado");
    }
}
