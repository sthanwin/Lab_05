import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double SHIPPING_RATE = 0.02;
        double itemPrice = 0.0;
        double totalCost = 0.0;
        double shippingCost = 0.0;
        String trash = "";

        System.out.print("Enter the item price: ");
        if(in.hasNextDouble()){
            itemPrice = in.nextDouble();
            in.nextLine();
            if (itemPrice >= 100){
                totalCost = itemPrice;
            }
            else {
                shippingCost = itemPrice * SHIPPING_RATE;
                totalCost = itemPrice + shippingCost;
            }

            System.out.println("The shipping cost is: " + shippingCost);
            System.out.println("Your total price is: " + totalCost);
        }
        else {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Run the program again");
        }

    }
}