package com.mishadoff.randomizer.activities;

import java.util.Random;

public class RandomUtil {
	private static Random random = new Random(System.currentTimeMillis());
	
	/**
	 * Method used for generating int number between from (inclusively) and
	 * to (exclusively).
	 * @param from
	 * @param to
	 * @return
	 */
	public static int generateInt(int from, int to){
		int length = to - from;
		return random.nextInt(length) + from;
	}
	
	public static double generateDoubleUniform(){
		return random.nextDouble();
	}
	
	public static double generateDoubleGaussian(){
		return random.nextGaussian();
	}
	
}
