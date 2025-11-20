public class Garage {
    public int doors;
    public String owner;
    public boolean open;

    public Garage(){
        doors=2;
        owner= "The Factory";
        open=false;
    }

    public Garage (int gdoors, String gowner, boolean gopen){
        gopen=open;
        gowner=owner;
        gdoors=doors;
    }

    public void printginfo() {
        System.out.println("The number of doors is "+doors);
        System.out.println("The owner is "+owner);
        System.out.println("It is "+open+" that the garage is open");

    }


}
