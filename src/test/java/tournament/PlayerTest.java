package ru.netology.Tournament;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void shouldFindById() {

        Player player1 = new Player(11, "Petya", 10);
        Player player2 = new Player(22, "Kolya", 15);
        Player player3 = new Player(33, "Katya", 10);
        Player player4 = new Player(44, "Misha", 40);


        player1.setId(11);

        int expected = 11;
        int actual = player1.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindByName() {
        Player player1 = new Player(11, "Petya", 10);
        Player player2 = new Player(22, "Kolya", 15);
        Player player3 = new Player(33, "Katya", 10);
        Player player4 = new Player(44, "Misha", 40);


        player2.setName("Kolya");

        String expected = "Kolya";
        String actual = player2.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindByStrength() {
        Player player1 = new Player(11, "Petya", 10);
        Player player2 = new Player(22, "Kolya", 15);
        Player player3 = new Player(33, "Katya", 10);
        Player player4 = new Player(44, "Misha", 40);


        player4.setStrength(40);

        int expected = 40;
        int actual = player4.getStrength();
        Assertions.assertEquals(expected, actual);
    }
}