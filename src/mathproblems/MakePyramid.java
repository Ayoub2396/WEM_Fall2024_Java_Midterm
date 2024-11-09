package mathproblems;

public class MakePyramid {
    /*   Implement a large Pyramid of stars in the screen with java.

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *

     */
    /*Using Iterator to generate half of pyramid*/

    public static void pyramid(){
        for (int i=1;i<=6;i++){
            for (int j=1;j<=i;j++){

                    System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    pyramid();


        }
  }
