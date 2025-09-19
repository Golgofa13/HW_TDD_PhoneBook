package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    private PhoneBook book;

    @BeforeEach
    public void SetUp() {
        book = new PhoneBook();
    }

    @Test
    public void testAdd() {
        // act
        int result = book.add("Andrey", "+79781658927");

        // assert
        assertEquals(1, result);
    }

    @Test
    public void testMultiAdd() {
        // act
        int firstAdd = book.add("Petya", "+79781658822");
        int secondAdd = book.add("Sveta", "+79781153545");
        int thirdAdd = book.add("Kunyslav", "+7966996696");
        int result = book.add("Sergay", "+797822566568");

        // assert
        assertEquals(4, result);
    }

    @Test
    public void testFindByNumber() {
        // act
        int firstAdd = book.add("Roland", "+79781123553");
        int secondAdd = book.add("Andrey", "+79781758443");
        int thirdAdd = book.add("Dio", "+79827730397");
        String result = book.findByNumber("+79781758443");

        // assert
        assertEquals("Andrey", result);
    }

    @Test
    void testFindByName() {
        // act
        int firstAdd = book.add("Roland", "+79781123553");
        int secondAdd = book.add("Andrey", "+79781758443");
        int thirdAdd = book.add("Dio", "+79827730397");
        String result = book.findByNumber("Andrey");

        // assert
        assertEquals("+79781758443", result);
    }
}
