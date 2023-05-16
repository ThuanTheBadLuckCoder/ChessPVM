package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Move;

public class Queen extends Piece{
    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {-9, -8, -7, -1, 1, 7, 8, 9};
    public Queen(final Alliance pieceAlliance, final int piecePosition){
        super(PieceType.QUEEN, piecePosition, pieceAlliance, true);

    }
    public Queen(final Alliance pieceAlliance, final int piecePosition, final boolean isFirstMove){
        super(PieceType.QUEEN, piecePosition, pieceAlliance, isFirstMove);

    }
    @Override
    public Queen movePiece(final Move move){
        return new Queen(move.getMovedPiece().getPieceAlliance(), move.getDestinationCoordinate());
    }
}
