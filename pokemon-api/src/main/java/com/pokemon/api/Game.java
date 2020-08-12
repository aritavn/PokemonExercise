package com.pokemon.api;

import com.pokemon.api.exceptions.InvalidInputException;
import com.pokemon.api.model.PokemonResult;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class Game {

    private String inputMoves;
    private PokemonResult pokemonResult;
    private Set<Point> positionsPath;

    public Game(String inputMoves) {
        this.inputMoves = inputMoves;
        this.pokemonResult = new PokemonResult();
        this.positionsPath = new HashSet<>();
    }

    public PokemonResult play() throws InvalidInputException {
        char[] moves = inputMoves.toCharArray();
        Point position = new Point(0, 0);
        positionsPath.add(position);

        for (char moveDirection: moves) {
            position = Board.move(position, moveDirection);
            if (position == null) {
                throw new InvalidInputException("Invalid Input.");
            }
            positionsPath.add(position);
        }

        pokemonResult.setNumberOfPokemons(positionsPath.size());
        return pokemonResult;
    }
}