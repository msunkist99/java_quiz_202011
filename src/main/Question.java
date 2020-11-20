package main;

import java.util.ArrayList;

public abstract class Question {
    private String text;
    private String type;
    private int id;
    private ArrayList<String> correctAnswers;

    //constructor
    public Question(String text, String type, ArrayList<String> answers){
        id = AbstractEntity.getId();
        this.text = text;
        this.type = type;

        correctAnswers = new ArrayList<>();
        for(String answer : answers){
            this.correctAnswers.add(answer.toUpperCase());
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void DisplayQuestionAnswers(){ System.out.println(this.text); }

    public abstract boolean CheckAnswers();

    public abstract void GetUserAnswers();
}
