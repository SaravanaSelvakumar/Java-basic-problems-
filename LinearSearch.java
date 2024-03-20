
public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 23, 3, 4, 5, 6, 7, 8, 94, 54, 61, 76, 89}; //give an array of numbers 
        int target = 76;                              //given a target to find the index value
        int results = linear(numbers, target);
        if (results < 0) {
            System.out.println("its not in the array");
        } else {
            System.out.println("its in the index of :" + results);
        }
    }                                                                 // output : its in the index of :11

    public static int linear(int[] num, int tar) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == tar)      //checking the target that it is in the array or not  
                return i;           //if it is in the array returning the index value 
        }
        return -1;                  //if it is not in the array we are returning the -1 so that we will print not in the array 
    }
}
