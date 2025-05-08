package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameTest {

    @Test

    public void testWinFirstPlayer() {
        Player Rabbit = new Player(1, "Rabbit", 120);
        Player Wolf = new Player(2, "Wolf", 90);
        Game game = new Game();
        game.register(Rabbit);
        game.register(Wolf);

        int actual = game.round("Rabbit", "Wolf");
        int expected = 1;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testWinSecondPlayer() {
        Player Rabbit = new Player(1, "Rabbit", 120);
        Player Bear = new Player(3, "Bear", 500);
        Game game = new Game();
        game.register(Rabbit);
        game.register(Bear);

        int actual = game.round("Rabbit", "Bear");
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void testDrawPlayer() {
        Player Bear = new Player(3, "Bear", 500);
        Player Tiger = new Player(4, "Tiger", 500);
        Game game = new Game();
        game.register(Tiger);
        game.register(Bear);

        int actual = game.round("Tiger", "Bear");
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void testFirstPlayerNoExist() {
        Player Elefant = new Player(5, "Elefant", 400);
        Game game = new Game();
        game.register(Elefant);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Cat", "Elefant"));
    }

    @Test

    public void testSecondPlayerNoExist() {
        Player Elefant = new Player(5, "Elefant", 400);
        Game game = new Game();
        game.register(Elefant);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Elefant", "Cat"));
    }
}
