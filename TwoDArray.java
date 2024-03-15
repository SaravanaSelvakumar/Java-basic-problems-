import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = scanner.nextInt();
                //[0,0   0,1   0,2
                // 1,0   1,1   1,2]
            }
        }

        for (int[] secondloop : numbers) {
            for (int result : secondloop) {
                System.out.print(result);
            }
            System.out.println();
        }

    }
}




