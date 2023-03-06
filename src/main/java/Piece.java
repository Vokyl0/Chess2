import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Piece {
    private final boolean whiteColor; // false = black
    private boolean alreadyMoved;
    protected Point coords;



    public Piece(boolean whiteColor, Point coords) {
        this.whiteColor = whiteColor;
        this.alreadyMoved = false;
        this.coords = coords;
    }

    public boolean isWhiteColor() {
        return whiteColor;
    }

    public boolean isAlreadyMoved() {
        return alreadyMoved;
    }

    public void setAlreadyMoved(boolean alreadyMoved) {
        this.alreadyMoved = alreadyMoved;
    }

    public Point getCoords() {
        return coords;
    }

    public void setCoords(Point coords) {
        this.coords = coords;
    }

    protected abstract List<Point> getHitPoints(List<Piece> pieces) throws Exception;
    protected abstract List<Point> getMovePoints(List<Piece> pieces) throws Exception;
    protected boolean isPointOnBoard(Point p){
        return p.x >= 0 && p.x <= 7 && p.y >= 0 && p.y <= 7;
    }
    protected Piece pieceAtPoint(List<Piece> pieces, Point p) throws Exception{
        List<Piece> result = pieces.stream().filter(piece -> piece.coords.x == p.x && piece.coords.y == p.y).collect(Collectors.toList());
        if (result.size() == 0){
            return null;
        }else if (result.size() == 1){
            return result.get(0);
        }else{
            throw new Exception();
        }
    }
}
