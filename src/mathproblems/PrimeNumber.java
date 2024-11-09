package mathproblems;

public class PrimeNumber {
	/*
	 * Find list of Prime numbers from number 2 to 10000
	 * Try the best solution as possible.Which will take less CPU life cycle.
	 * Out put number of Prime numbers on the given range.
	 *
	 */
	public static Boolean isPrime(int num) {
		if (num == 1) {
			return true;
		} else {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0 && num != i) {
					return false;
				}
			}
			return true;
		}
	}

	public static void prime(){
		for (int i=1;i<=10000;i++){
			if (isPrime(i)){
				System.out.print(i+",");
			}
		}
	}
	public static void main(String[] args) {
	prime();


	}

}
