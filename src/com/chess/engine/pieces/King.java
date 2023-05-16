package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Move;

public class King extends Piece {
    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {-9, -8, -7, -1, 1, 7, 8, 9};
    public King(final Alliance pieceAlliance, final int piecePosition){
        super(PieceType.KING, piecePosition, pieceAlliance, true);

    }
    public King(final Alliance pieceAlliance, final int piecePosition, final boolean isFirstMove){
        super(PieceType.KING, piecePosition, pieceAlliance, isFirstMove);

    }
    @Override
    public King movePiece(final Move move){
        return new King(move.getMovedPiece().getPieceAlliance(), move.getDestinationCoordinate());
    }
}
