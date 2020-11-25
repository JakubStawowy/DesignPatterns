package Facade.System;

public class  SystemFacade implements ISystem{
    private FirstSystem firstSystem = new FirstSystem();
    private SecondSystem secondSystem = new SecondSystem();

    @Override
    public void action1() {
        firstSystem.action1();
        secondSystem.action1();
    }

    @Override
    public void action2() {
        firstSystem.action1();
        secondSystem.action1();
    }
}
