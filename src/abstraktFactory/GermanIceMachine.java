package abstraktFactory;

public class GermanIceMachine implements AbstraktionProductMachine{
    @Override
    public void use() {
        System.out.println("Serving german ice cream...");
    }
}
