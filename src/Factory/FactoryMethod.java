package Factory;

public abstract class FactoryMethod {
    protected abstract Product createProduct();
    public void manufactureProduct(){
        Product product = createProduct();
        product.show();
    }
}
class ConcreteFactoryA extends FactoryMethod{
    @Override
    protected Product createProduct() {
        return new ConcreteProductA();
    }
}
class ConcreteFactoryB extends FactoryMethod{
    @Override
    protected Product createProduct() {
        return new ConcreteProductB();
    }
}
interface Product{
    void show();
}
class ConcreteProductA implements Product{
    @Override
    public void show() {
        System.out.println("Im a product A");
    }
}
class ConcreteProductB implements Product{
    @Override
    public void show() {
        System.out.println("Im a product B");
    }
    public static void main(String[] args){
        ConcreteFactoryA concreteFactoryA = new ConcreteFactoryA();
        ConcreteFactoryB concreteFactoryB = new ConcreteFactoryB();
        concreteFactoryA.manufactureProduct();
        concreteFactoryB.manufactureProduct();
    }
}

