class ConcreteFactoryB extends ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}