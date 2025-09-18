package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    public void testAdd(){
        // arrange
        PhoneBook book = new PhoneBook();

        // act
        int result = PhoneBook.add("Andrey", "79781658927");

        // assert
        assertEquals(1, result);
    }
}
