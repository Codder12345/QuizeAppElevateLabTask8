package org.Elevatelab.com;

import java.util.Scanner;

public class IndependenceDayQuiz {
    public static void main(String[] args) {
        String[] questions = {
            "Who is the Father of the Nation? \nA) Mahatma Gandhi  B) Nehru  C) Bhagat Singh",
            "When did India get independence? \nA) 1945  B) 1947  C) 1950",
            "What is the national anthem of India? \nA) Vande Mataram  B) Jana Gana Mana  C) Sare Jahan Se Achha"
        };
        char[] answers = {'A', 'B', 'B'};

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("🇮🇳 Welcome to Independence Day Quiz! 🇮🇳\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            char userAns = Character.toUpperCase(sc.next().charAt(0));
            if (userAns == answers[i]) score++;
        }

        System.out.println("\nYour Score: " + score + "/" + questions.length);
        System.out.println(score == questions.length ? "Jai Hind! You are a true patriot!" : "Keep learning about our history!");
        sc.close();
    }
}

