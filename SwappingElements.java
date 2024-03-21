public class SwappingElements {
    public static void main(String[] args) {
        int a = 7, b = 19, c = 24;
        System.out.println("original values");
        System.out.println("A = " + a + "\n" + "B = " + b + "\n" + "C = " + c);
        Arithmetic(a,b,c);
        bitwise(a,b,c);
    }

    public static void Arithmetic(int a, int b, int c) {
        //Arithmetic operation for swapping elements
        a = a + b + c;        //7+19+24=50
        b = (a - b) - c;     //50-19-24=31-24=7
        c = (a - b) - c;    //50-7-24=43-24=19
        a = (a - b) - c;   //50-7-19=43-19=24
        System.out.println("Arithmetic swapped values");
        System.out.println("A = " + a + "\n" + "B = " + b + "\n" + "C = " + c);
    }

    public static void bitwise(int a, int b, int c) {
        //bitwise operation for swapping elements
        a = a ^ b ^ c;
        b = a ^ b ^ c;
        c = a ^ b ^ c;
        a = a ^ b ^ c;
        System.out.println("bitwise swapped values");
        System.out.println("A = " + a + "\n" + "B = " + b + "\n" + "C = " + c);
    }
}
