package problemandsolutions;

public class LeapYear {

    /*Write a Java program to check if a year is a leap year or not
     * Use a return type in main method */

    //condition
    //A year divisible by 400 is always a leap year.
    //A year divisible by 100 but not by 400 is not a leap year.
    //A year divisible by 4 but not by 100 is a leap year.
    //A year not divisible by 4 is not a leap year.

    public static Boolean leapYear(int year){
        if ((year %400==0 ||year %4==0)&&year%100!=0 ){
            System.out.println("the year "+year+" is a leap year");
            return true;
        }else {
            System.out.println("the year "+year+" is not a leap year");
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println(leapYear(2024));

    }
}
