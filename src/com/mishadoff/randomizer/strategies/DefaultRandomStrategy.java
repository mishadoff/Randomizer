package com.mishadoff.randomizer.strategies;

import java.util.Random;

/**
 * Default random strategy is the simplest one.
 * It does not need special credits but has poor
 * uniform distribution.
 * 
 * @author mishadoff
 *
 */
public class DefaultRandomStrategy implements RandomStrategy {
	private Random random = new Random(System.currentTimeMillis());
	
	@Override
	public boolean generateBoolean() {
		return random.nextBoolean();
	}
	
	@Override
	public int generateInt(int n) {
		return random.nextInt(n);
	}
	
	@Override
	public double generateDouble() {
		return random.nextDouble();
	}
}
