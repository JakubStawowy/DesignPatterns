package Observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Subscriber implements Observer{
    private int id;
    public Subscriber(int id){
        this.id = id;
    }
    public void subscribe(){
        Subsription.getInstance().addSubscriber(this);
    }
    public void unsubscribe(){
        Subsription.getInstance().removeSubscriber(this);
    }
    @Override
    public void sendMessage(String message) {
        try{
            String path = "C:\\Users\\ThinkPadJakub\\IdeaProjects\\ProjectPatterns\\src\\Observer\\SubscribersFiles\\Subscriber"+id+".txt";
            File file = new File(path);
            if(!file.exists())
                file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(message+" subscriber number "+id);
            fileWriter.close();
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
interface Observer{
    void sendMessage(String message);
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
        sub3.unsubscribe();
        Subsription.getInstance().sendMessagesToSubscribers();
    }
}