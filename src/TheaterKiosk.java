import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int AGE_REQUIRMENT = 21;
        String trash = "";
        int age = 0;

        System.out.print("Enter your age: ");

        if (in.hasNextInt()){
            age = in.nextInt();
            in.nextLine();
            if (age < AGE_REQUIRMENT){
                System.out.println("You are not 21, GET OUT!");
            }
            else {
                System.out.println("You get a wrist band");
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Run the program again");
        }

    }
}
