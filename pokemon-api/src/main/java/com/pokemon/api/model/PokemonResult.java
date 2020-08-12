package com.pokemon.api.model;

public class PokemonResult {

    private int numberOfPokemons;

    public PokemonResult() {
        this.numberOfPokemons = 1;
    }

    public int getNumberOfPokemons() {
        return this.numberOfPokemons;
    }

    public void setNumberOfPokemons(int numberOfPokemons) {
        this.numberOfPokemons = numberOfPokemons;
    }
}
