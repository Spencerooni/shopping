import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] itemsForSale = { "shed", "handbag", "tractor" };

        System.out.println("What would you like to buy?");

        for (int i = 0; i < itemsForSale.length; i++)
        {
            System.out.println(i + 1 + ". " + itemsForSale[i]);
        }

	    Scanner scanner = new Scanner(System.in);

        int selectedItemToOrder = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many do you want to order?");

        int numberToOrder = scanner.nextInt();
        scanner.nextLine();

        String[] addresses = new String[numberToOrder];

        for (int i = 0; i < numberToOrder; i++)
        {
            System.out.println("Enter address for person " + (i + 1));
            String address = scanner.nextLine();
            addresses[i] = address;
        }

        System.out.println("Thanks! Sending " + numberToOrder + " " + itemsForSale[selectedItemToOrder - 1] + "(s) to the following addresses: ");

        for (int i = 0; i < addresses.length; i++)
        {
            System.out.println(addresses[i]);
        }

    }
}
