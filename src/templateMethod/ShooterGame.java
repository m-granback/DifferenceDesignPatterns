package templateMethod;

import templateMethod.gameInterfaces.Game;

public class ShooterGame extends Game {

    @Override
    protected void initialize() {
        System.out.println("Shooter game initializes");
    }

    @Override
    protected void loadData() {
        System.out.println("Loading weapons, map, creatures");
    }

    @Override
    protected void startGame() {
        System.out.println("Shooter game starts");
    }
}
