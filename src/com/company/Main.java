package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String myString;
        final int NUM = 5;

        String word;
        word = "How old are you?";

         myString = word + NUM;
        System.out.println(myString);

        if (NUM < 0) {
            System.out.println("You save -");
        } else if (NUM > 0){
            System.out.println("You save +");
        } else {
            System.out.println("you save 0");
        }
        System.out.println("Your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }

}
