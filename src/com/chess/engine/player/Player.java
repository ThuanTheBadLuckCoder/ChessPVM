package com.chess.engine.player;

import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import org.carrot2.shaded.guava.common.collect.ImmutableList;
import org.carrot2.shaded.guava.common.collect.Iterables;

import java.util.Collection;

public class Player {
    Player(final Board board,
           final Collection<Move> legalMoves,
           final Collection<Move> opponentMoves){
        this.board = board;
        this.playerKing = establishKing();
        this.legalMoves = ImmutableList.copyOf(Iterables.concat(legalMoves, calculateKingCastles(legalMoves, opponentMoves)));
        this.isInCheck = !Player.calculateAttacksOnTile(this.playerKing.getPiecePosition(), opponentMoves).isEmpty();
    }
    protected abstract Collection<Move> calculateKingCastles(Collection<Move> playerLegals, Collection<Move> opponentsLegals);
}
