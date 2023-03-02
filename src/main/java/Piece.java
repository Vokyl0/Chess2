public class Piece {
    private final boolean whiteColor; // false = black
    private boolean alreadyMoved;
    private final PieceType pieceType;
    enum PieceType {
        PAWN, ROOK, KNIGHT, BISHOP, KING, QUEEN
    }

    public Piece(boolean whiteColor, boolean alreadyMoved, PieceType pieceType) {
        this.whiteColor = whiteColor;
        this.alreadyMoved = alreadyMoved;
        this.pieceType = pieceType;
    }

    public boolean isWhiteColor() {
        return whiteColor;
    }

    public boolean isAlreadyMoved() {
        return alreadyMoved;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setAlreadyMoved(boolean alreadyMoved) {
        this.alreadyMoved = alreadyMoved;
    }
}
