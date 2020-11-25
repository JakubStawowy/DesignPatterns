package Bridge.Laboratorium;

public class Main {
    public static void main(String[] args){
        AbstractTool abstractTool = new ConcreteTool1(new ConcreteSystem1());
        abstractTool.action1();
        abstractTool.action2();
        System.out.println("------------------------------------------------------");
        abstractTool = new ConcreteTool1(new ConcreteSystem2());
        abstractTool.action1();
        abstractTool.action2();
        System.out.println("------------------------------------------------------");
        abstractTool = new ConcreteTool2(new ConcreteSystem1());
        abstractTool.action1();
        abstractTool.action2();
        System.out.println("------------------------------------------------------");
        abstractTool = new ConcreteTool2(new ConcreteSystem2());
        abstractTool.action1();
        abstractTool.action2();
    }
}
