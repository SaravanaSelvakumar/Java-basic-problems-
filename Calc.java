import java.util.Scanner;

class Calc{
    public static void main(String[] args) {
        Scanner user =new Scanner(System.in);
        System.out.println("Enter your Number");
Myclass calc =  new Myclass();
calc.a = user.nextInt();
calc.b = user.nextInt();
calc.add();
calc.Sub();
calc.mul();
Myclass.Sub();

    }
    }

   public class Myclass{
    int a;
    int b;
    int c;

    public int add (){
        c=a+b;
        System.out.println(c);
        return c;
    }

    public static void Sub(){
        int aa = 50;
        int bb = 60;
        int cc;
        cc=aa-bb;
        System.out.println(cc);
    }

    public void mul(){
        c=a*b;
        System.out.println(c);
    }
    }

