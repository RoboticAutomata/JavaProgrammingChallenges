package RoboticAutomata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactory {

	private static List<Boolean> primeStatus = new ArrayList<Boolean>(
			  Arrays.asList(null, null, true)
			);
	/** 
	 * Takes a list of numbers and strips the non primes
	 * Does not alter the given list
	 * 
	 * @param input a list of numbers
	 * @return New list with only the primes present
	 */
	protected static List<Integer> stripNonPrimes(List<Integer> input) {
		List<Integer> result = new ArrayList<Integer>();
		
		for (int element : input) {
			if (isPrime(element))
				result.add(element);
		}
		
		return result;
	}

	/** 
	 * Verifies if input is prime or not
	 * @param input to be checked for prime status
	 * @return true if prime, false otherwise
	 */
	protected static boolean isPrime(int input) {
		while (input >= primeStatus.size())
			primeStatusBuilder();
		return primeStatus.get(input);
	}

	/** increase the size of primeStatus by 1 */
	private static void primeStatusBuilder() {
		int numberToCheck = primeStatus.size();
		boolean isPrime = true;
		for (int i = 2; isPrime && i < numberToCheck; i++) {
			if (0 == numberToCheck % i) {
				isPrime = false;
			}
		}
		primeStatus.add(isPrime);
	}

}
