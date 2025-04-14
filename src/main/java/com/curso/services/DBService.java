package com.curso.services;

import com.curso.domains.Pokemon;
import com.curso.domains.enums.NivelPokemon;
import com.curso.domains.enums.TipoPokemon;
import com.curso.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DBService {
    @Autowired
    private PokemonRepository pokemonRepo;

    public void initDB() {



        Pokemon pokemon01 = new Pokemon(null,"Pikachu", TipoPokemon.ELETRICO, NivelPokemon.INICIANTE,
                100,15,14,20, LocalDate.now(),"50147339804");
        Pokemon pokemon02 = new Pokemon(null,"Chalizard", TipoPokemon.FOGO, NivelPokemon.AVANCADO,
                100,75,70,80, LocalDate.now(),"47895647825");
        Pokemon pokemon03 = new Pokemon(null,"Mewtwo", TipoPokemon.PSIQUICO, NivelPokemon.LENDARIO,
                100,99,98,90, LocalDate.now(),"56984789632");
        Pokemon pokemon04 = new Pokemon(null,"Squirtle", TipoPokemon.AGUA, NivelPokemon.INICIANTE,
                100,14,10,15, LocalDate.now(),"48965412304");
        Pokemon pokemon05 = new Pokemon(null,"Lapras", TipoPokemon.GELO, NivelPokemon.INTERMEDIARIO,
                100,55,60,50, LocalDate.now(),"36984869525");

        pokemonRepo.save(pokemon01);
        pokemonRepo.save(pokemon02);
        pokemonRepo.save(pokemon03);
        pokemonRepo.save(pokemon04);
        pokemonRepo.save(pokemon05);
    }
}