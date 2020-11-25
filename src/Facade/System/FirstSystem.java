package Facade.System;

class FirstSystem implements ISystem {
    @Override
    public void action1() {
        System.out.println("First system action 1");
    }

    @Override
    public void action2() {
        System.out.println("First system action 2");
    }
}
