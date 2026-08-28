package week2.assigment_problems;

public class ProductInventory {

    public static void parseInventory(String csvLine) {

        String[] parts = csvLine.split(",");

        if (parts.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String product = parts[0].trim();
        String sku = parts[1].trim();
        String quantity = parts[2].trim();

        System.out.println(
                "Product: " + product
                + " | SKU: " + sku
                + " | Qty: " + quantity
        );
    }

    public static void main(String[] args) {

        parseInventory("Wireless Mouse,WM-2201,150");

        parseInventory("Wireless Mouse,150");
    }
}