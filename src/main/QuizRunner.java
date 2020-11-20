package main;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args){
        Quiz quiz = BuildQuizQuestions();

        quiz.runQuiz();
    }

    private static Quiz BuildQuizQuestions(){
        Quiz quiz = new Quiz();
        ArrayList<String> correctAnswers = new ArrayList<>();

        //Main.Question 1
        correctAnswers = new ArrayList<>();
        correctAnswers.add("B");
        correctAnswers.add("c");
        correctAnswers.add("d");
        correctAnswers.add("e");
        correctAnswers.add("F");
        correctAnswers.add("g");

        quiz.addQuestion("Which are some St. Louis sports teams\n" +
                              "A. Rams\n" +
                              "B. Cardinals\n" +
                              "C. Browns\n" +
                              "D. Blues\n" +
                              "E. Battle Hawks\n" +
                              "F. City SC\n" +
                              "G. Hawks\n",
                         "MultipleAnswerQuestion",
                              correctAnswers);


        //Main.Question 2
        correctAnswers = new ArrayList<>();
        correctAnswers.add("true");
        quiz.addQuestion("Is St Louis the greatest baseball town?\n" +
                        "True or False",
                "SingleAnswerQuestion",
                correctAnswers );

        //Main.Question 3
        correctAnswers = new ArrayList<>();
        correctAnswers.add("B");

        quiz.addQuestion("What is the St Louis Baseball Team\n" +
                        "A. Rams\n" +
                        "B. Cardinals\n" +
                        "C. Browns\n" +
                        "D. Blues\n" +
                        "E. Battle Hawks\n" +
                        "F. City SC\n" +
                        "G. Hawks\n",
                "SingleAnswerQuestion",
                correctAnswers);

        return quiz;
    }

}
