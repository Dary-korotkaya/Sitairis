public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Factory Method
        ProductFactory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.use();

        ProductFactory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
        productB.use();
    }
}
