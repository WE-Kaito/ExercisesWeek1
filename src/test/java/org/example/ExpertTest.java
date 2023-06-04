package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ExpertTest {
    @ParameterizedTest
    @CsvSource({
            "123,6",
            "123456789,45",
            "1234567890,45",
            "12345678901111,49"
    })
    void test_calculateChecksum(long number, int expected){
        int actual = Expert.calculateChecksum(number);
        Assertions.assertEquals(expected, actual);
}

    @ParameterizedTest
    @MethodSource("dataSortNumbers")
    void test_sortNumbers(int[] numbers, int[] expected){
        int[] actual = Expert.sortNumbers(numbers);
        Assertions.assertArrayEquals(expected, actual);
}
    static Stream<Arguments> dataSortNumbers(){
        return Stream.of(
                Arguments.of(new int[]{2,3,4,5,3,2,7,8,4},new int[]{2,2,3,3,4,4,5,7,8}),
                Arguments.of(new int[]{10,3,4,5,3,2,7,8,4},new int[]{2,3,3,4,4,5,7,8,10}),
                Arguments.of(new int[]{3,-10,4,5,3,2,7,8,4},new int[]{-10,2,3,3,4,4,5,7,8})
        );
    }
}
