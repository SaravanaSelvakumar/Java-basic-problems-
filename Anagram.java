public class Anagram {

    public static void main(String[] args) {
        String a = "incomplete";
        String b = "completein";
        boolean result = check(a, b);
        if (result) {
            System.out.println("The strings are anagrams. " + a + " And " + b);
        } else {
            System.out.println("The strings are not anagrams. " + a + " And " + b);
        }

    }

    static boolean check(String a, String b) {
        char[] tempa = new char[a.length()];
        char[] tempb = new char[b.length()];

        if (a.length() != b.length()) {
            return false;
        } else {
            for (int i = 0; i < tempb.length; i++) {
                tempa[i] = a.toLowerCase().charAt(i);
                tempb[i] = b.toLowerCase().charAt(i);
            }

            java.util.Arrays.sort(tempa);
            java.util.Arrays.sort(tempb);

            for (int i = 0; i < tempb.length; i++) {
                if (tempa[i] != tempb[i])
                    return false;
            }
            return true;
        }
    }

    //another method to check if it anagram
    public static boolean check(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] tempA = a.toLowerCase().toCharArray();
        char[] tempB = b.toLowerCase().toCharArray();

        Arrays.sort(tempA);
        Arrays.sort(tempB);

        for (int i = 0; i < tempA.length; i++) {
            if (tempA[i] != tempB[i])
                return false;
        }
        return true;
    }
    
}
