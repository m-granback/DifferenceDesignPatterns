package abstraktFactory;

import java.util.Scanner;

public class AFMain {
    public static void main(String[] args) {

        // Selection of family

        AbstractLineOfFamily familyFactory;
        System.out.println("1. Swedish");
        System.out.println("2. German");
        System.out.print("Enter family tree of products: ");
        if(new Scanner(System.in).nextInt() == 1){
            familyFactory = new SwedishFamilyFactory();
        } else {
            familyFactory = new GermanFamilyFactory();
        }


        // The rest of the code is the same

        // We are also able to make these objects of same family dependent on each other, even though we would use an interface.
        // This is because every component we create belongs the a certain family and are therefor compatible

        AbstraktionProductMachine iceMachine = familyFactory.createMachine();
        iceMachine.use();

        AbstractionProductCar car = familyFactory.createCar();
        car.use();
    }
}
