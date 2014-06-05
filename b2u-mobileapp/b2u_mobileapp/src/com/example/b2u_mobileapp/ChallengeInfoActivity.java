package com.example.b2u_mobileapp;

import android.app.Activity;
import android.os.Bundle;

public class ChallengeInfoActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.challenge_info);	
	}
	
}

/*

Code to scroll down to the "Details" button:

private final void focusOnView(){
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                your_scrollview.scrollTo(0, your_EditBox.getTop());
            }
        });
    }

*/