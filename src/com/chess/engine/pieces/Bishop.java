package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Move;

public class Bishop extends Piece {
    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {-9, -7, 7, 9};
    public Bishop(final Alliance pieceAlliance, final int piecePosition){
        super(PieceType.BISHOP, piecePosition, pieceAlliance, true);

    }
    public Bishop(final Alliance pieceAlliance, final int piecePosition, final boolean isFirstMove){
        super(PieceType.BISHOP, piecePosition, pieceAlliance, isFirstMove);

    }
    @Override
    public Piece movePiece(final Move move){
        return new Bishop(move.getMovedPiece().getPieceAlliance(), move.getDestinationCoordinate());
    }
}
