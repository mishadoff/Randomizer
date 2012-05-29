package com.mishadoff.randomizer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IntActivity extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intview);
    }
	
	public void intGenerateHandler(View view){
		EditText from = (EditText) findViewById(R.id.fromTextEdit);
		EditText to = (EditText) findViewById(R.id.toTextEdit);
		
		// validate num1
		if (from.length() == 0) {
			Toast.makeText(this, "Enter from value", Toast.LENGTH_SHORT).show();
			return;
		}
		
		// validate num2
		if (to.length() == 0) {
			Toast.makeText(this, "Enter to value", Toast.LENGTH_SHORT).show();
			return;
		}
		
		int fromInt = 0;
		int toInt = 0;
		
		// validate parse1
		try {
			fromInt = Integer.parseInt(from.getText().toString());
		}
		catch (NumberFormatException e) {
			Toast.makeText(this, "From should be an integer", Toast.LENGTH_SHORT).show();
			return;
		}
		
		// validate parse2
		try {
			toInt = Integer.parseInt(to.getText().toString());
		} catch (NumberFormatException e) {
			Toast.makeText(this, "To should be an integer", Toast.LENGTH_SHORT).show();
			return;
		}

		// validate interval
		if (fromInt >= toInt) {
			Toast.makeText(this, "FROM should be lower than TO", Toast.LENGTH_SHORT).show();
			return;
		}
		
		int generated = RandomUtil.generateInt(fromInt, toInt);
		TextView result = (TextView) findViewById(R.id.intResultArea);
		result.setText("" + generated);
	}
	
}
