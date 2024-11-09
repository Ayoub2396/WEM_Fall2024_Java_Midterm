package mathproblems;

public class FindMissingNumber {

    /*
     * If n = 10, then array will have 9 elements in the range from 1 to 10.
     * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
     * Write java code to find the missing number from the array. Write static helper method to find it.
     */



    /**
     * Finding missing number from a given array
     * @param array
     * @param n
     * @return
     */
    static int missNumber(int[] array, int n) {

        int total = 0;
        int sum = n*(n+1)/2;
        try {


            for (int i = 0; i <= n-1; i++) {

                total += array[i];

            }
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            arrayIndexOutOfBoundsException.getMessage();
        }

        // implement logic: sum is the summation of all number

        // Implement logic: total is the summation of all number present in the array

        System.out.println(total);
        System.out.println(sum);

        return sum - total;
    }

    public static void main(String[] args) {
        int [] b={10, 2, 1, 4, 5, 3, 7, 8, 6} ;
        System.out.println(missNumber(b,10));


    }


}
