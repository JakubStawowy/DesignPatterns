package Bridge.Laboratorium;

public class ConcreteSystem2 implements AbstractSystem {
    @Override
    public void action1() {
        System.out.println("Concrete System 2 action 1");
    }

    @Override
    public void action2() {
        System.out.println("Concrete System 2 action 2");
    }
}
