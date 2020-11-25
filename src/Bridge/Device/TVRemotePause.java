package Bridge.Device;

public class TVRemotePause extends RemoteButton {
    public TVRemotePause(Device device) {
        super(device);
    }

    @Override
    public void button5Pressed() {
        System.out.println("Tv paused");
    }
}
