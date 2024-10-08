class ConcreteFactoryA extends ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}