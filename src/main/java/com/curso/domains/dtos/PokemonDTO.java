package com.curso.domains.dtos;

import com.curso.domains.Pokemon;
import com.curso.domains.enums.NivelPokemon;
import com.curso.domains.enums.TipoPokemon;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class PokemonDTO {



    private Integer id;

    @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode estar vazio")
    private String nome;


    private int tipoPokemon;

    private int nivelPokemon;

    @NotNull(message = "O campo pontos De Vida do Pokemon não pode ser nulo")
    private int pontosDeVida;
    @NotNull(message = "O campo ataque do Pokemon não pode ser nulo")
    private int ataque;
    @NotNull(message = "O campo defesa do Pokemon não pode ser nulo")
    private int defesa;
    @NotNull(message = "O campo velocidade do Pokemon não pode ser nulo")
    private int velocidade;
    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate dataCaptura;
    @NotNull(message = "O campo CPF não pode ser nulo")
     @NotBlank(message = "O campo CPF não pode ser vazio")
    @Column(unique = true)
    protected String cpfPokemon;



    public PokemonDTO() {
    }

    public PokemonDTO( Pokemon pokemon ) {
        this.id = pokemon.getId();
        this.nome = pokemon.getNome();
        this.tipoPokemon = pokemon.getTipoPokemon().getId();
        this.nivelPokemon = pokemon.getNivelPokemon().getId();
        this.pontosDeVida = pokemon.getPontosDeVida() ;
        this.ataque = pokemon.getAtaque();
        this.defesa = pokemon.getDefesa();
        this.velocidade = pokemon.getVelocidade();
        this.dataCaptura = pokemon.getDataCaptura();
        this.cpfPokemon = pokemon.getCpfPokemon();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode estar vazio") String getNome() {
        return nome;
    }

    public void setNome( @NotNull(message = "O campo nome não pode ser nulo")
                         @NotBlank(message = "O campo nome não pode estar vazio") String nome) {
        this.nome = nome;
    }

    public int getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(int tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public int getNivelPokemon() {
        return nivelPokemon;
    }

    public void setNivelPokemon(int nivelPokemon) {
        this.nivelPokemon = nivelPokemon;
    }

    public @NotNull(message = "O campo pontos De Vida do Pokemon não pode ser nulo") int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida  (@NotNull(message = "O campo pontos De Vida do Pokemon não pode ser nulo") int  pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public @NotNull(message = "O campo ataque do Pokemon não pode ser nulo") int  getAtaque() {
        return ataque;
    }

    public void setAtaque(@NotNull(message = "O campo ataque do Pokemon não pode ser nulo") int  ataque) {
        this.ataque = ataque;
    }

    public  @NotNull(message = "O campo defesa do Pokemon não pode ser nulo") int  getDefesa() {
        return defesa;
    }

    public void setDefesa( @NotNull(message = "O campo defesa do Pokemon não pode ser nulo")int  defesa) {
        this.defesa = defesa;
    }

    public @NotNull(message = "O campo velocidade do Pokemon não pode ser nulo") int  getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(@NotNull(message = "O campo velocidade do Pokemon não pode ser nulo") int  velocidade) {
        this.velocidade = velocidade;
    }

    public LocalDate getDataCaptura() {
        return dataCaptura;
    }

    public void setDataCaptura(LocalDate dataCaptura) {
        this.dataCaptura = dataCaptura;
    }

    public String getCpfPokemon() {
        return cpfPokemon;
    }

    public void setCpfPokemon(String cpfPokemon) {
        this.cpfPokemon = cpfPokemon;
    }
}
