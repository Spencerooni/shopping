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

        String[] addresses = new String[0];
        boolean enteringAddresses = true;

        while (enteringAddresses)
        {
            String newAddress = scanner.nextLine();
            if (newAddress == null || newAddress.isEmpty())
            {
                enteringAddresses = false;
            }
            else
            {
                String[] copyOfAddresses = new String[addresses.length + 1];

                for (int i = 0; i < addresses.length; i++)
                {
                    copyOfAddresses[i] = addresses[i];
                }

                copyOfAddresses[copyOfAddresses.length - 1] = newAddress;

                addresses = copyOfAddresses;
            }
        }

        System.out.println("Thanks! Sending " + addresses.length + " " + itemsForSale[selectedItemToOrder] + "(s) to the following addresses: ");

        for (int i = 0; i < addresses.length; i++)
        {
            System.out.println(addresses[i]);
        }

    }
}
