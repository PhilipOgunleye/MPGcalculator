package philip.mpgcalculator;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);}
		
		public void onButtonClick(View v){
			
			int n1, n2, result;
			EditText e1 = (EditText) findViewById(R.id.milesET);
			EditText e2 = (EditText) findViewById(R.id.gallonET);
			TextView t1 = (TextView) findViewById(R.id.mpgTV);
			
			n1 = Integer.parseInt(e1.getText().toString());
			n2 = Integer.parseInt(e2.getText().toString());
			result = n1 / n2;
			t1.setText(Integer.toString(result));
			
		}
		
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	}
