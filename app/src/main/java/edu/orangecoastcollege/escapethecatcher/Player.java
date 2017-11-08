package edu.orangecoastcollege.escapethecatcher;

public class Player {
    private int mRow;
    private int mCol;

    public void move(int[][] gameBoard, String direction) {

        // TODO: Implement the logic for the move operation
        // TODO: If the gameBoard is obstacle free in the direction requested,
        // TODO: Move the player in the intended direction.  Otherwise, do nothing (player loses turn)
        switch direction:
        {
            case "LEFT":
                if (gameBoard[mRow][mCol] == 2)

        }



    }

    public void setRow(int row) {
        mRow = row;
    }

    public int getRow() {
        return mRow;
    }

    public void setCol(int col) {
        mCol = col;
    }

    public int getCol() {
        return mCol;
    }

}
