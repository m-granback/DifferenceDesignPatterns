package factoryMethod;

public class FMMain {
    public static void main(String[] args) {
        Producer producerX = new ProducerX();
        producerX.useProduct();

        Producer producerY = new ProducerY();
        producerY.useProduct();
        /**
         * We are creating a common interface for all the products that could be created
         * Each product implements the interface and defines its behaviour
         *
         * We are creating an abstract creator with an abstract factoryMethod, which sub creators/sub classes will have to implement, along with common method by the inherit
         * Each creator implements the interface and defines the factoryMethod, setting which concrete product to create essentially
         *
         * The abstract creator has no knowledge of what product will be created
         *
         * The Factory method pattern involves two abstractions, one for the creator and the other for the product
         *
         * By using the interfaces, the client code does not need to have knowledge of the concrete product classes = loose coupling, and we may easily add more concrete products in the future
         *
         */
    }
}