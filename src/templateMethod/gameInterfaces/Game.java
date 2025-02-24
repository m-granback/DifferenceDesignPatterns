package templateMethod.gameInterfaces;

public abstract class Game {
    // The template method which defines the skeleton of the game
    public void run(){
        initialize();
        loadData();
        startGame();
    }
    protected abstract void initialize();
    protected abstract void loadData();
    protected abstract void startGame();
}
