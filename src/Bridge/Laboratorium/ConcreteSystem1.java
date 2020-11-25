package Bridge.Laboratorium;

public class ConcreteSystem1 implements AbstractSystem {
    @Override
    public void action1() {
        System.out.println("Concrete System 1 action 1");
    }

    @Override
    public void action2() {
        System.out.println("Concrete System 1 action 2");
    }
}
