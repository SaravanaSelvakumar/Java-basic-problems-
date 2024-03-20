public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 23, 3, 4, 5, 6, 7, 8, 94, 54, 61, 76, 89};
        int target = 61;

        int binaryresult = binary(numbers, target);
        if (binaryresult != -1) {
            System.out.println("its in the index of : " + binaryresult);
        } else {
            System.out.println("Binaryresult its not in the array");
        }

        int linearresult = linear(numbers, target);
        if (linearresult != -1) {
            System.out.println("its in the index of : " + linearresult);
        } else {
            System.out.println("linearresult its not in the array");
        }
    }

    public static int binary(int[] num, int tar) {
        //1, 23, 3, 4, 5, 6, 7, 8, 94, 54, 61, 76, 89 tar=76
        int left = 0;
        int right = num.length - 1;
        int steps = 0;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (num[mid] == tar) {
                System.out.println("number of binary steps " + steps);
                return mid;
            } else if (num[mid] < tar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("number of binary steps " + steps);
        return -1;
    }

    public static int linear(int[] num, int tar) {
        int steps = 0;
        for (int i = 0; i < num.length; i++) {
            steps++;
            if (num[i] == tar) {
                System.out.println("number of linear steps " + steps);
                return i;
            }
        }
        System.out.println("number of linear steps " + steps);
        return -1;
    }
}
