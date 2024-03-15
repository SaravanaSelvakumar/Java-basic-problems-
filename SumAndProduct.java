import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 5, 2, 3};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            //index[0]=6 index[1]=8 [2]=5 [3]=2 [4]=3 total=6+8+5+2+3=24
            //sum=sum+numbers[0] 0+6=6
            //sum=sum+numbers[1] 6+8=14 14+5=19 19+2=21 21+3=24
            sum += numbers[i];
        }
        System.out.println("sum of numbers: "+sum);

        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            //index[0]=6 index[1]=8 [2]=5 [3]=2 [4]=3 total=6*8*5*2*3=1440
            //product=product+numbers[0] 1*6=6
            //product=product+numbers[1] 6*8=48 48*5=240 240*2=480 480*3=1440
            product *= numbers[i];
        }
        System.out.println("product of numbers: "+product);
    }
}



