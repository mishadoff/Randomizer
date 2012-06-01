package com.mishadoff.randomizer.strategies;

/**
 * Public interface for various random strategies
 * @author mishadoff
 *
 */
public interface RandomStrategy {
	boolean generateBoolean();
	int generateInt(int n);
	double generateDouble();
}