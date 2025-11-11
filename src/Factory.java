import java.awt.dnd.peer.DragSourceContextPeer;

public class Factory {
    //these are instance variables. they are made at the top of the class, have the word public and...
    //...can be used anywhere in the class except for the psvm

public int yearFounded;//integers is whole numbers
public boolean isOpen;//boolean is true/false
    public double earnings;//doubles is any number with decimals
    public String products;//anything that can be put in to quotes

    public static void main(String[] args) {
        System.out.println("Welcome to Spencer's Factory :(");

        new Factory();

    }


    //this is a constructor, constructors are special types of methods.
    //You can tell it is a constructpr because it does not have void. The name has to match the name of the world
    public Factory(){
        System.out.println("We make houses!");
        yearFounded=2025;
        isOpen=false;
        earnings=1.1;
        products="houses";
        factoryInfo();

        //change the yearFounded and isOpen
        //call factoryInfo
    }

    //todo:make a method called factoryInfo

    public void factoryInfo(){
        System.out.println("The factory info:");
        //todo: add souts to print the factory's instance variables
        System.out.println("Year founded: "+yearFounded);
        System.out.println("Open: "+isOpen);
        System.out.println("Earnings: "+earnings);
        System.out.println("Products: "+products);
    }


}
