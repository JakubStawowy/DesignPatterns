package Bridge.Device;

public class DVDDevice extends Device {
    @Override
    public void button3Pressed() {

        System.out.println("DVD Channel down");
        channel++;
    }

    @Override
    public void button4Pressed() {
        System.out.println("DVD Channel down");
        channel--;
    }
}
