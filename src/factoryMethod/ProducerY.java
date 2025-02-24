package factoryMethod;

public class ProducerY extends Producer {
    @Override
    public Product factoryMethod() {
        return new GraySlime();
    }
}
