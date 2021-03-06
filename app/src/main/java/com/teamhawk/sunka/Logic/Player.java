package com.teamhawk.sunka.logic;

/**
 * Created by Vikash Kothary on 26-Oct-15.
 */
public class Player {

    /* all player stats should be sorted in this class */
    private String playerName;
    private int gamesWon;
    private int gamesLost;
    private int gamesDrawn;
    private int highScore;
    private int averageMoveTimeInSeconds;
    private int averageGameTimeInSeconds;
    private int movesTaken;

    private int buttonClicked;

    public Player(){
        this.playerName = null;
        gamesWon = 0;
        gamesLost = 0;
        gamesDrawn = 0;
        highScore = 0;
        averageMoveTimeInSeconds = 0;
        averageGameTimeInSeconds = 0;
        movesTaken = 0;
    }


    public Player(String name){
        this.playerName = name;
        gamesWon = 0;
        gamesLost = 0;
        gamesDrawn = 0;
        highScore = 0;
        averageMoveTimeInSeconds = 0;
        averageGameTimeInSeconds = 0;
        movesTaken = 0;
    }

    public Player(Player player){
        this.playerName = player.getPlayerName();
        gamesWon = player.getGamesWon();
        gamesLost = player.getGamesLost();
        gamesDrawn = player.getGamesDrawn();
        highScore = player.getHighScore();
        averageMoveTimeInSeconds = player.getAverageMoveTime();
        averageGameTimeInSeconds = player.getAverageGameTime();
        movesTaken = player.getMovesTaken();
    }



    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getGamesPlayed() {
        return gamesWon + gamesLost + gamesDrawn;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void recordWin(int newGameTime) {
        recordNewGameTime(newGameTime);
        gamesWon+=1;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void recordLoss(int newGameTime) {
        recordNewGameTime(newGameTime);
        gamesLost+=1;
    }

    public int getGamesDrawn() {
        return gamesDrawn;
    }

    public void recordTie(int newGameTime) {
        recordNewGameTime(newGameTime);
        gamesDrawn+=1;
    }

    public int getMovesTaken(){
        return movesTaken;
    }

    public int getHighScore() {
        return highScore;
    }

    public boolean updateHighScore(int highScore) {
        if(highScore>this.highScore){
            this.highScore = highScore;
            return true;
        }
        return false;
    }

    public int getButtonClicked() {
        return buttonClicked;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public void setGamesDrawn(int gamesDrawn) {
        this.gamesDrawn = gamesDrawn;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public void setAverageMoveTimeInSeconds(int averageMoveTimeInSeconds) {
        this.averageMoveTimeInSeconds = averageMoveTimeInSeconds;
    }

    public void setAverageGameTimeInSeconds(int averageGameTimeInSeconds) {
        this.averageGameTimeInSeconds = averageGameTimeInSeconds;
    }

    public void setButtonClicked(int buttonClicked) {
        this.buttonClicked = buttonClicked;
    }

    public int getAverageMoveTime() {
        return averageMoveTimeInSeconds;
    }

    public void recordNewMoveTime(int newMoveTimeInSeconds) {
        int totalMoveTime = averageMoveTimeInSeconds*movesTaken+newMoveTimeInSeconds;
        movesTaken+=1;
        this.averageMoveTimeInSeconds = totalMoveTime/movesTaken;
    }

    public int getAverageGameTime() {
//        Date time = new Date();
//        time.setTime(averageGameTimeInSeconds*1000);
        return averageGameTimeInSeconds;
    }

    public void recordNewGameTime(int newGameTimeInSeconds) {
        int totalGameTime = averageGameTimeInSeconds*getGamesPlayed()+newGameTimeInSeconds;
        this.averageGameTimeInSeconds = totalGameTime/(getGamesPlayed()+1);
    }
	
	public boolean isAI(){
        return false;
    }

    public void takeTurn (Game game){

    }

    public boolean equals(Player player){
        /* What if two people have the same name? */
        return this.toString().equals(player.toString());
    }

    public String toString(){
        return playerName;
    }
}
