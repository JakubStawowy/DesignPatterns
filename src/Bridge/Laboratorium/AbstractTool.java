package Bridge.Laboratorium;

public abstract class AbstractTool {
    protected AbstractSystem abstractSystem;
    protected AbstractTool(AbstractSystem abstractSystem){
        this.abstractSystem = abstractSystem;
    }
    public abstract void action1();
    public abstract void action2();
}
