package com.example.tictactoe.board;

public class BoardUtils {

    public boolean isGameOver(BoardDto boardDto){
        String board = boardDto.getGameBoard();
        if (isVertical(board) || isHorizontal(board) || isDiagonal(board)){
            boardDto.setGameStatus(BoardDto.GameStatus.WIN);
            return true;
        }
        if (!isSpaceToMakeMove(board)){
            boardDto.setGameStatus(BoardDto.GameStatus.DRAW);
        }
        return false;
    }

    public boolean isSpaceToMakeMove(String board){
        for (int i = 0; i < board.length(); i++){
            if (board.charAt(i) == '-'){
                return true;
            }
        }
        return false;
    }

    public boolean isVertical(String board){

        return board.charAt(0) == board.charAt(1) && board.charAt(1) == board.charAt(2)
                || board.charAt(3) == board.charAt(4) && board.charAt(4) == board.charAt(5)
                || board.charAt(6) == board.charAt(7) && board.charAt(7) == board.charAt(8);
    }

    public boolean isHorizontal(String board){
        return board.charAt(0) == board.charAt(3) && board.charAt(3) == board.charAt(6)
                || board.charAt(1) == board.charAt(4) && board.charAt(4) == board.charAt(7)
                || board.charAt(2) == board.charAt(5) && board.charAt(5) == board.charAt(8);
    }

    public boolean isDiagonal(String board){
        return board.charAt(0) == board.charAt(4) && board.charAt(4) == board.charAt(8)
                || board.charAt(2) == board.charAt(4) && board.charAt(4) == board.charAt(6);
    }

}
