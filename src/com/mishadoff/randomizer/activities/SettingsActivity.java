package com.mishadoff.randomizer.activities;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.mishadoff.randomizer.R;

public class SettingsActivity extends PreferenceActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
	}
}
