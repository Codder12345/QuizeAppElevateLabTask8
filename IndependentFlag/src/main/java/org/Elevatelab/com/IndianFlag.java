package org.Elevatelab.com;

public class IndianFlag {
    public static void main(String[] args) {
        String saffron = "\u001B[38;5;208m"; // orange
        String white = "\u001B[37m";
        String green = "\u001B[32m";
        String reset = "\u001B[0m";

        for (int i = 0; i < 5; i++) System.out.println(saffron + "##########################" + reset);
        for (int i = 0; i < 3; i++) System.out.println(white + "###########\u001B[34m Ashoka Chakra \u001B[37m###########" + reset);
        for (int i = 0; i < 5; i++) System.out.println(green + "##########################" + reset);

        System.out.println("\n\u001B[33mHappy Independence Day! 🇮🇳" + reset);
    }
}

