package Observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Subscriber implements Observer{
    private int id;
    private FileWriter fileWriter;
    public Subscriber(int id){
        this.id = id;
    }
    public void subscribe(){
        Subsription.getInstance().addSubscriber(this);
        try{
            String path = "C:\\Users\\ThinkPadJakub\\IdeaProjects\\DesignPatterns" +
                    "\\src\\Observer\\SubscribersFiles\\Subscriber"+id+".txt";
            File file = new File(path);
            if(!file.exists())
                if(!file.createNewFile())
                    System.out.println("Nie udalo sie stworzyc pliku");
            fileWriter = new FileWriter(path, false);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void unsubscribe(){
        Subsription.getInstance().removeSubscriber(this);
        closeFile();
    }
    @Override
    public void sendMessage(String message) {
        try{
            fileWriter.write(message+" subscriber number "+id+"\n");
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void closeFile() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
interface Observer{
    void sendMessage(String message);
    void closeFile();
}
class Subsription{
    private LinkedList<Observer> subscribers;
    private static Subsription instance = null;
    private Subsription(){
        subscribers = new LinkedList<>();
    }
    public static Subsription getInstance(){
        if(instance == null)
            instance = new Subsription();
        return instance;
    }
    public void sendMessagesToSubscribers(){
        for(Observer subscriber: subscribers)
            subscriber.sendMessage("Sended message to");
    }
    public void closeFiles(){
        for(Observer subscriber: subscribers)
            subscriber.closeFile();
    }
    public void addSubscriber(Observer subscriber){
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Observer subscriber){
        subscribers.remove(subscriber);
    }
}
class Main{
    public static void main(String[] args){
        Subscriber sub0 = new Subscriber(0);
        Subscriber sub1 = new Subscriber(1);
        Subscriber sub2 = new Subscriber(2);
        Subscriber sub3 = new Subscriber(3);
        Subscriber sub4 = new Subscriber(4);
        sub0.subscribe();
        sub2.subscribe();
        sub3.subscribe();
        Subsription.getInstance().sendMessagesToSubscribers();
        sub3.unsubscribe();
        Subsription.getInstance().sendMessagesToSubscribers();
        Subsription.getInstance().closeFiles();
    }
}