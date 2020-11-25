package Decorator.Basic;


public class BasicObject implements AbstractObject {
    @Override
    public double getCost() {
        return 10.00;
    }

    @Override
    public String getDescription() {
        return "basic object ";
    }
}
