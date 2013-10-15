package com.example.divelog;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class PlanerActivity extends Activity{
	
	private Button berechenButton;
	private EditText tiefe1;
	int tInt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_planer);
		tiefe1 = (EditText)findViewById(R.id.edit_tiefe1);
		String t1= tiefe1.getText().toString();
		tInt=Integer.parseInt(t1);
		berechenButton = (Button)findViewById(R.id.rechen_button);
		berechenButton.setOnClickListener(newBerechnerOnclick);
		
	}
	private OnClickListener newBerechnerOnclick = new OnClickListener(){

		@Override
		public void onClick(View v) { 
			// TODO Auto-generated method stub
			
		}
		
	
		
		
	
	};
}