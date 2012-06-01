package com.mishadoff.randomizer.util;

import com.mishadoff.randomizer.strategies.DefaultRandomStrategy;
import com.mishadoff.randomizer.strategies.RandomStrategy;

/**
 * Class util provides static methods for
 * flipping coin. Result is either head or tail, so
 * we represent it as boolean. Clients that uses code
 * should properly implement view due to returned value.
 * 
 * @author mishadoff
 *
 */
public class FlipCoinGenerator {
	private static boolean isFair = true;
	// TODO add exception with greater than one or lower than zero
	private static double trueProbability = 0.75;
	private static RandomStrategy random = new DefaultRandomStrategy();
	
	/**
	 * Returns generated boolean depends on settings state
	 * @return
	 */
	public static boolean flip(){
		if (isFair) {
			return random.generateBoolean();
		} else {
			return unFairFlip();
		}
	}
	
	private static boolean unFairFlip(){
		double split = random.generateDouble();
		if (split < trueProbability) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void setGenerateStrategy(RandomStrategy randomStrategy) {
		random = randomStrategy;
	}
	
	// TODO add settings change listener
}
