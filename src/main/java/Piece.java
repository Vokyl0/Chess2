public class Piece {
    private final boolean whiteColor; // false = black
    private boolean alreadyMoved;
    private final PieceType pieceType;
    private int coordY;
    private int coordX;

    enum PieceType {
        PAWN, ROOK, KNIGHT, BISHOP, KING, QUEEN
    }

    public Piece(boolean whiteColor, boolean alreadyMoved, PieceType pieceType, int coordY, int coordX) {
        this.whiteColor = whiteColor;
        this.alreadyMoved = alreadyMoved;
        this.pieceType = pieceType;
        this.coordY = coordY;
        this.coordX = coordX;
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

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }
}
