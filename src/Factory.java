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
        yearFounded=2007;
        isOpen=true;
        earnings=1.1;
        products="houses";
        factoryInfo();

        //change the yearFounded and isOpen
        //call factoryInfo; again

        //type varName=value;
        //object of type house
        //objects are variables that represent the classes that we make
        House h1= new House();
        h1.owner="Mr. Kim";
        h1.address="300 Centre street";
        h1.isOccupied=true;
        h1.size=8.2;
        h1.walls=4;
        System.out.println(h1.owner);
        House h2 = new House();
        h2.printinfo();
        //todo: give all the house instance variables values


        House myhouse = new House();
        myhouse.printinfo();


        House customhouse = new House(200.24,5,"Mrs. Blair");
        customhouse.printinfo();
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
