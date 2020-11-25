package Facade.System;

class SecondSystem implements ISystem {
    @Override
    public void action1() {
        System.out.println("Second system action 1");
    }

    @Override
    public void action2() {
        System.out.println("Second system action 2");
    }
}
