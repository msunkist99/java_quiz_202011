package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleAnswerQuestion extends Question {

    private ArrayList<String> userAnswers = new ArrayList<>();

    //constructor
    public MultipleAnswerQuestion(String text, String type, ArrayList<String> correctAnswers){
        super(text, type, correctAnswers);
    }

    public void setUserAnswers(ArrayList<String> userAnswers) {
        this.userAnswers = userAnswers;
    }

    @Override
    public boolean CheckAnswers() {
        ArrayList<String> correctAnswers = this.getCorrectAnswers();

        for (String userAnswer : userAnswers){
            if (!correctAnswers.contains(userAnswer)) {
                return false;
            }
        }

        for (String correctAnswer : correctAnswers) {
            if (!userAnswers.contains(correctAnswer)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void GetUserAnswers() {
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        do {
            userAnswers.add(answer.toUpperCase());
            answer = input.nextLine();
        } while (!answer.equals("") );
    }
}
