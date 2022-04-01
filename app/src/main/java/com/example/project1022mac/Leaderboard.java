package com.example.project1022mac;
import java.util.*;

public class Leaderboard {
     private String username, score;
        private ArrayList<GuessTheNumber> topLeaderboard;

        public void addToLeaderboard(GuessTheNumber newGuessTheNumber){
            topLeaderboard.add(newGuessTheNumber);
        }

        public Leaderboard(String username, String score) {
            this.username = username;
            this.score = score;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

}
