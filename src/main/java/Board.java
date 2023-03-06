import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Piece> pieces;

    public Board() {
        pieces = new ArrayList<>();
        addDefaultPieces();
    }
    private void addDefaultPieces(){

    }
    private void addPiece(Piece piece){
        pieces.add(piece);
    }
    private boolean validateMove(int sourseY, int sourceX, int destY, int destX){
        return true;
    }
    public void move(int sourseY, int sourceX, int destY, int destX){
        if (!validateMove(sourseY,sourceX,destY,destX)) return;
        pieces.removeIf(x -> x.coords.y != destY && x.coords.x != destX);
        pieces.stream()
                .filter(x -> x.coords.y == sourseY && x.coords.x == sourceX)
                .forEach(x -> {
                    x.setAlreadyMoved(true);
                    x.coords.y = destY;
                    x.coords.x = destX;
                });
    }
}
