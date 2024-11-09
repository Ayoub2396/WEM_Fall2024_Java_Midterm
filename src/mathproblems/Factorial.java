package mathproblems;


public class Factorial {

    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
    /*Iterator to find factorial*/
    /*Method to use Iterator to find factorial
     * Add parameter if necessary
     * you may change the return type of the method*/
    public int iterativeFactorial(int a){
            int sum=1;
            for (int i=1;i<=a;i++){
                sum=sum*i;
            }
            System.out.println(sum);

        return sum;
    }



    /*Using recursive method*/
    /*Using recursive method
     * you may need to change the return statement
     * use param if applicable*/
        int sum=1;
    public int recursionFactorial(int a){

            if (a==1){
                return sum;
            }else {
                sum=sum*a;
                a-=1;

            }
            return recursionFactorial(a);

        }


    public static void main(String[] args) {

        Factorial obj1=new Factorial();
        obj1.iterativeFactorial(5);
        System.out.println(obj1.recursionFactorial(5));

    }









}

