public class Random {
    public static void main(String[] args) {
        int min = 1;
        int max = 12;
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Random integer between " + min + " and " + max + ": " + randomInt);
    }
}

