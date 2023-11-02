package com.example.tictactoe.board;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "board")
public class BoardModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    private String gameBoard;

    public UUID getUuid(){
        return  uuid;
    }
    public String getGameBoard() {
        return gameBoard;
    }
    public void setGameBoard(String move){
        this.gameBoard = move;
    }

}
