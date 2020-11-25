package Bridge.Laboratorium;

public class ConcreteTool2 extends AbstractTool {
    public ConcreteTool2(AbstractSystem abstractSystem) {
        super(abstractSystem);
    }

    @Override
    public void action1() {
        System.out.println("Concrete Tool 2");
        abstractSystem.action1();
    }

    @Override
    public void action2() {
        System.out.println("Concrete Tool 2");
        abstractSystem.action2();
    }
}
