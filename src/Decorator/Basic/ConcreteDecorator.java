package Decorator.Basic;


public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(AbstractObject abstractObject) {
        super(abstractObject);
    }

    @Override
    public double getCost() {
        return abstractObject.getCost()+5.50;
    }

    @Override
    public String getDescription() {
        return abstractObject.getDescription()+", + concrete decorator";
    }
}
