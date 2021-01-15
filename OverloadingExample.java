import java.util.Scanner;

public class OverloadingExample {

    Scanner scanobj =  new Scanner(System.in);
    int n1, sq ;
    public void overMethod() {


        System.out.println("enter a number ");
        n1 = scanobj.nextInt();
        sq =  n1 * n1;
        System.out.println("square of the number entered is  " + sq);

    }

    public void overMethod(String str) {

        System.out.println("this a method with String parameters  " + str);
    }

    public void overMethod(int a, int b) {

        System.out.println("this a method with 2 parameters");

        int c = a+b;

        System.out.println("value of c is " +c);
    }
}

class sample extends OverloadingExample {

    public static void main(String args[]) {

        OverloadingExample obj1 = new OverloadingExample();

        obj1.overMethod();
        obj1.overMethod("nithya");
        obj1.overMethod(12, 35);
    }
}
