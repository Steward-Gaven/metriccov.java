import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double meters = 0;
        double miles;
        double feet;
        double inches;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter value in meters: ");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine();
        }
        else
        {
            String trash1 = in.nextLine();
            System.out.println("You entered: " + trash1);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }
        miles = meters / 1609;
        System.out.println("Meters converted to miles: " + miles);

        feet = meters * 3.281;
        System.out.println("Meters converted to feet: " + feet);

        inches = meters * 39.37;
        System.out.println("Meters converted to inches: " + inches);
    }
}