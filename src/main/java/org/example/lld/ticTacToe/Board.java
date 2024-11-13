package org.example.lld.ticTacToe;

public class Board {

    int size;
    PlayingPiece[][] playingPieces;

    public Board(int size) {
        this.size = size;
        this.playingPieces = new PlayingPiece[size][size];
    }

    public boolean addPiece(int x, int y, PlayingPiece playingPiece){
        if(x >= 0 && x < size && y >= 0 && y <= size && playingPieces[x][y] == null){
            playingPieces[x][y] = playingPiece;
            return true;
        }
        return false;
    }
}
