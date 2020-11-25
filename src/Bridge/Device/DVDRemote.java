package Bridge.Device;

public class DVDRemote extends RemoteButton{
    public DVDRemote(Device device) {
        super(device);
    }

    @Override
    public void button5Pressed() {
        System.out.println("DVD on");
    }
}
