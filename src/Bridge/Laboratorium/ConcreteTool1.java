package Bridge.Laboratorium;

public class ConcreteTool1 extends AbstractTool {
    protected ConcreteTool1(AbstractSystem abstractSystem) {
        super(abstractSystem);
    }

    @Override
    public void action1() {
        System.out.println("Concrete Tool 1");
        abstractSystem.action1();
    }

    @Override
    public void action2() {
        System.out.println("Concrete Tool 1");
        abstractSystem.action2();
    }
}
