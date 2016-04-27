package br.interviews.amazon;

import java.security.InvalidParameterException;
import java.util.Hashtable;

/*Palindrome Distances
A palindromic integer is an integer with no leading zeroes of which the digits are reversible, for example 9, 22, 12321 or 86755768.
For an integer M, define D(M) as the distance to the next palindrome P, such that 
M + D(M) = P, with P >= M, P a minimum.
For example, D(121) = 0 since 121 is a palindrome itself, and D(122) = 9 since 122 + 9 = 131, the next palindrome after 122.
The sum of D(M) over all positive integers less than 106 is 495076635.
What is the sum of D(M) over all positive integers less than 1012?*/

public class SumPalindromesDistances {

	/*
	 * Persiste the distance between two palindromes and the sum of distances.
	 * This is use to not recalculate the distances when a new couple of
	 * palindromes with the same distance is found.
	 */
	private Hashtable<Long, Long> distancesSumList = null;

	/*
	 * Constructor was modified to private.
	 */
	private SumPalindromesDistances() {
		distancesSumList = new Hashtable<Long, Long>();
	}

	/*
	 * Return the size in digits of a certain number.
	 */
	private int getNumberSize(long number) {
		return String.valueOf(number).length();
	}

	/*
	 * This method return the distance to the next palindrome according the size
	 * of the number and if the size number is odd or pair.
	 */
	private int stepNumber(long number) {
		int numberSize = getNumberSize(number);
		int stepNumberTemp = 0;
		int step = 0;
		
		if (numberSize == 1) {
			return 1;
		}
		
		step = 2 + ((numberSize % 2) == 0 ? 0 : 1);
		stepNumberTemp = 10 + ((numberSize % 2) == 0 ? 1 : 0);

		while (step < numberSize) {
			stepNumberTemp = stepNumberTemp * 10;
			step += 2;
		}
		return stepNumberTemp;
	}

	/*
	 * Verify if the size in digits of two numbers is different.
	 */
	private boolean digitSizeChange(long first, long second) {
		return getNumberSize(first) != getNumberSize(second);
	}

	/*
	 * Return the next correct palindrome. Veriy changes in left digits until
	 * the center.
	 */
	private long nextCorrectPalindrome(long actual, long next) {
		int center = ((getNumberSize(actual) % 2) == 0) ? 2 : 1;
		int iteration = (getNumberSize(actual) - center) / 2;

		if (iteration <= 0) {
			return next;
		}

		char[] actualPalindrome = String.valueOf(actual).toCharArray();
		char[] nextPalindrome = String.valueOf(next).toCharArray();

		int factor = 11;
		for (int i = 0; i < iteration; i++) {
			if (actualPalindrome[i] != nextPalindrome[i]) {
				return factor + actual;
			}
			factor = factor * 10;
		}
		return next;
	}

	/*
	 * Sum distances between two palindromes.
	 */
	private long sumDistances(long start, long end) {
		long totaldistance = 0;
		for (long j = start + 1; j <= end; j++) {
			totaldistance += (end - j);
		}
		return totaldistance;
	}

	/**
	 * Return the sum of distances between two numbers. 
	 */
	private long getSumDistaces(long prior, long next) {
		long distance = next - prior;
		Long sumDistance = distancesSumList.get(distance);

		if (sumDistance == null) {
			sumDistance = sumDistances(prior, next);
			distancesSumList.put(distance, sumDistance);
			return sumDistance;
		} else {
			return sumDistance;
		}
	}

	/*
	 * Return a new instance of the class. The visibility of the constructor was
	 * modified to private.
	 */
	public static SumPalindromesDistances newInstance() {
		return new SumPalindromesDistances();
	}

	/**
	 * Return the sum of the distance between the palindromes between two
	 * numbers.
	 */
	public long calculateDistances(long first, long end) {

		if (end <= first) {
			throw new InvalidParameterException("The initial number can't be greater or equals then the final.");
		}

		long palindrome = first;
		long prior = first;
		long nextPalindrome = 0;
		long sum = 0;
		distancesSumList.clear();

		while (true) {
			nextPalindrome = palindrome + stepNumber(palindrome);
			prior = palindrome;
			palindrome = digitSizeChange(palindrome, nextPalindrome) ? palindrome + 2 : nextCorrectPalindrome(palindrome, nextPalindrome);
	
			if (palindrome > end) {
				break;
			}
			sum += getSumDistaces(prior, palindrome);
			//System.out.println(palindrome + " - 0"+String.valueOf(palindrome).length());
		}
		return sum;
	}
}
