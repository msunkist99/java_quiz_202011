package main;

import java.util.ArrayList;
import java.util.Scanner;

public class SingleAnswerQuestion extends Question {
    private String userAnswer = null;

    //constructor
    public SingleAnswerQuestion(String text, String type, ArrayList<String> correctAnswers) {
        super(text, type, correctAnswers);

    }

    @Override
    public boolean CheckAnswers() {
        String correctAnswer = this.getCorrectAnswers().get(0);

        if (correctAnswer.equals(userAnswer)) {
            return true;
        }
        return false;
    }

    @Override
    public void GetUserAnswers() {
        Scanner input = new Scanner(System.in);
        userAnswer = input.next().toUpperCase();
    }
}
