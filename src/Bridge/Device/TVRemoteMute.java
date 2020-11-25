package Bridge.Device;

public class TVRemoteMute extends RemoteButton {
    public TVRemoteMute(Device device) {
        super(device);
    }

    @Override
    public void button5Pressed() {
        System.out.println("Tv muted");
    }
}
