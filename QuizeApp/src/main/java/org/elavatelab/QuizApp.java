package org.elavatelab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    static Scanner sc = new Scanner(System.in);
    static List<Question> questions = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Online Quiz Menu ===");
            System.out.println("1. Add Questions");
            System.out.println("2. Start Quiz");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addQuestion();
                    break;
                case 2:
                    startQuiz();
                    break;
                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 3);
    }

      
    // Function to add a question
    static void addQuestion() {
        System.out.print("Enter question: ");
        String qText = sc.nextLine();

        String[] opts = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter option " + (char) ('A' + i) + ": ");
            opts[i] = (char) ('A' + i) + ". " + sc.nextLine();
        }

        char correct;
        while (true) {
            System.out.print("Enter correct answer (A/B/C/D): ");
            correct = Character.toUpperCase(sc.next().charAt(0));
            if (correct >= 'A' && correct <= 'D') break;
            System.out.println("Invalid option, try again.");
        }
        sc.nextLine(); // clear buffer

        questions.add(new Question(qText, opts, correct));
        System.out.println("✅ Question added successfully!");
    }

    // Function to start quiz
    static void startQuiz() {
        if (questions.isEmpty()) {
            System.out.println("⚠ No questions added yet! Add questions first.");
            return;
        }

        int score = 0;
        Collections.shuffle(questions); // random order

        for (Question q : questions) {
            System.out.println("\n" + q.question);
            for (String opt : q.options) {
                System.out.println(opt);
            }
            System.out.print("Your answer: ");
            char ans = sc.next().charAt(0);

            if (q.isCorrect(ans)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.correctAnswer);
            }
        }
        System.out.println("\n🎯 Quiz Finished! Your score: " + score + "/" + questions.size());
    }
}