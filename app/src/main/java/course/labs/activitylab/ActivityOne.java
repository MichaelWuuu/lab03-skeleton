package course.labs.activitylab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ActivityOne extends Activity {

		// string for logcat documentation
		private final static String TAG = "Lab-ActivityOne";

		// lifecycle counts
		//TODO: Create 7 counter variables, each corresponding to a different one of the lifecycle callback methods.
		//TODO:  increment the variables' values when their corresponding lifecycle methods get called.
		private int onCreateCount = 0;
		private int onStartCount = 0;
		private int onResumeCount = 0;
		private int onPauseCount =0;
		private int onStopCount = 0;
		private int onRestartCount = 0;
		private int onDestroyCount = 0;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_one);
			
			//Log cat print out
			Log.i(TAG, "onCreate called");

//			if ((savedInstanceState != null)
//					&& savedInstanceState.containsKey("create")
//					&& savedInstanceState.containsKey("start")
//					&& savedInstanceState.containsKey("resume")
//					&& savedInstanceState.containsKey("pause")
//					&& savedInstanceState.containsKey("stop")
//					&& savedInstanceState.containsKey("restart")
//					&& savedInstanceState.containsKey("destroy")) {
//				onCreateCount = savedInstanceState.getInt("create");
//				onStopCount = savedInstanceState.getInt("start");
//				onResumeCount = savedInstanceState.getInt("resume");
//				onPauseCount = savedInstanceState.getInt("pause");
//				onStopCount = savedInstanceState.getInt("stop");
//				onRestartCount = savedInstanceState.getInt("restart");
//				onDestroyCount = savedInstanceState.getInt("destroy");
//			}
			
			//TODO: update the appropriate count variable & update the view
			onCreateCount++;
			TextView tv = (TextView) findViewById(R.id.create);
			tv.setText(getString(R.string.onCreate) + onCreateCount);
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_one, menu);
			return true;
		}
		
		// lifecycle callback overrides
		
		@Override
		public void onStart(){
			super.onStart();
			
			//Log cat print out
			Log.i(TAG, "onStart called");
			
			//TODO:  update the appropriate count variable & update the view
			onStartCount++;
			TextView tv = (TextView) findViewById(R.id.start);
			tv.setText(getString(R.string.onStart) + onStartCount);
		}

	    // TODO: implement 5 missing lifecycle callback methods

		@Override
		public void onResume() {
			super.onResume();

			Log.i(TAG, "onResume called");

			onResumeCount++;
			TextView tv = (TextView) findViewById(R.id.resume);
			tv.setText(getString(R.string.onResume) + onResumeCount);
		}

		@Override
		public void onPause() {
			super.onPause();

			Log.i(TAG, "onPause called");

			onPauseCount++;
			TextView tv = (TextView) findViewById(R.id.pause);
			tv.setText(getString(R.string.onPause) + onPauseCount);
		}

		@Override
		public void onStop() {
			super.onStop();

			Log.i(TAG, "onStop called");

			onStopCount++;
			TextView tv = (TextView) findViewById(R.id.stop);
			tv.setText(getString(R.string.onStop) + onStopCount);
		}

		@Override
		public void onRestart() {
			super.onRestart();

			Log.i(TAG, "onRestart called");

			onRestartCount++;
			TextView tv = (TextView) findViewById(R.id.restart);
			tv.setText(getString(R.string.onRestart) + onRestartCount);
		}

		@Override
		public void onDestroy() {
			super.onDestroy();

			Log.i(TAG, "onDestroy called");

			onDestroyCount++;
			TextView tv = (TextView) findViewById(R.id.destroy);
			tv.setText(getString(R.string.onDestroy) + onDestroyCount);
		}

		@Override
		public void onSaveInstanceState(Bundle savedInstanceState){
			//TODO:  save state information with a collection of key-value pairs & save all  count variables
			super.onSaveInstanceState(savedInstanceState);
			// save counters
			savedInstanceState.putInt("create", onCreateCount);
			savedInstanceState.putInt("start", onStartCount);
			savedInstanceState.putInt("resume", onResumeCount);
			savedInstanceState.putInt("pause", onPauseCount);
			savedInstanceState.putInt("stop", onStopCount);
			savedInstanceState.putInt("restart", onRestartCount);
			savedInstanceState.putInt("destroy", onDestroyCount);
		}

		@Override
		public void onRestoreInstanceState(Bundle savedInstanceState) {
			super.onRestoreInstanceState(savedInstanceState);

			onCreateCount = savedInstanceState.getInt("create");
			onStopCount = savedInstanceState.getInt("start");
			onResumeCount = savedInstanceState.getInt("resume");
			onPauseCount = savedInstanceState.getInt("pause");
			onStopCount = savedInstanceState.getInt("stop");
			onRestartCount = savedInstanceState.getInt("restart");
			onDestroyCount = savedInstanceState.getInt("destroy");
		}


		public void launchActivityTwo(View view) {
			startActivity(new Intent(this, ActivityTwo.class));
		}
		

}
