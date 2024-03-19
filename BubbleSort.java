
public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 13, 4, 15, 6, 17, 8, 9};
        System.out.println("Before Sorting the array");
        for (int i : numbers) {
            System.out.print(i + " "); //printing the unsorted array
        }
        System.out.println();
        swap(numbers);
    }

    public static void swap(int[] num) {
        for (int i = 0; i < num.length - 1; i++)
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        System.out.println("After Sorting the array");
        for (int i : num) {
            System.out.print(i + " "); //printing the sorted array
        }
    }
}
