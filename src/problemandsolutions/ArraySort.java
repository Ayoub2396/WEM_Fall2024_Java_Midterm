package problemandsolutions;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    // By using the any sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.
    public static void sortArray(int []a){

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int []a={5,1,3,4,9,7,1,2,36,1,2};
        sortArray(a);
    }
}
