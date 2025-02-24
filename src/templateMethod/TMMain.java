package templateMethod;

import templateMethod.gameInterfaces.Game;

/*
Syfte: Att definiera skelettet av en algoritm i en metod, och låta underklasser fylla i vissa steg utan att ändra algoritmens struktur.
Användning: När du har en algoritm som består av flera steg och vissa av dessa steg kan variera beroende på kontexten.
Exempel: En databehandlingsklass som har en metod för att läsa, bearbeta och skriva data, där bearbetningssteget kan variera beroende på datatypen.
 */
public class TMMain {
    public static void main(String[] args) {

        // Since we are using reference type "Game", we can only reach run-method and are unable to distort the order of execution
        Game shooterGame1 = new ShooterGame();
        shooterGame1.run();

    }
}
