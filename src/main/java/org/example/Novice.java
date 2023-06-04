package org.example;
import java.util.Scanner;

public class Novice {

    public static void main(String[] args) {
        printName("Kaito"); // Aufgabe 1
        printNames("Gammamon"); // Aufgabe 2
        greetUser();
    }

    public static void printName(String name){
        System.out.println("The given name is " + name);
    }

    public static void printNames(String name){
        for (int i=1; i<=5; i++){
            System.out.println(name);
        }
    }

    public static boolean isNumberGreaterThan0(int number){
        return number > 0;
    }

    public static int calculateSquare(int number){
        return number * number;
    }

    public static void greetUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib deinen Namen ein und drücke ENTER:");
        System.out.println("\n" + "Willkommen zurück, " + scanner.nextLine());
    }



}