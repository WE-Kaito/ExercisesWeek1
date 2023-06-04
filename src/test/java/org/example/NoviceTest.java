package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NoviceTest {
    @ParameterizedTest
    @CsvSource({
        "1,true",
        "-1000,false",
        "235,true"
    })
    void test_isNumberGreaterThan0(int number, boolean expected){
    Assertions.assertEquals(expected, Novice.isNumberGreaterThan0(number));
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "2,4",
            "4,16",
            "-4,16"
    })
    void test_calculateSquare(int number, int expected){
        Assertions.assertEquals(expected, Novice.calculateSquare(number));
    }

}