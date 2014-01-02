package com.vuinfo.vunfo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class History extends ListActivity implements OnItemClickListener {

	String htryList[] = { "Uvod i lokacija", "Rana povijest", "Populacija",
			"Ponovno naseljavanje", "Znanost i kultura",
			"Vukovar pod Jugoslavijom", "Vukovar u Domovinskom ratu" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(History.this,
				android.R.layout.simple_list_item_1, htryList));
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		switch (position) {
		case 0:

			break;

		default:
			break;
		}

	}
}
