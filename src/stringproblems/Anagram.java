package stringproblems;


import java.util.Arrays;

public class Anagram {
    //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
    //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


    public static Boolean anagram(String a,String b){
        String a1=a.toLowerCase();
       String b2= b.toLowerCase();

        char [] arrayA=a1.toCharArray();
        char [] arrayB=b2.toCharArray();

        if (arrayA.length!=arrayB.length){
            return false;
        }

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);


        for (int i = 0;i<arrayA.length ; i++){

            if (arrayA[i]!=arrayB[i]){
            return false;
            }
        }
        System.out.print(Arrays.toString(arrayA));
        System.out.println();
        System.out.print(Arrays.toString(arrayB));
        System.out.println();

        return true;

    }
    public static void main(String[] args) {

        System.out.println( anagram("Cat","ACT"));

    }


}
