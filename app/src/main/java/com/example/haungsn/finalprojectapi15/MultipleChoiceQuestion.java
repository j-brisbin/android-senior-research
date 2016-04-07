package com.example.haungsn.finalprojectapi15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * Created by jbrisbin32 on 2/16/16.
 */
//TODO: Enforce 4 choices limit
public class MultipleChoiceQuestion extends Question{

    public MultipleChoiceQuestion(int id, String question,
                                  ArrayList<String> choices, String correctAnswer){
        this.setId(id);
        this.setQuestion(question);
        if(choices.size() == 4){
            this.setChoices(choices);
        }
        this.setCorrectAnswer(correctAnswer);
    }

    public MultipleChoiceQuestion(String question,
                                  ArrayList<String> choices, String correctAnswer){
        this.setQuestion(question);
        if(choices.size() == 4){
            this.setChoices(choices);
        }
        this.setCorrectAnswer(correctAnswer);
    }


    public void shuffleAnswers(){
        /*Shuffle code is courtesy of StackOverflow user Michael Borgwardt:
        * http://stackoverflow.com/questions/4228975/how-to-randomize-arraylist */
        long seed = System.nanoTime();
        Collections.shuffle(this.getChoices(),new Random(seed));
    }
}
