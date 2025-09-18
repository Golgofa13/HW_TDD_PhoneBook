package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    private PhoneBook book;
    @BeforeEach
    public void SetUp (){
        book = new PhoneBook();
    }
    @Test
    public void testAdd(){
        // act
        int result = book.add("Andrey", "+79781658927");

        // assert
        assertEquals(1, result);
    }

    @Test
    public void testMultiAdd(){
       // act
        int firstAdd = book.add("Petya", "+79781658822");
        int secondAdd = book.add("Sveta", "+79781153545");
        int thirdAdd = book.add("Kunyslav","+7966996696");
        int result = book.add("Sergay", "+797822566568");

        // assert
        assertEquals(4,result);
    }
}
