package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.

    public static void grade(double quizz,double midTerm,double finalScore){
        double avg=(quizz+midTerm+finalScore)/3;

        if (avg>=90){
            System.out.println("your grade is A");
        } else if (avg>=70) {
            System.out.println("your grade is B");
        } else if (avg>=50) {
            System.out.println("your grade is C");
        }else {
            System.out.println("your grade is F");
        }
    }

    public static void main(String[] args) {
        grade(80,68,90);
    }

}
