package com.mishadoff.randomizer.audio;

import android.app.Activity;
import android.media.MediaPlayer;

import com.mishadoff.randomizer.R;

/**
 * Repository for plaing sound effects.
 * 
 * @author mishadoff
 *
 */
public final class Sound {
	private Sound() {}
	
	private static void play(Activity ctx, int resourceId) {
		// TODO what to do if resource is not sound
		MediaPlayer.create(ctx, resourceId).start();  
	}
	
	public static void coinDrop(Activity ctx) {
		play(ctx, R.raw.coin_drop);
	}
}
