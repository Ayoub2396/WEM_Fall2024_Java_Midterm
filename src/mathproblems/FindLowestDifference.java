package mathproblems;

public class FindLowestDifference {
    /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
    // int [] array1 = {30,12,5,9,2,20,33,1};
    //int [] array2 = {18,25,41,47,17,36,14,19};

    int min;

    static FindLowestDifference obj=new FindLowestDifference();

    static int LowestDifference() {


         int [] array1 = {30,12,5,9,2,20,33,1};
         int [] array2 = {18,25,41,47,17,36,14,19};
        obj.min=array1[0]-array2[0];

        try {


            for (int i = 0; i <= array1.length - 1; i++) {
                for (int j = 0; j <= array2.length - 1; j++) {

                    int a = array1[i] - array2[j];

                    if (obj.min > a & a>=0) {
                        obj.min = a;

                    }


                }

            }
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            arrayIndexOutOfBoundsException.getMessage();
        }
        return obj.min;






    }
    public static void main(String[] args) {


        System.out.println(LowestDifference());

    }



}
