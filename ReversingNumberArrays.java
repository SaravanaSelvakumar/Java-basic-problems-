import java.util.Scanner;

public class ReversingNumberArrays {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter 10 numbers ");
        int [] numbers = new int[10];

        for (int i=0; i<numbers.length; i++)
        {
           numbers[i]=scanner.nextInt(); // to generate 10 values by using scanner and storing values on array numbers ;
        }

        int [] reverse =new int[numbers.length];
        for (int i=0; i< numbers.length; i++){
            reverse[i]=numbers[(numbers.length-1-i)];   //length-1(10-1)-index(0) = (9-0) = 9
            //again (10-1=9) = 9 -1 =8
            //int reverse[0]=number[9] so numbers 9 index value will sit on 0 index of reverse
            //int reverse[1]=number[8] so numbers 8 index value will sit on 1 index of reverse and so loop will go on
            System.out.println(reverse[i]);
        }
    }
}


