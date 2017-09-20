package course.labs.activitylab;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ActivityTwo extends Activity {

	// string for logcat documentation
	private final static String TAG = "Lab-ActivityTwo";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		
		//Log cat print out
		Log.i(TAG, "onCreate called");
	}

	@Override
	public void onStart(){
		super.onStart();

		//Log cat print out
		Log.i(TAG, "onStart called");
	}

	@Override
	public void onResume() {
		super.onResume();

		Log.i(TAG, "onResume called");
	}

	@Override
	public void onPause() {
		super.onPause();

		Log.i(TAG, "onPause called");
	}

	@Override
	public void onStop() {
		super.onStop();

		Log.i(TAG, "onStop called");
	}

	@Override
	public void onRestart() {
		super.onRestart();

		Log.i(TAG, "onRestart called");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		Log.i(TAG, "onDestroy called");
	}

	public void launchActivityOne(View view) {
		finish();
	}
}
