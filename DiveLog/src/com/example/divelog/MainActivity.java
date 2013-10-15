package com.example.divelog;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;
import android.database.sqlite.*;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ActionMode.Callback;
import android.view.View.OnClickListener;

import java.sql.*;
import java.*;



public class MainActivity extends Activity {
	
	/*public static final String BUCH_TABLE_NAME = "Logbuch";
	public static final String DATABASE_NAME = LOG_BUCH + ".db";
	private static int DATABASE_VERSION= 2;
	
	public static final int TGNR_COLUMN = 0;
	public static final int DATE_COLUMN = 2;
	public static final int TPLAZ_COLUMN = 3;
	public static final int TTIEFE_COLUMN = 4;
	public static final int TDAUER_COLUMN = 5;
	public static final int TBLEI_COLUMN = 6;
	public static final int TVFLASCHE_COLUMN = 7;
	public static final int TVERBRAUCH_COLUMN = 8;
	public static final int T_COLUMN = 0;
	
	
	private static class Logbuchhelper extends SQLiteOpenHelper {
		
		private Logbuchhelper(Context context, String name, SQLiteDatabase.CursorFactory factory)
		{
			super(context, name,factory, DATABASE_VERSION);
		}
		@Override
		public void onCreate(SQLiteDatabase sqLiteDatabase){
			createTable(sqLiteDatabase);
		}
		private void createTable(SQLiteDatabase sqLiteDatabase){
			String qs = "CREATE TABLE" + BUCH_TABLE_NAME+"("+ 
					FinchVideo.SimpleVideos._ID+
					" INTEGER PRIMARY KEY AUTOINCREMENT," +
					FinchVideo.LogBuch.DATE_NAME+" TEXT"+
					FinchVIdeo.LogBuch.TPLAZ_NAME+"TEXT;"+
					FinchVideo.LogBuch.TTiefe_NAME+ "TEXT);";
			sqLiteDatabase.execSQL(qs);
		}

	}*/
	
	private Button logbuchButton;
	private Button planerButton;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		logbuchButton = (Button)findViewById(R.id.main_logbuch);
		logbuchButton.setOnClickListener(logbuchOnclick);
		planerButton = (Button)findViewById(R.id.main_planer);
		planerButton.setOnClickListener(planerOnclick);
		
	}
	
	private OnClickListener planerOnclick = new OnClickListener(){
		
	
		@Override
		public void onClick(View v) {
				
			Intent intent = new Intent(getApplicationContext(), PlanerActivity.class);
			startActivity(intent);
		}
	
	};
	private OnClickListener logbuchOnclick = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
				
			Intent intent = new Intent(getApplicationContext(), PlanerActivity.class);
			startActivity(intent);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
