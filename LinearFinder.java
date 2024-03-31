import java.util.Scanner;
class LinearFinder {
    public static void main(String[] args) {
        System.out.println("Enter the Number to search");
        Scanner scan =new Scanner(System.in);
        
        int [] numbers ={1,22,3,34,5,6,7,28,19,10};
        int target=scan.nextInt();
        int result=-1;
        
        for(int i=0;i<numbers.length;i++)
        {
            if (numbers[i]==target){
                result=i;
            }
        }

        if (result!=-1){
            System.out.println("The target is in the index of : "+result);
        }else{
            System.out.println("The target is Not in the give array ");
        }
    }
}
