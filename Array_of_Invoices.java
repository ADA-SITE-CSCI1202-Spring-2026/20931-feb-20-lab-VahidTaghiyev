import java.util.Scanner;

class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double price;

    public Invoice(String number, String description, int howMany, double howMuch) {
        partNumber = number;
        partDescription = description;
        quantity = howMany;
        price = howMuch;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
        if (quantity < 0) quantity = 0;
        if (price < 0) price = 0.0;
        return quantity * price;
    }
}

public class Array_of_Invoices {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice #" + (i + 1));

            System.out.print("Part Number: ");
            String number = scanner.nextLine();

            System.out.print("Description: ");
            String description = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            invoices[i] = new Invoice(number, description, quantity, price);
        }

        System.out.println("\n--- Invoice Details ---");

        for (int i = 0; i < invoices.length; i++) {
            System.out.println("\nInvoice #" + (i + 1));
            System.out.println("Part Number: " + invoices[i].getPartNumber());
            System.out.println("Description: " + invoices[i].getPartDescription());
            System.out.println("Quantity: " + invoices[i].getQuantity());
            System.out.println("Price: " + invoices[i].getPrice());
            System.out.println("Invoice Amount: " + invoices[i].getInvoiceAmount());
        }

        scanner.close();
    }
}
