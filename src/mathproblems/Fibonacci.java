package mathproblems;

public class Fibonacci {
    /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

    // implement the method here

    public int fibonacciOfSelectedNumbers(int num){
        int result=0;
        if (num ==0){
            result=0;

        } else if (num==1) {
            result=1;

        }else {
            for (int i=2;i<=num;i++){
                result=fibonacciOfSelectedNumbers(i-1)+fibonacciOfSelectedNumbers(i-2);
            }
        }
        return result;
    }




    public static void main(String[] args) {
    Fibonacci obj2=new Fibonacci();
        System.out.println(obj2.fibonacciOfSelectedNumbers(7));

    }



}


