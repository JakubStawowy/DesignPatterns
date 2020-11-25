package Bridge.Device;

public class Main {
    public static void main(String[] args){
        RemoteButton tvRemoteButton1 = new TVRemoteMute(new TvDevice());
        RemoteButton tvRemoteButton2 = new TVRemotePause(new TvDevice());

        RemoteButton dvdRemoteButton = new DVDRemote(new DVDDevice());

        System.out.println("tv mute test");
        tvRemoteButton1.button3Pressed();
        tvRemoteButton1.button4Pressed();
        tvRemoteButton1.button5Pressed();

        System.out.println("tv pause test");
        tvRemoteButton2.button3Pressed();
        tvRemoteButton2.button4Pressed();
        tvRemoteButton2.button5Pressed();

        System.out.println("dvd test");
        dvdRemoteButton.button3Pressed();
        dvdRemoteButton.button4Pressed();
        dvdRemoteButton.button5Pressed();
    }
}
