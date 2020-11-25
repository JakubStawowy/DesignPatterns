package Bridge.Device;

public abstract class RemoteButton {
    private Device device;
    public RemoteButton(Device device){
        this.device = device;
    }
    public void button3Pressed(){
        device.button3Pressed();
    }
    public void button4Pressed(){
        device.button4Pressed();
    }
    public void feedback(){
        device.feedback();
    }
    public abstract void button5Pressed();
}
