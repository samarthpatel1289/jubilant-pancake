package com.example.tictactoe.board;

import java.util.Enumeration;
import java.util.UUID;

public class BoardDto {

    public enum GameStatus {
        IN_PROGRESS,
        WIN,
        DRAW,
        ABANDONED
    }

    private UUID uuid;
    private String gameBoard;
    private GameStatus gameStatus;

    public BoardDto(String gameBoard){
        this.gameBoard = gameBoard;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public BoardDto(UUID uuid, String gamebBoard){
        this.uuid = uuid;
        this.gameBoard = gamebBoard;
    }

    public String getGameBoard() {
        return gameBoard;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setGameBoard(String gameBoard) {
        this.gameBoard = gameBoard;
    }
}
