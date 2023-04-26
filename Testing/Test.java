package Testing;
public class Test {
    public static void main (String[] args) {
        int[][] numbers = new int [2][2];

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[0].length; col++) {
                numbers[row][col] = 8 * 4;
                System.out.print(numbers[row][col]);
            }
        }
    }
}