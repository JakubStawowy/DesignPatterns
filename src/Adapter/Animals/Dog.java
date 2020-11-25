package Adapter.Animals;

public class Dog implements Animal {
    @Override
    public void walk() {
        System.out.println("Im a dog and I walk with on my feet");
    }
    @Override
    public void breathe() {
        System.out.println("Im a dog and I breathe with my lungs");
    }
}
