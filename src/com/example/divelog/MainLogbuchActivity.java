package com.example.divelog;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainLogbuchActivity extends Activity {
	
	
	private Button newLogbuch;
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		newLogbuch = (Button)findViewById(R.id.new_logbuch);
		newLogbuch.setOnClickListener(newLogbuchOnClick);
	}
	private OnClickListener newLogbuchOnClick = new OnClickListener(){
		@Override
		public void onClick(View v) {
				
			Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
			startActivity(intent);
		}
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
