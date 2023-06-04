package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IntermediateTest {

    @ParameterizedTest
    @CsvSource({
            "0,zero",
            "1,one",
            "2,two",
            "3,three",
            "4,four",
            "5,five",
            "6,six",
            "7,seven",
            "8,eight",
            "9,nine",
            "-5,wrong input",
            "11,wrong input"
    })
    void test_oneDigitNumberToWord(int number, String expected){
        Assertions.assertEquals(expected, Intermediate.oneDigitNumberToWord(number));
    }


}
