package abstraktFactory;

public class GermanFamilyFactory implements AbstractLineOfFamily{
    @Override
    public AbstractionProductCar createCar() {
        return new BMWCar();
    }

    @Override
    public AbstraktionProductMachine createMachine() {
        return new GermanIceMachine();
    }
}
