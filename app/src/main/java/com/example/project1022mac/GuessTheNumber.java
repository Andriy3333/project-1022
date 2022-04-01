package com.example.project1022mac;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class GuessTheNumber {
    private String username;
    private int points;
    private double pointsMultiplier;
    private int randomNumber;
    private int lives;
    private int guessed;
    final static private int lowerLimit = 0;
    private int upperLimit;
    private ArrayList<GuessTheNumber> topLeaderboard;

    public GuessTheNumber(String username){
        this.username = username;
        addToLeaderboard(this);
    }

    public void addToLeaderboard(GuessTheNumber newGuessTheNumber){
        topLeaderboard.add(newGuessTheNumber);
    }


    public int getRandomNumber(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public int getUpperLimit(){
        return upperLimit;
    }
    public void startEasyDifficulty(){
        randomNumber = getRandomNumber(0, 10);
        lives = 10;
        guessed = 0;
        upperLimit = 10;
        pointsMultiplier = 1;
    }

    public void  startMediumDifficulty(){
        randomNumber = getRandomNumber(0,30);
        lives = 5;
        guessed = 0;
        upperLimit = 30;
        pointsMultiplier = 2.5;
    }

    public void startHardDifficulty(){
        randomNumber = getRandomNumber(0, 100);
        lives = 3;
        guessed = 0;
        upperLimit = 100;
        pointsMultiplier = 5;
    }

    public int getChosenNumber(){
        return randomNumber;
    }

    public boolean checkGuess(int guess){
        if(guess == randomNumber){
            guessed++;
            points+= guessed*pointsMultiplier;
            return true;
        }
        else{
            lives--;
            return false;
        }
    }

    public String higherOrLower(int guess){
        if(getChosenNumber() > guess){
            return  "Higher";
        }
        else{
            return "Lower";
        }
    }
}