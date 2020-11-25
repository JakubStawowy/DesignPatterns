package Bridge.Device;

public abstract class Device {
    protected int volume;
    protected int channel;
    public void feedback(){
        System.out.println("Device volume: "+ volume);
        System.out.println("Device channel: "+channel);
    }
    public void button1Pressed(){
        System.out.println("Volume up");
        volume++;
    }
    public void button2Pressed(){
        System.out.println("Volume down");
        volume--;
    }
    public abstract void button3Pressed();
    public abstract void button4Pressed();

}
