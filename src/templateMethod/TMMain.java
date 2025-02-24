package templateMethod;

import templateMethod.gameInterfaces.Game;

public class TMMain {
    public static void main(String[] args) {

        // Since we are using reference type "Game", we can only reach run-method and are unable to distort the order of execution
        Game shooterGame1 = new ShooterGame();
        shooterGame1.run();

    }
}
