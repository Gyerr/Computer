public class Test {
    public static void main (String[] args) {
        int[][] numbers = new int [10][10];

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers.length; col++) {
                numbers[row][col] = 2 * (row/4);
                System.out.println(numbers[row][col]);
            }
        }
    }
}