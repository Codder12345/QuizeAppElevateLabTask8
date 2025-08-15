package org.elavatelab;

class Question {
    String question;
    String[] options;
    char correctAnswer;

    Question(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = Character.toUpperCase(correctAnswer);
    }

    boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == correctAnswer;
    }
}
