package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and the
    // n the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.

    public static void calculation(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the integer a");
        int a=scanner.nextInt();
        System.out.println("enter the integer b");
        int b=scanner.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        double div=(double) a/b;

        System.out.println("the sum of a and b is "+add);
        System.out.println("the substraction of a and b is "+sub);
        System.out.println("the multiplication of a and b is "+mul);
        System.out.println("the devision of a on b is "+div);

    }

    public static void main(String[] args) {
        calculation();
    }



}
