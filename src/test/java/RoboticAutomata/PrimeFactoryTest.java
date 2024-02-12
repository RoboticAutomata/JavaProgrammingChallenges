package RoboticAutomata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeFactoryTest {
	@Test(dependsOnMethods = "isPrimeTest")
	public void stripNonPrimesPositiveTest() {
		List<Integer> primes = new ArrayList<Integer>(Arrays.asList(2, 3, 7, 11));
		Assert.assertEquals(primes, PrimeFactory.stripNonPrimes(primes));
	}

	@Test(dependsOnMethods = "isPrimeTest")
	public void stripNonPrimesNegativeTest() {
		List<Integer> nonPrimes = new ArrayList<Integer>(Arrays.asList(4, 10, 12, 33));
		List<Integer> expected = new ArrayList<Integer>();
		Assert.assertEquals(expected, PrimeFactory.stripNonPrimes(nonPrimes));
	}

	@Test
	public void isPrimeTest() {
		Assert.assertTrue(PrimeFactory.isPrime(2));

		Assert.assertTrue(PrimeFactory.isPrime(7));

		Assert.assertFalse(PrimeFactory.isPrime(10));

		Assert.assertFalse(PrimeFactory.isPrime(12));
	}
}
