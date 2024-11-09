package mathproblems;

public class LowestNumber {


	/*
	 * Write java solution to find the lowest number from this array..
	 */


	//find lowest number from the array
	public static int lowestNum(int[] array){
		int min;
		min=array[0];
		for (int i=0;i<array.length-1;i++){
			if (min>array[i]){
				min=array[i];
			}
		}

		return min;
	}


	public static void main(String[] args) {

		int [] b={10, 2, 1, 4, 5, 3, 7, 8, 6} ;
		System.out.println(lowestNum(b));


	}


}