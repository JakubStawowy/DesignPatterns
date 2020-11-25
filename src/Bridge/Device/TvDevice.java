package Bridge.Device;

public class TvDevice extends Device {
    public TvDevice(){
        volume = 20;
        channel = 1;
    }
    @Override
    public void button3Pressed() {
        System.out.println("TV Channel down");
        channel++;
    }

    @Override
    public void button4Pressed() {
        System.out.println("TV Channel up");
        channel++;
    }
}
