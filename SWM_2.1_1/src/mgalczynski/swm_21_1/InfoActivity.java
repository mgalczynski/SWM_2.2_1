package mgalczynski.swm_21_1;

import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class InfoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);

		ListView lv = (ListView) findViewById(R.id.listView);
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		    String value = extras.getString("data");

			final String[] data = value.split("\n");
			try {
				setTitle(data[0]);
				final String[] arguments = Arrays.copyOfRange(data, 1,
						data.length);
				lv.setAdapter(new ArrayAdapter<String>(this,
						android.R.layout.simple_list_item_1, arguments));

				
			} catch (ArrayIndexOutOfBoundsException ex) {
			}
		}
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent in = new Intent(InfoActivity.this,
						MainActivity.class);
				startActivity(in);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.info, menu);
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
