import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAffiliation = "";
        Boolean done = false;


        done = false;

        do {
            System.out.print("Enter your party affiliation (R D I): ");
            partyAffiliation = in.nextLine();

            if (partyAffiliation.equalsIgnoreCase("R")) {
                done = true;
                System.out.println("You get a Republican Rooster!");
            }
            else if (partyAffiliation.equalsIgnoreCase("D")) {
                done = true;
                System.out.println("You get a Democratic Donkey!");
            }
            else if (partyAffiliation.equalsIgnoreCase("I")) {
                done = true;
                System.out.println("You get an Independent Iguana!");
            }
            else
                System.out.println("You must enter [RDI] not " + partyAffiliation);

        } while (!done);

    }
}
