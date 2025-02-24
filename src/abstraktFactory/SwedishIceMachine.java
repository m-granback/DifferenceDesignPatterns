package abstraktFactory;

public class SwedishIceMachine implements AbstraktionProductMachine{
    @Override
    public void use() {
        System.out.println("Serving swedish ice cream...");
    }
}
