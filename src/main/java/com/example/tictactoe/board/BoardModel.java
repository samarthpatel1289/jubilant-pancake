package com.example.tictactoe.board;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "board")
public class BoardModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    private String gamebBoard;

    public UUID getUuid(){
        return  uuid;
    }
    public String getGamebBoard() {
        return gamebBoard;
    }
    public void setGamebBoard(String move){
        this.gamebBoard = move;
    }
}
