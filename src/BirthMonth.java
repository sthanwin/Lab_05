import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.print("Enter your birth month (1 - 12): ");

        if (in.hasNextInt()){
            birthMonth = in.nextInt();
            in.nextLine();
            if (0 > birthMonth || birthMonth > 12){
                System.out.println("You must enter a valid number not " + birthMonth);
                System.out.println("Run the program again");
            }
            else {
                System.out.println("Your birth month is: " + birthMonth);
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Run the program again");
        }

    }
}
