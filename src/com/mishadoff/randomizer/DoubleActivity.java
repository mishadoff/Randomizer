package com.mishadoff.randomizer;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DoubleActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doubleview);
    }
	
	public void doubleGenerateHandler(View view){
		int decimalDigits = 4;	// TODO make this configurable
		DecimalFormat format = new DecimalFormat(buildFormat(decimalDigits));
		
		TextView text = (TextView) findViewById(R.id.doubleResultArea);
		double gen = RandomUtil.generateDoubleUniform();	// TODO make configurable distribution type
		text.setText(format.format(gen));
	}
	
	private String buildFormat(int n){
		StringBuilder builder =  new StringBuilder();
		builder.append("#.");
		for (int i = 0; i < n; i++) {
			builder.append("#");
		}
		return builder.toString();
	}
}
