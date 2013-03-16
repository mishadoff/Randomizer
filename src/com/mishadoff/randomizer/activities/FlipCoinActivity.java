package com.mishadoff.randomizer.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;

import com.mishadoff.randomizer.R;
import com.mishadoff.randomizer.generators.FlipCoinGenerator;

public class FlipCoinActivity extends Activity {
	private ImageView imageView;
	private TextView textView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flipcoin_view);
			imageView = (ImageView)findViewById(R.id.coin_image);
			textView = (TextView)findViewById(R.id.flip_summary);
	}

	public void flipCoinClick(View view){
		// generate
		boolean result = FlipCoinGenerator.flip();
		// parameters to change
		// TODO summary detection
		int summaryResource = 0;
		int imageResource = 0;
		
		// TODO image generator (similar to query)
		if (result) {
			imageResource = R.drawable.head_ukr;
			summaryResource = R.string.flipResultHead;
		} else {
			imageResource = R.drawable.tail_ukr;
			summaryResource = R.string.flipResultTail;
		}
		imageView.setImageResource(imageResource);
		textView.setText(summaryResource, BufferType.NORMAL);
	}
}
