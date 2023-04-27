import java.util.Scanner;

public class Test {
    //public static void insertionSort(int[] arr) {
    //    int n = arr.length;
//
    //    for (int i = 1; i < n; i++) {
    //        int key = arr[i];
    //        int j = i-1;
    //        while (j>= 0 && arr[j] > key) {
    //            arr[j+1]= arr[j];
    //            j = j-1;
    //        }
    //        arr[j+1] = key;
    //    }
    //}

    public static int surprise(int b)
{
if ((b % 2) == 0)
{
if (b < 10)
return b;
else
return ((b % 10) + surprise(b / 10));
}
else
{
if (b < 10)
return 0;
else
return surprise(b / 10);
}
}
    public static void main (String [] args) {
        System.out.println(surprise(58216));
        /*
         * mystery(1234) = mystery(123) prints 4
         * mystery(123) = mystery(12) prints 3
         * mystery(12) = mystery(1) prints 2
         * mystery(1) = prints 1 and then 1 
         */
    }
}