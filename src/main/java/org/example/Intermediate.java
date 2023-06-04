package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Intermediate {

    public static void main(String[] args) {
        String[] zeroToTen = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        System.out.println(Arrays.toString(zeroToTen)); // Aufgabe1
        System.out.println(Arrays.toString(oneToHundred())); //Aufgabe 3 Test!

        String[] userInputs = showAndSaveUserInputs(5); //Aufgabe 4 Test!
        System.out.println("Saved Strings: " + Arrays.toString(userInputs));
    }

    public static String oneDigitNumberToWord(int number){ //Aufgabe 2
        switch(number){
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "wrong input";
        }
    }

    public static String[] oneToHundred(){
        String[] oneToHundred = new String[100];

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                oneToHundred[i-1] = "#$" + i;
            }
            else if (i % 3 == 0){
                oneToHundred[i-1] = "#" + i;
            }
            else if (i % 5 == 0){
                oneToHundred[i-1] = "$" + i;
            }
            else {
                oneToHundred[i-1] = Integer.toString(i);
            }
        }
        return oneToHundred;
    }

    public static String[] showAndSaveUserInputs(int arrayLength){
        String[] userInputs = new String[arrayLength];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + arrayLength + " words to save:");
        for (int i = 0; i < arrayLength; i++){
            String input = scanner.nextLine();
            userInputs[i] = input;
            System.out.println("\n" + input);
        }
        return userInputs;
    }

}





