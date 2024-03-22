public class ReverseString {
    public static void main(String[] args) {
        String name = "siva kumar";

        System.out.println("reverse method : " + reverse(name));

        String reverse = "reversed : ";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String reverse(String name) {
        char[] words = name.toCharArray();
        char[] temp = new char[words.length];

        int j = 0;
        for (int i = name.length() - 1; i >= 0; i--) {
            temp[j] = words[i];
            j++;
        }
        return new String(temp);
    }
}
