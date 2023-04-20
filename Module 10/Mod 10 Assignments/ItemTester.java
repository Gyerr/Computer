import java.util.Arrays;

public class ItemTester {
    public static void main(String[] args) {
        Item[] items = new Item[10];
        items[0] = new Item("Chewbacca Mask", 1281, 19.99, 24);
        items[1] = new Item("School Backpack", 2468, 29.99, 10);
        items[2] = new Item("Water Bottle", 1359, 4.99, 50);
        items[3] = new Item("Pencil Case", 3579, 9.99, 15);
        items[4] = new Item("Laptop Sleeve", 4680, 39.99, 5);
        items[5] = new Item("Stapler", 2579, 7.99, 20);
        items[6] = new Item("Whiteboard Set", 3579, 14.99, 8);
        items[7] = new Item("Eraser", 2468, 1.99, 100);
        items[8] = new Item("Textbook", 4680, 79.99, 3);
        items[9] = new Item("Calculator", 1357, 49.99, 6);

        System.out.println("Original Array:");
        printTable(items);

        sortProductNumber(items, true);
        System.out.println("\nSorted by Product Number (Ascending):");
        printTable(items);

        sortProductName(items, false);
        System.out.println("\nSorted by Product Name (Descending):");
        printTable(items);

        sortPrice(items, true);
        System.out.println("\nSorted by Price (Ascending):");
        printTable(items);

        sortQuantity(items, false);
        System.out.println("\nSorted by Quantity (Descending):");
        printTable(items);
    }

    public static void printTable(Item[] items) {
        System.out.format("%-20s%-20s%-20s%-20s\n", "Name", "Product Number", "Price", "Quantity");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public static void sortProductNumber(Item[] items, boolean ascending) {
        if (ascending) {
            Arrays.sort(items, (a, b) -> a.getProductNumber() - b.getProductNumber());
        } else {
            Arrays.sort(items, (a, b) -> b.getProductNumber() - a.getProductNumber());
        }
    }

    public static void sortProductName(Item[] items, boolean ascending) {
        if (ascending) {
            Arrays.sort(items, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        } else {
            Arrays.sort(items, (a, b) -> b.getName().compareToIgnoreCase(a.getName()));
        }
    }

    public static void sortPrice(Item[] items, boolean ascending) {
        if (ascending) {
            Arrays.sort(items, (a, b) -> Double.compare(a.getPrice(), b.getPrice()));
        } else {
            Arrays.sort(items, (a, b) -> Double.compare(b.getPrice(), a.getPrice()));
        }
    }

    public static void sortQuantity(Item[] items, boolean ascending) {
        if (ascending) {
            Arrays.sort(items, (a, b) -> a.getQuantity() - b.getQuantity());
        } else {
            Arrays.sort(items, (a, b) -> b.getQuantity() - a.getQuantity());
        }
    }
}
