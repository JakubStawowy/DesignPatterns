package Singleton;

import java.util.LinkedList;

public class SafeThreadSingleton {
    private static int i;
    public static SafeThreadSingleton instance = null;
    private SafeThreadSingleton(){
        i = 0;
    }
    public void incrementI(int threadId){
        System.out.println("["+threadId+"]i = "+i);
        i++;
    }
    public void incrementI(){
        System.out.println("i = "+i);
        i++;
    }
    public static SafeThreadSingleton getInstance(){
        if(SafeThreadSingleton.instance == null){
            synchronized (SafeThreadSingleton.class){
                if(SafeThreadSingleton.instance == null)
                    SafeThreadSingleton.instance = new SafeThreadSingleton();
            }
        }
        return SafeThreadSingleton.instance;
    }

}
class SingletonThread extends Thread{
    private int id;
    public SingletonThread(int id){
        this.id = id;
    }
    @Override
    public void run() {
        SafeThreadSingleton safeThreadSingleton = SafeThreadSingleton.getInstance();
        for (int i = 0; i < 5; i++) {
            safeThreadSingleton.incrementI(id);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Main{
    public static void main(String[] args){
        SingletonThread threadHandler1 = new SingletonThread(1);
        SingletonThread threadHandler2 = new SingletonThread(2);
        threadHandler1.start();
        threadHandler2.start();
    }
}
