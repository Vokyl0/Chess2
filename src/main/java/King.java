import java.awt.*;
import java.util.List;

public class King extends Piece{
    public King(boolean whiteColor, Point coords){
        super(whiteColor,coords);
    }

    @Override
    protected List<Point> getHitPoints(List<Piece> pieces) throws Exception {
        return null;
    }

    @Override
    protected List<Point> getMovePoints(List<Piece> pieces) throws Exception {
        return null;
    }
}
