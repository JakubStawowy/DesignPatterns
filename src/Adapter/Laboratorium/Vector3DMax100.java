package Adapter.Laboratorium;
abstract class Vector{
    protected double x;
    protected double y;
    protected double z;
    public Vector(double x, double y, double z){

        this.x = check(x);
        this.y = check(y);
        this.z = check(z);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    protected abstract double check(double parameter);
    public void show(){
        System.out.println("x: "+x+", y: "+y+", z: "+z);
    }
}
public class Vector3DMax100 extends Vector{
    public Vector3DMax100(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public double check(double parameter){
        if(parameter < 0)
            return 0;
        else if(parameter > 100)
            return 100;
        else return parameter;
    }
}
class Vector3DMax1000 extends Vector{
    public Vector3DMax1000(double x, double y, double z) {
        super(x, y, z);
    }
    @Override
    protected double check(double parameter) {
        if(parameter < 0)
            return 0;
        else if(parameter > 1000)
            return 100;
        else return parameter;
    }
}
class Vector3DMax100Adapter extends Vector3DMax1000{
    private Vector3DMax100 vector3DMax100;
    public Vector3DMax100Adapter(Vector3DMax100 vector3DMax100){
        super(vector3DMax100.getX(), vector3DMax100.getY(), vector3DMax100.getY());
        this.vector3DMax100 = vector3DMax100;
    }
    @Override
    public double getX() {
        return vector3DMax100.getX();
    }

    @Override
    public double getY() {
        return vector3DMax100.getY();
    }

    @Override
    public double getZ() {
        return vector3DMax100.getZ();
    }
    public static void main(String[] args){
        Vector3DMax1000 v1 = new Vector3DMax1000(222.2,533.4,655.6);
        v1.show();
        System.out.println(over500(v1));
        Vector3DMax1000 v2 = new Vector3DMax100Adapter(new Vector3DMax100(101,202,18));
        v2.show();
        System.out.println(over500(v2));
    }
    public static int over500(Vector3DMax1000 vector3DMax1000){
        int i = 0;
        if(vector3DMax1000.getX() > 500)
            i++;
        if(vector3DMax1000.getY() > 500)
            i++;
        if(vector3DMax1000.getZ() > 500)
            i++;
        return i;
    }
}