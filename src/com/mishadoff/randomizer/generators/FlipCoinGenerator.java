package com.mishadoff.randomizer.generators;

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
	private static double trueProbability = 0.5;
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
	
	public static void setTrueProbability(double prob) {
		if (prob < 0 || prob > 1.0) {
			throw new IllegalArgumentException("Probability must be in range [0..1]");
		}
		trueProbability = prob;
	}
	
	// TODO add settings change listener for random strategy
	// TODO add settings change listener for FlipCoin properties
}
