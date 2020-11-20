package main;

import java.util.ArrayList;
import java.util.Scanner;


public class FreeFormTextAnswerQuestion extends Question {
    private String userAnswer = null;
    private int maxTextLength;

    //constructor
    public FreeFormTextAnswerQuestion(String text, String type, ArrayList<String>correctAnswers, int maxTextLength) {
        super(text, type, correctAnswers);
        this.maxTextLength = maxTextLength;
    }

    @Override
    public boolean CheckAnswers() {
        return false;
    }

    @Override
    public void GetUserAnswers() {
        Scanner input = new Scanner(System.in);
        userAnswer = input.next();
    }
}
