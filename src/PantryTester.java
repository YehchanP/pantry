import java.util.Scanner;

public class PantryTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice;
        double amount;
        Jam a = new Jam("Gooseberry", "07/04/86", 12);
        Jam b = new Jam("Crab Apple", "09/30/99", 8);
        Jam c = new Jam("Rhubarb", "10/31/99", 16);

        boolean cont = true;

        Pantry mainPantry = new Pantry(a, b, c);

        System.out.println("Welcome!");

        while (cont) {
            System.out.println("The jams are:  ");
            mainPantry.displayPantry();
            System.out.println("\nEnter your selection (1, 2, or 3)(-1 to leave):");
            choice = in.nextInt();
            while (choice != 1 && choice != 2 && choice != 3 && choice != -1) {
                System.out.println("\nNot a valid input");
                System.out.println("\nEnter your selection (1, 2, or 3)(-1 to leave):");
                choice = in.nextInt();
            }

            if (choice == 1) {
                mainPantry.jamChoice(a);
            } else if (choice == 2) {
                mainPantry.jamChoice(b);
            } else if (choice == 3) {
                mainPantry.jamChoice(c);
            } else if (choice == -1) {
                cont = false;
                continue;
            }

            System.out.println("\nEnter amount to spread:");
            amount = in.nextDouble();

            mainPantry.spread(amount);
        }
        System.out.println("Good-by");
    }
}
