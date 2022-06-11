import java.util.ArrayList;
class PrimeDirective {

	// primes defined as numbers greater than 1 that are only
	// divisible by themselves and 1
	public boolean isPrime(int number) {
		// edge cases
		if (number == 2) {
			return true;
		} else if (number < 2) {
			return false;
		} else {
			// algorithm for primes above 2
			for (int i = number - 1; i > 1; i--) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	public ArrayList<Integer> onlyPrimes(int[] numbers) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int number : numbers) {
			if (isPrime(number)) {
				primes.add(number);
			}
		}
		return primes;
	}

	public static void main(String[] args) {

		PrimeDirective pd = new PrimeDirective();
		int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
		System.out.println(pd.onlyPrimes(numbers));
	}

}