import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece{

    public Bishop(boolean whiteColor, boolean alreadyMoved, Point coords){
        super(whiteColor,alreadyMoved,coords);
    }

    @Override
    public List<Point> getHitPoints(List<Piece> pieces) {
        return null;
    }

    @Override
    public List<Point> getMovePoints(List<Piece> pieces) throws Exception{
        List<Point> result = new ArrayList<>();
        Point currentPoint = new Point(coords.x,coords.y);
        currentPoint.x -= 1;
        currentPoint.y -= 1;
        while (isPointOnBoard(currentPoint) && (pieceAtPoint(pieces,currentPoint) == null)){
            result.add(new Point(currentPoint.x, currentPoint.y));
        }
        if (pieceAtPoint(pieces,currentPoint) != null && (pieceAtPoint(pieces,currentPoint).isWhiteColor() != this.isWhiteColor())){
            result.add(new Point(currentPoint.x, currentPoint.y));
        }

        return result;
    }
}
