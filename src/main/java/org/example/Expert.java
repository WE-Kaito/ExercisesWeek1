package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Expert {

    public static void main(String[] args) {
        inputReverse(); // Aufgabe 1 Test!

        int[] testArray = {6, 2, 8, 3, 9, 6};
        System.out.println(Arrays.toString(sortNumbers(testArray)));

        System.out.println(Arrays.toString("Gammamon, likes his, chocolate".split(","))); // Aufgabe 3

        System.out.println(calculateChecksum(12345));
    }

    public static String reverseString(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public static void inputReverse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to reverse and press ENTER:");
        String input = scanner.nextLine();
        System.out.println(reverseString(input));
    }

    public static int[] sortNumbers(int[] unsortedNumbers){
        for (int i=0; i<unsortedNumbers.length -1; i++){
            for (int j=0; j<unsortedNumbers.length -1; j++) {
                if (unsortedNumbers[j] > unsortedNumbers[j + 1]) {
                    int savedNum = unsortedNumbers[j];
                    unsortedNumbers[j] = unsortedNumbers[j + 1];
                    unsortedNumbers[j + 1] = savedNum;
                }
            }
        }
        return unsortedNumbers;
    }

    public static int calculateChecksum(long number){
        String numberString = String.valueOf(number);
        char[] numbers = numberString.toCharArray();
        int checksum = 0;
        for (int i = 0; i < numbers.length; i++){
            int num = Character.getNumericValue(numbers[i]);
            checksum += num;
        }
        return checksum;
    }
}
