package com.vuinfo.vunfo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class MainMenu extends ListActivity implements OnItemClickListener {

	String list[] = { "Povijest", "Struktura", "Znamenitosti i kultura",
			"Sport", "Najvažniji brojevi", "Karta", "Smještaj i restorani",
			"Trgovaèki centri i benzinske postaje", "Aktualna dogaðanja",
			"VUuEU", "VUBusStop", "Opcije" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(MainMenu.this,
				android.R.layout.simple_list_item_1, list));

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		switch (position) {

		case 0:
			Intent history = new Intent(this, History.class);
			startActivity(history);
			break;

		case 1:
			Intent structure = new Intent(this, Structure.class);
			startActivity(structure);
			break;

		case 2:
			Intent sightsCulture = new Intent(this, SightsCulture.class);
			startActivity(sightsCulture);
			break;

		case 3:
			Intent sports = new Intent(this, SportsActivity.class);
			startActivity(sports);
			break;

		case 4:
			Intent numbers = new Intent(this, Numbers.class);
			startActivity(numbers);
			break;

		case 5:
			Intent map = new Intent(this, Map.class);
			startActivity(map);
			break;

		case 6:
			Intent hotelsRestaurants = new Intent(this, HotelsRestaurants.class);
			startActivity(hotelsRestaurants);
			break;

		case 7:
			Intent shoppingGas = new Intent(this, ShoppingGas.class);
			startActivity(shoppingGas);
			break;

		case 8:
			Intent events = new Intent(this, Events.class);
			startActivity(events);
			break;

		case 9:
			Intent vuBus = new Intent(this, VUBusStop.class);
			startActivity(vuBus);
			break;

		case 10:
			Intent vuEu = new Intent(this, VUuEU.class);
			startActivity(vuEu);
			break;

		case 11:
			Intent options = new Intent(this, Options.class);
			startActivity(options);
			break;

		default:
			break;
		}

	}

}
