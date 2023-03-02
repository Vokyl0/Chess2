import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Board {
    List<Piece> pieces;

    public Board() {
        pieces = new ArrayList<>();
        addDefaultPieces();
    }
    private void addDefaultPieces(){
        pieces.add(new Piece(true,false, Piece.PieceType.PAWN, 0,0));
        pieces.add(new Piece(true,false, Piece.PieceType.PAWN, 1,1));
        pieces.add(new Piece(true,false, Piece.PieceType.PAWN, 2,2));
    }
    private boolean validateMove(int sourseY, int sourceX, int destY, int destX){
        return true;// todo validation of the move
    }
    public void move(int sourseY, int sourceX, int destY, int destX){
        if (!validateMove(sourseY,sourceX,destY,destX)) return;
        pieces = pieces.stream()
                        .filter(x -> x.getCoordY() != destY && x.getCoordX() != destX)
                        .collect(Collectors.toList());
        pieces.stream()
                .filter(x -> x.getCoordY() == sourseY && x.getCoordX() == sourceX)
                .forEach(x -> {
                    x.setAlreadyMoved(true);
                    x.setCoordY(destY);
                    x.setCoordX(destX);
                });
    }
}
