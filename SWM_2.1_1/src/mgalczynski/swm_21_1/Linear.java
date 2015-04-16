package mgalczynski.swm_21_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Linear extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_linear);
		final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), InfoActivity.class);
            	int stars = (int) (((RatingBar) findViewById(R.id.ratingBar1)).getRating()); 
            	ToggleButton t = (ToggleButton) findViewById(R.id.toggleButton1);
            	String toogle = t.isChecked()? "Tak":"Nie";
            	CheckBox ch = (CheckBox) findViewById(R.id.checkbox1);
            	String checkbox = ch.isChecked()? "Tak":"Nie";
            	Switch s = (Switch) findViewById(R.id.switch1);
            	String swit = s.isChecked()? "Tak":"Nie";
            	i.putExtra("data","Informacje\nOceniono na: " + String.valueOf(stars) + "\nWciœniêto: " + toogle + "\nCheckBox: " + checkbox + "\nSwitch: " + swit);
            	startActivity(i);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.relative, menu);
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
