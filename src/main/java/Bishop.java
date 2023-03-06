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
        Point[] directionPoints = {new Point(-1,-1),new Point(-1,1),new Point(1,-1),new Point(1,1)};
        for (int i = 0; i < directionPoints.length; i++) {
            currentPoint.x = coords.x;
            currentPoint.y = coords.y;
            currentPoint.x += directionPoints[i].x;
            currentPoint.y += directionPoints[i].y;
            while (isPointOnBoard(currentPoint) && (pieceAtPoint(pieces,currentPoint) == null)){
                result.add(new Point(currentPoint.x, currentPoint.y));
                currentPoint.x += directionPoints[i].x;
                currentPoint.y += directionPoints[i].y;
            }
            if (pieceAtPoint(pieces,currentPoint) != null && (pieceAtPoint(pieces,currentPoint).isWhiteColor() != this.isWhiteColor())){
                result.add(new Point(currentPoint.x, currentPoint.y));
            }
        }


        return result;
    }
}
