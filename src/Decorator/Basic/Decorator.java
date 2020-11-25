package Decorator.Basic;

public abstract class Decorator implements AbstractObject{
    protected AbstractObject abstractObject;

    public Decorator(AbstractObject abstractObject){
        this.abstractObject = abstractObject;
    }

    @Override
    public String getDescription() {
        return abstractObject.getDescription();
    }

    @Override
    public double getCost() {
        return abstractObject.getCost();
    }
}
