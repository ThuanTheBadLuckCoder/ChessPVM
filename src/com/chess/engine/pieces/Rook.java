package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Move;

public class Rook extends Piece {
    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {-8, -1, 1, 8};
    public Rook(final Alliance pieceAlliance, final int piecePosition){
        super(PieceType.ROOK, piecePosition, pieceAlliance, true);

    }
    public Rook(final Alliance pieceAlliance, final int piecePosition, final boolean isFirstMove){
        super(PieceType.ROOK, piecePosition, pieceAlliance, isFirstMove);
    }
    @Override
    public Rook movePiece(final Move move){
        return new Rook(move.getMovedPiece().getPieceAlliance(), move.getDestinationCoordinate());
    }
}
