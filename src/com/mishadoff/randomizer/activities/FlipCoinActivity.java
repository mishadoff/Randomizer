package com.mishadoff.randomizer.activities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;

import com.mishadoff.randomizer.R;
import com.mishadoff.randomizer.audio.Sound;
import com.mishadoff.randomizer.generators.FlipCoinGenerator;

public class FlipCoinActivity extends Activity {
	private ImageView imageView;
	private TextView textView;
	
	// do we need this?
	private final Handler handler = new Handler();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flipcoin_view);
			imageView = (ImageView)findViewById(R.id.coin_image);
			textView = (TextView)findViewById(R.id.flip_summary);
	}

	public void flipCoinClick(View view){
		// TODO refactor this method
		// generate
		boolean result = FlipCoinGenerator.flip();
		// parameters to change
		// TODO summary detection
		final int summaryResource;
		final int imageResource;
		
		final int DELAY_IN_MS = 500;
		
		// TODO image generator (similar to query)
		if (result) {
			imageResource = R.drawable.head_ukr;
			summaryResource = R.string.flipResultHead;
		} else {
			imageResource = R.drawable.tail_ukr;
			summaryResource = R.string.flipResultTail;
		}
		
		final Activity ctx = this;	// obtain ctx to playy the sound
		Runnable update = new Runnable() {
			public void run() {
		        imageView.setImageResource(imageResource);
				textView.setText(summaryResource, BufferType.NORMAL);
				//FIXME NPE on Emulator Sound.coinDrop(ctx);
			}
		};
		handler.postAtTime(update, SystemClock.uptimeMillis() + DELAY_IN_MS);
		
		
		// delay
		final ProgressDialog dialog = ProgressDialog.show(this, "Randomizer", "Generating...", true);
	    new Thread() {
	        public void run() {
	            try {
	                // sleep the thread, whatever time you want. 
	                sleep(DELAY_IN_MS);
	            } catch (Exception e) {
	            }
	            dialog.dismiss();
	        }
	    }.start();
	}
}
