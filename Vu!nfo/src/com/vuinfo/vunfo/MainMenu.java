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

public class MainMenu extends ListActivity {

	String list[] = { "Povijest", "Struktura", "Znamenitosti i kultura",
			"Sport", "Najvažniji brojevi", "Karta", "Smještaj", "Restorani",
			"Trgovaèki centri", "Benzinske postaje", "Ljekarne",
			"Aktualna dogaðanja", "VUuEU", "VUBusStop", "Opcije" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(MainMenu.this,
				android.R.layout.simple_list_item_1, list));

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		super.onListItemClick(l, v, position, id);
		String selection = l.getItemAtPosition(position).toString();
	
		if (selection == "Povijest") {

			Intent history = new Intent(this, History.class);
			startActivity(history);
		}

		if (selection == "Struktura") {
			Intent structure = new Intent(this, Structure.class);
			startActivity(structure);

		}

		if (selection == "Znamenitosti i kultura") {
			Intent sightsCulture = new Intent(this, SightsCulture.class);
			startActivity(sightsCulture);

		}

		if (selection == "Sport") {
			Intent sports = new Intent(this, SportsActivity.class);
			startActivity(sports);

		}

		if (selection == "Najvažniji brojevi") {
			Intent numbers = new Intent(this, Numbers.class);
			startActivity(numbers);

		}

		if (selection == "Karta") {
			Intent map = new Intent(this, Map.class);
			startActivity(map);

		}

		if (selection == "Smještaj") {
			Intent hotels = new Intent(this, HotelsActivity.class);
			startActivity(hotels);

		}

		if (selection == "Restorani") {
			Intent restaurant = new Intent(this, RestaurantActivity.class);
			startActivity(restaurant);

		}

		if (selection == "Trgovaèki centri") {
			Intent shoppingCenters = new Intent(this,
					ShoppingCentersActivity.class);
			startActivity(shoppingCenters);

		}

		if (selection == "Benzinske postaje") {
			Intent gas = new Intent(this, GasStationActivity.class);
			startActivity(gas);

		}

		if (selection == "Ljekarne") {
			Intent drugstore = new Intent(this, DrugstoreActivity.class);
			startActivity(drugstore);

		}

		if (selection == "Aktualna dogaðanja") {
			Intent events = new Intent(this, Events.class);
			startActivity(events);

		}

		if (selection == "VUuEU") {
			Intent vuEu = new Intent(this, VUuEU.class);
			startActivity(vuEu);

		}

		if (selection == "VUBusStop") {
			Intent vuBus = new Intent(this, VUBusStop.class);
			startActivity(vuBus);

		}

		if (selection == "Opcije") {
			Intent options = new Intent(this, Options.class);
			startActivity(options);

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
