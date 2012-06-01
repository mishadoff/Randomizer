package com.mishadoff.randomizer.activities;

import com.mishadoff.randomizer.R;

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
		Intent intent = new Intent(RandomizerActivity.this, FlipCoinActivity.class);
        startActivity(intent);
	}
	
	public void diceRollerClick(View view){
		Toast.makeText(this, "Dice Roller click", Toast.LENGTH_SHORT).show();
		return;
	}
	
	public void cardsClick(View view){
		Toast.makeText(this, "Cards click!", Toast.LENGTH_SHORT).show();
		return;
	}
	
	public void lotteryHelperClick(View view){
		Toast.makeText(this, "Lottery helper click", Toast.LENGTH_SHORT).show();
		return;
	}
	
	public void bitmapGeneratorClick(View view){
		Toast.makeText(this, "Bitmap generator click!", Toast.LENGTH_SHORT).show();
		return;
	}
	
	public void customClick(View view){
		Toast.makeText(this, "Custom click", Toast.LENGTH_SHORT).show();
		return;
	}
	
	public void helpClick(View view){
		Toast.makeText(this, "Help click!", Toast.LENGTH_SHORT).show();
		return;
	}
	
	public void aboutClick(View view){
		Toast.makeText(this, "About click", Toast.LENGTH_SHORT).show();
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