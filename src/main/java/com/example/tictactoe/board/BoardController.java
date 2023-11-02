package com.example.tictactoe.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
public class BoardController {
    @Autowired
    private BoardService boardService;

    @PostMapping("/create-board")
    public BoardModel createBoard(@RequestBody BoardModel move){
        return boardService.makeBoard(move);
    }

    @PostMapping("/make-move/{board}")
    public Optional<BoardModel> makeMove(@PathVariable UUID board, @RequestBody MakeMove makeMove){
        String move = makeMove.getMove();
        return boardService.makeMove(board, move);
    }
}
