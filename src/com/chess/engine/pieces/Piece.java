package src.engine.pieces;

import src.engine.Alliance;
import src.engine.board.Board;
import src.engine.board.Move;

import java.util.Collection;

public abstract class Piece {

    protected final int piecePosition;
    protected final Alliance pieceAlliance;

    Piece(final int piecePosition, final Alliance pieceAlliance) {
        this.pieceAlliance = pieceAlliance;
        this.piecePosition = piecePosition;
    }

    public Alliance getPieceAlliance() {
        return this.pieceAlliance;
    }
    public abstract Collection<Move> calculateLegalMoves(final Board board);
}
