package com.vuinfo.vunfo;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class History extends ListActivity {

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
	protected void onListItemClick(ListView l, View v, int position, long id) {

		super.onListItemClick(l, v, position, id);
		String selection = l.getItemAtPosition(position).toString();

		if (selection == "Uvod i lokacija") {

			Intent histyIntro = new Intent(this, HistyIntro.class);
			startActivity(histyIntro);
		}

		if (selection == "Rana povijest") {
			Intent histyErly = new Intent(this, HistyErly.class);
			startActivity(histyErly);

		}

		if (selection == "Populacija") {
			Intent histyPopulation = new Intent(this, HistyPopulation.class);
			startActivity(histyPopulation);

		}

		if (selection == "Ponovno naseljavanje") {
			Intent histyReColonization = new Intent(this,
					HistyReColonization.class);
			startActivity(histyReColonization);

		}

		if (selection == "Znanost i kultura") {
			Intent histyScienceC = new Intent(this, HistyScienceC.class);
			startActivity(histyScienceC);

		}

		if (selection == "Vukovar pod Jugoslavijom") {
			Intent histyVuJugo = new Intent(this, HistyVuJugo.class);
			startActivity(histyVuJugo);

		}

		if (selection == "Vukovar u Domovinskom ratu") {
			Intent histyVuWar = new Intent(this, HistyVuWar.class);
			startActivity(histyVuWar);

		}
	}

	@SuppressLint("NewApi")
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#336699")));
		return true;
	}
}
