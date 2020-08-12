package com.pokemon.api;

import com.pokemon.api.exceptions.InvalidInputException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PokemonApiApplicationTests {

	@Test
	void testScenario1() throws InvalidInputException {
		String input = "E";
		Game game = new Game(input);
		assertEquals(2, game.play().getNumberOfPokemons());
	}

	@Test
	void testScenario2() throws InvalidInputException {
		String input = "NESO";
		Game game = new Game(input);
		assertEquals(4, game.play().getNumberOfPokemons());
	}

	@Test
	void testScenario3() throws InvalidInputException {
		String input = "NSNSNSNSNS";
		Game game = new Game(input);
		assertEquals(2, game.play().getNumberOfPokemons());
	}

	@Test
	void testScenario4() throws InvalidInputException {
		String input = "NOSNEOSENSOENSEONSEON";
		Game game = new Game(input);
		assertEquals(5, game.play().getNumberOfPokemons());
	}

	@Test
	void testScenario5() throws InvalidInputException {
		String input = "NOENOOOOOSSSSSEEEENNNOOOOS";
		Game game = new Game(input);
		assertEquals(24, game.play().getNumberOfPokemons());
	}

	@Test
	void testScenario6() throws InvalidInputException {
		String input = "ESSEENNOONOS";
		Game game = new Game(input);
		assertEquals(11, game.play().getNumberOfPokemons());
	}
}
