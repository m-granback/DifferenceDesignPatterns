package abstraktFactory;

public class SwedishFamilyFactory implements AbstractLineOfFamily{
    @Override
    public AbstractionProductCar createCar() {
        return new CarVolvo();
    }

    @Override
    public AbstraktionProductMachine createMachine() {
        return new SwedishIceMachine();
    }
}
