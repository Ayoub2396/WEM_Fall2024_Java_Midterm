package stringproblems;

import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.iterators.ArrayIterator;
import org.apache.commons.collections4.iterators.ListIteratorWrapper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
/*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */

    public String findTheLargestWord(String sentence){
        String []words=sentence.split(" ");
        String longestWord="";
        int count=0;

        for (String word :words){
            if (word.length()>longestWord.length()){
                longestWord=word;


            }


        }
        count=longestWord.length();


        return "the longest word is "+longestWord+" and it has "+count+" letter";
    }
    public static void main(String[] args) {
        DetermineLargestWord sen1=new DetermineLargestWord();

        String senten="The field of biological sciences is vast and diverse.";
        System.out.println(sen1.findTheLargestWord(senten));


    }


}
