package problemandsolutions;

public class VowelOrConsonant {
    /*Write a Java program to check if a letter is a vowel or consonant
     * Add a method if needed
     * you may use more than one technique */

    public static void vowel(char a){
        if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='y'){
            System.out.println("this letter "+a+" is a vowel");
        }else {
            System.out.println("this letter "+a+" is a consonant");
        }
    }
    public static void main(String[] args) {

    vowel('e');

    }
}
