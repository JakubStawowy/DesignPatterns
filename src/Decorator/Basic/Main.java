package Decorator.Basic;

public class Main {
    public static void main(String[] args){
        AbstractObject object = new ConcreteDecorator(new ConcreteDecorator(new ConcreteDecorator(new BasicObject())));
        System.out.println(object.getCost());
        System.out.println(object.getDescription());
    }
}
