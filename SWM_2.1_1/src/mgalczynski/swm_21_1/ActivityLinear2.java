package mgalczynski.swm_21_1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ActivityLinear2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_linear2);
		final ImageButton button = (ImageButton) findViewById(R.id.imageButton1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), InfoActivity.class);
            	EditText e = (EditText) findViewById(R.id.editText1);
            	String txt = e.getText().toString();
            	i.putExtra("data","Wpisano\n" + txt);
            	Context context = getApplicationContext();
            	CharSequence text = String.valueOf(txt.length());
            	int duration = Toast.LENGTH_SHORT;
            	Toast toast = Toast.makeText(context, text, duration);
            	toast.show();
            	startActivity(i);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_linear2, menu);
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
