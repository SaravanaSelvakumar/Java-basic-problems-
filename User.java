import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 20 numbers");
        int[] userNumbers = new int[20];
        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = scan.nextInt();

            if (userNumbers[i] > 0) {
                pos++;
            } else if (userNumbers[i] < 0) {
                neg++;
            } else {
                zero++;
            }
            if (userNumbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("postive: " + pos);
        System.out.println("negative: " + neg);
        System.out.println("zeros: " + zero);
        System.out.println("odd: " + odd);
        System.out.println("even:" + even);
    }
}

