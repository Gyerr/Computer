import java.util.Scanner;

public class Test {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>= 0 && arr[j] > key) {
                arr[j+1]= arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int [] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number: ");
            array[i] = in.nextInt();
            
        }

        System.out.println();
        System.out.println("Sorted Array: ");
        
        for (int i = 0; i < array.length; i++) {
            insertionSort(array);
            System.out.println(array[i]);
        }
    }
}