package factoryMethod;

public class ProducerX extends Producer {
    @Override
    public Product factoryMethod() {
        return new BrownClay();
    }
}
