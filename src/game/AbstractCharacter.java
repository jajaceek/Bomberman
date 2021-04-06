package game;

public class AbstractCharacter {
    private final static int SIZE = 30;
    private int x;
    private int y;
    private int pixelsPerStep;

    protected AbstractCharacter(int x, int y, int pixelsPerStep) {
        this.x = x;
        this.y = y;
        this.pixelsPerStep = pixelsPerStep;
    }

    public enum Move {
        DOWN(0, 1),
        UP(0, -1),
        RIGHT(1, 0),
        LEFT(-1, 0);

        private final int deltaX;
        private final int deltaY;
        Move(final  int deltaX, final int deltaY) {
            this.deltaX = deltaX;
            this.deltaY = deltaY;
        }
    }

    public void move(Move move) {
        x += move.deltaX * pixelsPerStep;
        y += move.deltaY * pixelsPerStep;
    }

    public void moveBack(Move currnetDirection) {
        if(currnetDirection == Move.DOWN) {
            move(Move.UP);
        } else if (currnetDirection == Move.UP) {
            move(Move.DOWN);
        } else if (currnetDirection == Move.LEFT) {
            move(Move.RIGHT);
        } else if (currnetDirection == Move.RIGHT) {
            move(Move.LEFT);
        }
    }

    public int getSize() {
        return SIZE;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getColIndex() {
        return Floor.pixelToSquare(x);
    }

    public int getRowIndex() {
        return Floor.pixelToSquare(y);
    }
}
