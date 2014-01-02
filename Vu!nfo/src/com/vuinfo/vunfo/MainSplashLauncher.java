package com.vuinfo.vunfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainSplashLauncher extends Activity {

	private Handler mHandler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_launcher);

		mHandler.postDelayed(mStartView, 2000);
	}

	private Runnable mStartView = new Runnable() {

		@Override
		public void run() {
			Intent intent = new Intent(MainSplashLauncher.this, MainMenu.class);
			startActivity(intent);
			finish();
		}

	};

}
