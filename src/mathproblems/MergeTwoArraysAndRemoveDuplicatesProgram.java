package mathproblems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}
    /*Implement logic here
     * you may change the return type if necessary*/
    public static void mergeTwoArraysAndRemoveDuplicates(int[] array1, int[] array2) {
        try {


            int[] array3 = new int[array1.length + array2.length];
            System.arraycopy(array1, 0, array3, 0, array1.length);
            System.arraycopy(array2, 0, array3, array1.length, array2.length);
            Arrays.sort(array3);
            int countUniqArray = 1;
            for (int i = 1; i < array3.length; i++) {
                if (array3[i] != array3[i - 1]) {
                    countUniqArray++;
                }
            }
            int[] finalArray = new int[countUniqArray];
            finalArray[0] = array3[0];
            int index=1;
            for (int i = 1; i < array3.length; i++) {
                if (array3[i] != array3[i - 1]) {
                    finalArray[index++] = array3[i];
                }
            }
            System.out.println("this is the final array"+Arrays.toString(finalArray));
            System.out.println();
            System.out.println("this is the mergeArray"+Arrays.toString(array3));
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            arrayIndexOutOfBoundsException.getMessage();
        }



    }


    public static void main(String[] args)
    {

       int [] arrayA={1,4,3};
         int []  arrayB={4,5,6,7,8};

         mergeTwoArraysAndRemoveDuplicates(arrayA,arrayB);





    }







}
