import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String trash = "";

        System.out.println("Enter your first number: ");
        System.out.println("Enter your second number: ");

        if (in.hasNextInt()){
            num1 = in.nextInt();
            in.nextLine();
            num2 = in.nextInt();
            in.nextLine();
            if (num1 == num2){
                System.out.println(num1 + " and " + num2 + " are equal");
            }
            else {
                System.out.println(num1 + " and " + num2 + " are not equal");
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Run the program again");
        }
    }
}
