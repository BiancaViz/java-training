
package clean.code.chess.requirements;


public class Pawn {
    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void cruise( int oldY,  int newY){
        // if its the firtst time he moves ( Y = 1 for White / Y= 6 for Black)
        // the pawn can move one or two positions
        // then he moves one position vertically
        switch(getPieceColor()) {
        case WHITE:
            if (oldY == 1 && newY == oldY + 2) {
                setYCoordinate(newY);
            }
            if (newY == oldY + 1) {
                setYCoordinate(newY);
            }
            break;
        case BLACK:
            if (oldY == 6 && newY == oldY - 2) {
                setYCoordinate(newY);
            }
            if (newY == oldY - 1) {
                setYCoordinate(newY);
            }
            break;
        }
    }

    public void attack( int oldX, int oldY, int newX, int newY){
        //the pawn attack diagonally in front of him

        switch(getPieceColor()) {
            case WHITE:
                //white goes only up
                if (newY == oldY + 1 ) {
                    //right
                    if(newX == oldX + 1){
                        setYCoordinate(newY);
                        setXCoordinate(newX);
                    }
                    //left
                    if(newX == oldX - 1){
                        setYCoordinate(newY);
                        setXCoordinate(newX);
                    }
                }
                break;

            case BLACK:
                //black goes only down
                if (newY == oldY - 1) {
                    //right
                    if(newX == oldX + 1){
                        setYCoordinate(newY);
                        setXCoordinate(newX);
                    }
                    //left
                    if(newX == oldX - 1){
                        setYCoordinate(newY);
                        setXCoordinate(newX);
                    }
                }
                break;
        }
    }
    // will override attack and cruise for king
    // will override attack for the rest of the pieces

    // will implement RemovePiece from chessboard in case of successfull attack
    // will implement Game function

    public void Move(MovementType movementType, int newX, int newY) {
      int oldX = getXCoordinate();
      int oldY = getYCoordinate();

        switch(movementType){
            case MOVE:
                //the pawn can move only if the path is clear and on table
                // and
                //the pawn only moves forward -> constant X

               if( getChesssBoard().IsLegalBoardPosition(newX,newY) )
                   if(newX == oldX)
                       cruise(oldY,newY);

             break;

            case CAPTURE:
                // the pawn can capture only if
                // newX and newY are the coordinates of a potential victim
                // (newX and newY on table and taken)

                if( getChesssBoard().OnTable(newX, newY) && !getChesssBoard().PositionFree(newX, newY) )
                    attack( oldX,  oldY, newX,  newY);

            break;

        }
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
