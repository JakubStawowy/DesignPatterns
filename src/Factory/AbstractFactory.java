package Factory;

public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
class ConcreteFactory1 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
class ConcreteFactory2 implements AbstractFactory{
    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }
}
interface AbstractProductA{
    void showA();
}
interface AbstractProductB{
    void showB();
}
class ConcreteProductA1 implements AbstractProductA{
    @Override
    public void showA() {
        System.out.println("Im a product A1");
    }
}
class ConcreteProductA2 implements AbstractProductA{
    @Override
    public void showA() {
        System.out.println("Im a product A2");
    }
}
class ConcreteProductB1 implements AbstractProductB{
    @Override
    public void showB() {
        System.out.println("Im a product B1");
    }
}
class ConcreteProductB2 implements AbstractProductB{
    @Override
    public void showB() {
        System.out.println("Im a product B2");
    }
}
class Main1{
    public static void main(String[] args){
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        ConcreteFactory2 factory2 = new ConcreteFactory2();
        AbstractProductA a = factory1.createProductA();
        AbstractProductA a2 = factory2.createProductA();
        a.showA();
        a2.showA();
    }
}