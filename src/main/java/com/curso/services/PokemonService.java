package com.curso.services;

import com.curso.domains.Pokemon;
import com.curso.domains.dtos.PokemonDTO;
import com.curso.repositories.PokemonRepository;
import com.curso.services.exceptions.DataIntegrityViolationException;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PokemonService {
    @Autowired
    private PokemonRepository pokemonRepo;


    public List<PokemonDTO> findAll() {
        return pokemonRepo.findAll().stream().
                map(obj -> new PokemonDTO(obj)).
                collect(Collectors.toList());
    }

    public Pokemon findById(Integer id) {
        Optional<Pokemon> obj = pokemonRepo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(Pokemon.class,"Pokemon não encontrado! Id: " + id));
    }
    public Pokemon findByCpfPokemon(String cpfPokemon) {
        Optional<Pokemon> obj = pokemonRepo.findByCpfPokemon(cpfPokemon);
        return obj.orElseThrow(() -> new ObjectNotFoundException(Pokemon.class,"Pokemon não encontrado! CPF:" + cpfPokemon));
    }


    public Pokemon create(PokemonDTO objDto){
        objDto.setId (null);
        validaCpfPokemon(objDto);
        Pokemon newObj=new Pokemon(objDto);
        return pokemonRepo.save(newObj);
    }


    public Pokemon update(Integer id, PokemonDTO objDto) {
        objDto.setId (id);
        Pokemon oldObj=findById(id);
        validaCpfPokemon(objDto);
        oldObj=new Pokemon(objDto);
        return pokemonRepo.save(oldObj);
    }
    public void delete(Integer id) {
        Pokemon obj=findById(id);
        pokemonRepo.delete(obj);
    }
    private void validaCpfPokemon(PokemonDTO objDto) {
        Optional<Pokemon> obj = pokemonRepo.findByCpfPokemon(objDto.getCpfPokemon());
        if (obj.isPresent() && obj.get().getId() != objDto.getId()) {
            throw  new DataIntegrityViolationException("CPF já cadastrado no sistema!");
        }


    }
}
