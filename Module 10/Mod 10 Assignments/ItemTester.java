/**
 * @author Gruhith Yerramalli
 * @version 4/21/23
 * 
 * PMR
 * --------------------------------
 * (+): Easy to do implementation class and selectino sort and some of insertion sort
 * 
 * (-): Merge sort was hard, I had to see reference. I really need to practice this and I am also not good at sorts in general so I need to practice
 * --------------------------------------
 * In the Future: Practice WAY MORE SORTS!!!!!!!
 */

import java.util.Arrays;

public class ItemTester {
    public static void main(String[] args) {
        Item[] items = new Item[9];
        items[0] = new Item("Chewbacca Mask", 1281, 19.99, 24);
        items[1] = new Item("School Backpack", 2468, 29.99, 10);
        items[2] = new Item("Water Bottle", 1359, 4.99, 50);
        items[3] = new Item("Pencil Case", 3579, 9.99, 15);
        items[4] = new Item("Laptop Sleeve", 4680, 39.99, 5);
        items[5] = new Item("Whiteboard Set", 9650, 14.99, 8);
        items[6] = new Item("Eraser", 2107, 1.99, 100);
        items[7] = new Item("Textbook", 4531, 79.99, 3);
        items[8] = new Item("Calculator", 1357, 49.99, 6);

        System.out.println("Original Array:");
        printTable(items);

        sortProductNumber(items, "a");
        System.out.println("\nSorted by Product Number (Ascending):");
        printTable(items);

        sortProductName(items, "a");
        System.out.println("\nSorted by Product Name (Descending):");
        printTable(items);

        sortPrice(items, "d");
        System.out.println("\nSorted by Price (Ascending):");
        printTable(items);

        sortQuantity(items, 1, 4, 8);
        System.out.println("\nSorted by Quantity (Descending):");
        printTable(items);
    }

    public static void printTable(Item[] items) {
        System.out.format("%-20s%-20s%-20s%-20s\n", "Name", "Product Number", "Price", "Quantity");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public static void sortProductNumber(Item[] items, String ascending) {
        int n = items.length;
        if (ascending.equalsIgnoreCase("a")) {
            for(int index = 0; index < n-1; index++) {
                int min_idx = index; // max_idx instead of min_idx
                    for(int j = index+1; j < n; j++)
                        if(items[j].getProductNumber() < items[min_idx].getProductNumber()) // > instead of <
                            min_idx = j;

                Item temp = items[min_idx];
                items[min_idx] = items[index];
                items[index] = temp;
            }
        } else if (ascending.equalsIgnoreCase("d")){
            
            for(int index = 0; index < n-1; index++) {
                int max_idx = index; // max_idx instead of min_idx
                    for(int j = index+1; j < n; j++)
                        if(items[j].getProductNumber() > items[max_idx].getProductNumber()) // > instead of <
                            max_idx = j;

                Item temp = items[max_idx];
                items[max_idx] = items[index];
                items[index] = temp;
            }
        }
    }
    

    public static void sortProductName(Item[] items, String ascending) {
        if (ascending.equalsIgnoreCase("a")) {
            int n = items.length;
            for (int unsorted = 1; unsorted < n; ++unsorted) {
                Item nextItem = items[unsorted];
                int loc = unsorted;
                while ((loc > 0) &&(items[loc-1].getName().compareTo(nextItem.getName()) > 0)) {
                  items[loc] = items[loc-1];
                  loc--;
                } 
                items[loc] = nextItem;
              }
        } else if (ascending.equalsIgnoreCase("d")) {
            int n = items.length;
            for (int unsorted = 1; unsorted < n; ++unsorted) {
                Item nextItem = items[unsorted];
                int loc = unsorted;
                while ((loc > 0) &&(items[loc-1].getName().compareTo(nextItem.getName()) < 0)) {
                  items[loc] = items[loc-1];
                  loc--;
                } 
                items[loc] = nextItem;
              }
        }
    }

    public static void sortPrice(Item[] items, String ascending) {
        int n = items.length;
        if (ascending.equalsIgnoreCase("a")) {
            for(int index = 0; index < n-1; index++) {
                int min_idx = index; // max_idx instead of min_idx
                    for(int j = index+1; j < n; j++)
                        if(items[j].getPrice() < items[min_idx].getPrice()) // > instead of <
                            min_idx = j;

                Item temp = items[min_idx];
                items[min_idx] = items[index];
                items[index] = temp;
            }
        }        
         else if (ascending.equalsIgnoreCase("d")) {
            for(int index = 0; index < n-1; index++) {
                int max_idx = index; // max_idx instead of min_idx
                    for(int j = index+1; j < n; j++)
                        if(items[j].getPrice() > items[max_idx].getPrice()) // > instead of <
                            max_idx = j;

                Item temp = items[max_idx];
                items[max_idx] = items[index];
                items[index] = temp;
            }
        }
    }

    public static void sortQuantity(Item[] items, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        
        Item L[] = new Item[n1];
        Item R[] = new Item[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = items[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = items[m + 1 + j];
 
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getQuantity() <= R[j].getQuantity()) {
                items[k] = L[i];
                i++;
            }
            else {
                items[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            items[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            items[k] = R[j];
            j++;
            k++;
        }
    } 
}

