public class House {
    //instance variables
    public int walls;
    public double size;
    public String owner;
    public String address;
    public boolean isOccupied;
//constructor: no void, same name as class, a special method
    public House(){
walls= 4;
size= 3200.7;
owner= "Bobby";
address= "362 Centre st";
isOccupied= true;
//todo: make a printinfo() method that prints all the hous einstance vars
    }
//hw: add 2 more parameters to the house constructor: one for isOccupied, one for Address, also fix related problems by adding them to the code in the factory class
    public House (double pSize, int pWalls, String pOwner){
size = pSize;
walls=pWalls;
owner= pOwner;

    }

    public void printinfo(){
        System.out.println("The number of walls is "+ walls);
        System.out.println("The size is "+size);
        System.out.println("The owner is "+owner);
        System.out.println("The address is: "+address);
        System.out.println("It is "+isOccupied+" that the house is occupied");

    }
}
