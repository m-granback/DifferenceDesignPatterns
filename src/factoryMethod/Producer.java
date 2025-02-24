package factoryMethod;

public abstract class Producer {
    public abstract Product factoryMethod();
    public void useProduct() {
        Product product = factoryMethod();
        product.use();
    }
}
