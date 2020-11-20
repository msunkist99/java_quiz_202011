package main;

import java.util.ArrayList;

public class Quiz {

    ArrayList<Question> questions;
    //constructor
    public Quiz(){
        questions = new ArrayList<>();
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(String text, String type, ArrayList<String> correctAnswers) {
        if (type.toUpperCase().equals("SINGLEANSWERQUESTION")) {
            SingleAnswerQuestion newQuestion = new SingleAnswerQuestion(text, type, correctAnswers);
            questions.add(newQuestion);
        }
        else if ( type.toUpperCase().equals("MULTIPLEANSWERQUESTION")) {
            MultipleAnswerQuestion newQuestion = new MultipleAnswerQuestion(text,type,correctAnswers);
            questions.add(newQuestion);
        }
        else if (type.toUpperCase().equals("FREEFORMTEXTANSWERQUESTION")) {
            FreeFormTextAnswerQuestion newQuestion = new FreeFormTextAnswerQuestion(text, type, correctAnswers, 999);
            questions.add(newQuestion);
        }
        else {
            // invalid question type
        }
    }

    public void runQuiz(){
        for(Question question :questions) {
            question.DisplayQuestionAnswers();
            question.GetUserAnswers();

            if (question.CheckAnswers() == true) {
                System.out.println("Your answer is correct!\n");
            }
            else {
                System.out.println("Your answer is not correct\n");
            }
        }
    }

}
