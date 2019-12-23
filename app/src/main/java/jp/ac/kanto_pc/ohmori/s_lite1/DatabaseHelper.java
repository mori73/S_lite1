package jp.ac.kanto_pc.ohmori.s_lite1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
	private static final String DATABAE_NAME = "meibo_test";
	private static final int DATABASE_VERSION = 1;
	private static final String CREATE_TEST_M_TABLE =
		"create table test_m ("
		+ "rowid integer primary key autoincrement, "
		+ "num1 int, "
		+ "num2 int"
		+")";
	private static final String DROP_MEIBO_TABLE =
		"drop table if exists test_m";

	public DatabaseHelper(Context context) {
		super(context, DATABAE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_TEST_M_TABLE);
		db.execSQL("insert into test_m (num1, num2) values ('1', '2')");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL(DROP_MEIBO_TABLE);
		onCreate(db);
	}

}
