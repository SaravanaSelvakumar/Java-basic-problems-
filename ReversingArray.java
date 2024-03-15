import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 10 numbers ");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // to generate 10 values by using scanner and storing values on array numbers ;
        }

        int[] reverse = new int[numbers.length];


        int count = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverse[i] = numbers[count];
            count++;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("the value of reverse["+i+"] is :"+ reverse[i]);
        }
    }
}


