package com.example.tictactoe.board;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.StreamSupport;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepo;

    public BoardDto makeBoard(BoardDto boardDto){
        BoardModel board = new BoardModel();
        board.setGameBoard(boardDto.getGameBoard());
        boardRepo.save(board);
        boardDto.setUuid(board.getUuid());
        boardDto.setGameBoard(board.getGameBoard());
        return boardDto;
    }

    @Transactional
    public Optional<BoardDto> makeMove(UUID uuid, BoardDto boardDto ){
        String move = boardDto.getGameBoard();
        Optional<BoardModel> board = boardRepo.findById(uuid);
        if (!board.isPresent()) return Optional.empty();
        BoardUtils boardUtils = new BoardUtils();
        boardUtils.isGameOver(boardDto);
        BoardModel exisitingBoardModel = board.get();
        exisitingBoardModel.setGameBoard(move);
        boardDto.setUuid(uuid);
        boardRepo.save(exisitingBoardModel);
        return Optional.of(boardDto);
    }
}
