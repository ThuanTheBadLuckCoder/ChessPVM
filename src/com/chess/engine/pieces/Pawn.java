package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Move;

public class Pawn extends Piece {
    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {8, 16, 7, 9};
    public Pawn(final Alliance pieceAlliance, final int piecePosition){
        super(PieceType.PAWN, piecePosition, pieceAlliance, true);

    }
    public Pawn(final Alliance pieceAlliance, final int piecePosition, final boolean isFirstMove){
        super(PieceType.PAWN, piecePosition, pieceAlliance, isFirstMove);

    }
    @Override
    public Pawn movePiece(final Move move){
        return new Pawn(move.getMovedPiece().getPieceAlliance(), move.getDestinationCoordinate());
    }
}
