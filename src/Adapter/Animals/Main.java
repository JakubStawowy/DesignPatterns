package Adapter.Animals;

public class Main {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal fishAdapter = new FishAdapter(new Fish());
        dog.breathe();
        dog.walk();
        fishAdapter.breathe();
        fishAdapter.walk();
    }
}
