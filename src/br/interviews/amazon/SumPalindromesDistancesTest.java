package br.interviews.amazon;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

public class SumPalindromesDistancesTest {
	

	@Test 
	public void verifyKnowdResultChallengeQuestion(){
		assertTrue(SumPalindromesDistances.newInstance().calculateDistances(1, 1000000) == 495076635L);
	}
	
	@Test(expected = InvalidParameterException.class)
	public void verifyEqualInvalidParametrs(){
		SumPalindromesDistances.newInstance().calculateDistances(1, 1);
	}
	
	@Test(expected = InvalidParameterException.class)
	public void verifyInvalidParametrs(){
		SumPalindromesDistances.newInstance().calculateDistances(10, 1);
	}
	
	@Test 
	public void testeNumberSteo(){
		System.out.println(SumPalindromesDistances.newInstance().calculateDistances(1, 1000000));
	}	
}



















