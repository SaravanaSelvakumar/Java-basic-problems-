import java.util.Scanner;
import java.util.Arrays;

class Binary {
    public static void main(String[] args) {
        System.out.println("Enter the Number to search");
        Scanner scan =new Scanner(System.in);
        
        int [] numbers ={1,22,3,34,5,6,7,28,19,10};
        Arrays.sort(numbers);
        
        int target=scan.nextInt();
        int index=-1;
        int start=0;
        int end=numbers.length-1;
        
        while (start<=end)
        {
          int mid=(start+end)/2;
          if(numbers[mid]==target){
          index=mid;
           break;
          }else if(numbers[mid]<target){
              start=mid+1;
          }else{
              end=mid-1;
          }
        }
       
        if (index!=-1){
            System.out.println("The target is in the index of : "+index);
        }else{
            System.out.println("The target is Not in the give array ");
        }
    }
}
