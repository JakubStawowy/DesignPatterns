package Decorator.Laboratorium;

import javax.naming.Name;

interface NameSurname{
    String get();
}
public class PrintName implements NameSurname{
    private String name;
    private String surname;

    public PrintName(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String get(){
        return name+" "+surname;
    }
    public static void main(String[] args){
        NameSurname n = new PrintNameDecorated(new PrintNameDecorated(new PrintName("Jakub", "Stawowy")));
        System.out.println(n.get());
    }
}
class PrintNameDecorated implements NameSurname{
    private NameSurname printName;
    public PrintNameDecorated(NameSurname printName){
        this.printName = printName;
    }
    @Override
    public String get(){
        return ">>>"+printName.get()+"<<<";
    }
}
