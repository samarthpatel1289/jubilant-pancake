package com.example.tictactoe.board;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepo;

    public BoardModel makeBoard(BoardModel move){
        return boardRepo.save(move);
    }

    @Transactional
    public Optional<BoardModel> makeMove(UUID uuid, String move){
        Optional<BoardModel> board = boardRepo.findById(uuid);
        if (board.isPresent()){
            BoardModel exisitingBoardModel = board.get();
            exisitingBoardModel.setGamebBoard(move);
            boardRepo.save(exisitingBoardModel);
        }
        return board;
    }
}
