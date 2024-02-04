public class Copy {
    public static void main(String[] args) {
        String names = "hi hello hi";
        String [] arr = names.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i].equals("hi")) {
                arr[i] = "hey";
            }
        }
        for (String h : arr) {
            System.out.println(h);
        }
    }
}