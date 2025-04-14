package com.curso.repositories;

import com.curso.domains.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    Optional<Pokemon>findByCpfPokemon(String cpfPokemon);
}
