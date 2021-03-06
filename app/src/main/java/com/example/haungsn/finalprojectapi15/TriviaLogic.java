package com.example.haungsn.finalprojectapi15;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by User on 2/14/2016.
 */
public class TriviaLogic {
    private int score;
    private ArrayList<TrueFalseQuestion> trueFalseQuestions;
    private ArrayList<MultipleChoiceQuestion> multipleChoiceQuestions;
    private TrueFalseQuestion currentTrueFalseQuestion;
    private MultipleChoiceQuestion currentMultipleChoiceQuestion;
    private int currentQuestionCount;
    private int totalQuestionCount;
    private int questionCorrectCount;
    private String currentQuestionType;

    public TriviaLogic(ArrayList<TrueFalseQuestion> trueFalseQuestions,
                       ArrayList<MultipleChoiceQuestion> multipleChoiceQuestions){
        this.score = 0;
        this.currentQuestionCount = 0;
        this.questionCorrectCount = 0;
        this.totalQuestionCount = 10;
        this.trueFalseQuestions = trueFalseQuestions;
        this.multipleChoiceQuestions = multipleChoiceQuestions;
        this.currentQuestionType = "";
    }

    public TriviaLogic(){
        this.score = 0;
    }

    public void restartGame(){
        this.score = 0;
        this.currentQuestionCount = 0;
        this.currentQuestionType = "";
    }

    public int getScore() {
        Log.i("currentScore",score + "");
        return score;
    }

    public void setScore(int score) {
        Log.i("currentScore",score + "");
        this.score = score;
    }

    public TrueFalseQuestion RandomSelectTrueFalse(){
        Random r = new Random();
        int randomSelection = r.nextInt(trueFalseQuestions.size());
        Log.i("Random selection TF", randomSelection + "");
        currentTrueFalseQuestion =  trueFalseQuestions.get(randomSelection);
        return currentTrueFalseQuestion;
    }

    public MultipleChoiceQuestion RandomSelectMultipleChoice(){
        Random r = new Random();
        int randomSelection = r.nextInt(multipleChoiceQuestions.size());
        Log.i("Random selection MC", randomSelection + "");
        currentMultipleChoiceQuestion =  multipleChoiceQuestions.get(randomSelection);
        currentMultipleChoiceQuestion.shuffleAnswers();
        return currentMultipleChoiceQuestion;
    }

    public String questionStatus(){
        if(currentQuestionCount<totalQuestionCount){
            Random r = new Random();
            int questionSelection = r.nextInt(2);
            Log.i("Question selection",questionSelection + "");
            if(questionSelection == 0){
                this.RandomSelectTrueFalse();
                currentQuestionCount++;
                this.currentQuestionType = "T/F";
                return "T/F";
            }
            else if(questionSelection == 1){
                this.RandomSelectMultipleChoice();
                currentQuestionCount++;
                this.currentQuestionType = "MC";
                return "MC";
            }
        }
        return "Done";
    }

    public int incrementCorrectQuestionCount(){
        if(currentMultipleChoiceQuestion.checkAnswer() ||
                currentTrueFalseQuestion.checkAnswer()){
            return questionCorrectCount++;
        }
        return questionCorrectCount;
    }

    public int getCurrentQuestionCount() {
        return currentQuestionCount;
    }

    public int getTotalQuestionCount() {
        return totalQuestionCount;
    }

    public int getQuestionCorrectCount() {
        return questionCorrectCount;
    }

    public String getCurrentQuestionType() {
        return currentQuestionType;
    }

    public TrueFalseQuestion getCurrentTrueFalseQuestion() {
        return currentTrueFalseQuestion;
    }

    public MultipleChoiceQuestion getCurrentMultipleChoiceQuestion() {
        return currentMultipleChoiceQuestion;
    }
}
