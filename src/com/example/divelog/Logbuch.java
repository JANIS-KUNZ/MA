//package com.example.divelog;
//
//import android.database.sqlite.SQLiteOpenHelper;
//
//public class Logbuch extends SQLiteOpenHelper{
//	public void newTg(String datum, String ort, Short tgNr, Float tiefe, Float dauer, Float temperatur, Float barstart,
//			Float barende, Boolean suess, Boolean salz, Boolean ufer, Boolean boot, Float blei  ){
//		String sql =
//				"ISERT INTO tGs"+
//		"( datum, ort, tgNr, tiefe, dauer, temperatur, barstart, barende,suess,salz, ufer, boot,  blei)"+
//						"VALUES"+
//		"(?,?,?,?,?,?,?,?,?,?,?,?,?)"+
//						Object[] bindArgs = new Object[]{datum, ort, tgNr, tiefe, dauer, temperatur, barstart, barende,suess,salz, ufer, boot,  blei};
//		try{
//			getWritablDatabase().execSQL(sql, bindArgs);
//			}
//		
//						
//	}
//
//}
