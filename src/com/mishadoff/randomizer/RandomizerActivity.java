package com.mishadoff.randomizer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RandomizerActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.randomizer);
    }
	
	public void flipCoinClick(View view){
		Toast.makeText(this, "Flip coin click!", Toast.LENGTH_SHORT).show();
		return;
	}
	
	public void diceRollerClick(View view){
		Toast.makeText(this, "Dice Roller click", Toast.LENGTH_SHORT).show();
		return;
	}
	
	
	
	public void diceButtonHandler(View view){
    	Intent intent = new Intent(RandomizerActivity.this, DiceActivity.class);
        startActivity(intent);
    }
    
    public void intButtonHandler(View view){
    	Intent intent = new Intent(RandomizerActivity.this, IntActivity.class);
        startActivity(intent);
    }
    
    public void doubleButtonHandler(View view){
    	Intent intent = new Intent(RandomizerActivity.this, DoubleActivity.class);
        startActivity(intent);
    }
    
    public void aboutButtonHandler(View view){
    	// TODO extract to resource
    	new AlertDialog.Builder(this).setMessage("Author: Mykhailo Kozik\nVersion: 0.0.1").show();
    }
}