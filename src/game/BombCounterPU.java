package game;

public class BombCounterPU extends AbstractPowerup
{

    public BombCounterPU(int rowIndex, int colIndex) {
        super(colIndex, rowIndex);
    }

    public void addToPlayer(Player player) {
        int currentBombCount = player.getBombCount();
        player.setBombCount(currentBombCount + 1);
    }

    public String getName() {
        final String name = "BombCounter";
        return name;
    }
}
