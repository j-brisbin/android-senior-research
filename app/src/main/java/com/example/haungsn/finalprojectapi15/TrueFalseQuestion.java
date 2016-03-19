package com.example.haungsn.finalprojectapi15;

import java.util.ArrayList;

/**
 * Created by jbrisbin32 on 2/16/16.
 */
public class TrueFalseQuestion extends Question{
    private boolean correctAnswer;

    public TrueFalseQuestion(int id, String question, boolean correctAnswer){
        this.setId(id);
        this.setQuestion(question);
        this.addChoice(Boolean.toString(true));
        this.addChoice(Boolean.toString(false));
        this.setCorrectAnswer(Boolean.toString(correctAnswer));
    }

    public TrueFalseQuestion(String question, boolean correctAnswer){
        this.setQuestion(question);
        this.addChoice(Boolean.toString(true));
        this.addChoice(Boolean.toString(false));
        this.setCorrectAnswer(Boolean.toString(correctAnswer));
    }

    public TrueFalseQuestion(){
        this.addChoice(Boolean.toString(true));
        this.addChoice(Boolean.toString(false));
        this.setCorrectAnswer(Boolean.toString(true));
    }
}
