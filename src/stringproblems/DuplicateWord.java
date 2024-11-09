package stringproblems;


import java.util.*;

public class DuplicateWord {
    /*
     * Write a java program to find the duplicate words and their number of occurrences in the string.
     * Also Find the average length of the words.
     */

    public static void Duplicate(String sentence){
        String [] array=sentence.split(" ");

        int cpt=0;
        int len=0;
        for (int i=0;i<array.length;i++){
            len+=array[i].length();
            for (int j=0;j<array.length;j++){

                if (array[i]==array[j]){
                    cpt++;
                }
            }
        }
        double avg= (double) len/array.length-1;
        System.out.println("the average length of the words is "+avg+" and ther is a duplicate " +
                "of "+cpt);
    }
    public static void main(String[] args) {


        String sen="ayoub yrouh ayoub ya9ra";
        Duplicate(sen);
    }




}





