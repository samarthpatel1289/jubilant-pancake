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
    public BoardDto createBoard(@RequestBody BoardDto boardDto){
        return boardService.makeBoard(boardDto);
    }

    @PostMapping("/make-move/{board}")
    public Optional<BoardDto> makeMove(@PathVariable UUID board, @RequestBody BoardDto boardDto){
        System.out.println(board);
        System.out.println(boardDto.getGameBoard());
        return boardService.makeMove(board, boardDto);
    }
}
