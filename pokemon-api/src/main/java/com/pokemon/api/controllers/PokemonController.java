package com.pokemon.api.controllers;

import com.pokemon.api.Game;
import com.pokemon.api.exceptions.InvalidInputException;
import com.pokemon.api.model.ErrorHandler;
import com.pokemon.api.model.PokemonResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PokemonController {

    @GetMapping("/pokemon")
    public ResponseEntity play(@RequestParam(value = "moves", defaultValue = "") String moves) {
        Game game = new Game(moves);
        try {
            PokemonResult pokemonResult = game.play();
            return new ResponseEntity<PokemonResult>(pokemonResult, HttpStatus.OK);
        } catch (InvalidInputException e) {
            ErrorHandler error = new ErrorHandler();
            error.setErrorMessage(e.getMessage());
            return new ResponseEntity<ErrorHandler>(error, HttpStatus.BAD_REQUEST);
        }
    }
}
