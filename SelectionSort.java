// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SelectionSort {
    public static void main(String[] args) {
        
        int [] arr={31,12,43,14,5,26,17,28,9};   //values
         int size=arr.length;                   //size of the array
         int index=-1;                         //inital value of the array
         int temp=0;

       System.out.println("Before Sorting");
        for (int result: arr){
            System.out.print(result+ " ");
        }
        
        for (int i=0;i<size-1;i++)
        {
            index=i;
            for (int j=i;j<size;j++)
            {
                if(arr[index]> arr[j]){   //31<
                    index=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        
         System.out.println("\n" + "After Sorting");
         for (int result: arr){
            System.out.print(result+ " ");
        }
    }
}
