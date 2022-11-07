package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if (handSign == "rock") {
            return "paper";
            //paper beats rock
        } else if (handSign == "paper") {
            return "scissor";
            //scissors beats paper
        } else {
            return "rock";
            //rock beats scissors
        }
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign == "rock") {
            return "scissor";
            //scissors loses to rock
        } else if ( handSign == "paper"){
            return "rock";
            //rock loses to paper
        } else {
            return "paper";
            //paper loses to scissors
        }
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if (handSignOfPlayer1 == "rock" && handSignOfPlayer2 == "paper") {
            //rock vs paper = paper wins
            return "paper";
        } else if (handSignOfPlayer1 == "paper" && handSignOfPlayer2 == "scissor"){
            //paper vs scissors = scissors wins
            return "scissor";
        } else if (handSignOfPlayer1 == "scissor" && handSignOfPlayer2 == "rock"){
            //scissors vs rock = rock wins
            return "rock";
       } else if (handSignOfPlayer1 == "rock" && handSignOfPlayer2 == "scissor"){
            //rock vs scissors = rock wins
               return "rock";
             } else if (handSignOfPlayer1 == "paper" && handSignOfPlayer2 == "rock"){
            //paper vs rock = paper wins
            return "paper";
        } else if (handSignOfPlayer1 == "scissor" && handSignOfPlayer2 == "paper") {
            //scissors vs paper = scissors wins
            return "scissor";
        }else{
        return "tie";
        //if both are the same declare a tie
        }

    }
}
