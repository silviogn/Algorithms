package br.edu.interviews;

import java.util.ArrayList;
import java.util.List;

/*
 * "Given a dictionary, and a matrix of letters, find all the words in the matrix that are in the dictionary." 
 * - Software Engineer candidate
 *	Read more: http://www.businessinsider.com/airbnb-interview-questions-2015-4?op=1#ixzz3WF18tF96
 */

public class AibrbnbSoftwareEngineerDictionary {

	private static final Character INITIAL_LETTER = 'a';
	private static final int INITIAL_VALUE = Character.valueOf(INITIAL_LETTER).hashCode();
	private static final int LIST_LETTER_SIZE = 26;
	private static final int ZERO = 0;

	public static String[] getContainedWords(String[] dictionary, String letters) {
		List<String> returnWords = new ArrayList<String>();
		byte[] listLetters = new byte[LIST_LETTER_SIZE];
		initializeListLetters(listLetters, letters, INITIAL_VALUE);

		boolean found;
		for (String word : dictionary) {
			found = true;
			for (Character c : word.toCharArray()) {
				if (listLetters[c.hashCode() - INITIAL_VALUE] == ZERO) {
					found = false;
					break;
				}
			}
			if (found) {
				returnWords.add(word);
			}
		}
		return returnWords.toArray(new String[ZERO]);
	}

	private static void initializeListLetters(byte[] listLetters, String letters, int initial) {
		for (Character c : letters.toCharArray()) {
			listLetters[c.charValue() - initial] = 1;
		}
	}
}
