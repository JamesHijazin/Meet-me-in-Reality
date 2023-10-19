
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		splash_opening_3
	 *	@date 		Tuesday 17th of October 2023 12:08:02 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.meetmereality;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class splash_opening_3_activity extends Activity {

	
	private View _bg__splash_opening_3;
	private ImageView vector;
	private ImageView vector_ek1;
	private View _bg__iphone_icons_ek1;
	private TextView _21_00;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private View _bg__fa_battery_3_ek1;
	private ImageView vector_ek4;
	private View _bg__frame_5_ek1;
	private ImageView rectangle_3;
	private TextView near_by_locations;
	private View rectangle_4;
	private View _bg__frame_5_ek3;
	private View _bg__pharmacy_ek1;
	private View rectangle_5;
	private TextView pharmacies;
	private View _bg__group_ek1;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private ImageView vector_ek7;
	private ImageView vector_ek8;
	private ImageView citt__party_time;
	private TextView match_with_peers_who_share_your_interests_and_break_the_ice_and_chat__explore_hidden_gems__find_popular_hangout_spots_locate_more;
	private TextView discover__;
	private TextView connect;
	private View _rectangle_121;
	private ImageView arrow_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_opening_3);

		
		_bg__splash_opening_3 = (View) findViewById(R.id._bg__splash_opening_3);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		_bg__iphone_icons_ek1 = (View) findViewById(R.id._bg__iphone_icons_ek1);
		_21_00 = (TextView) findViewById(R.id._21_00);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		_bg__fa_battery_3_ek1 = (View) findViewById(R.id._bg__fa_battery_3_ek1);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		_bg__frame_5_ek1 = (View) findViewById(R.id._bg__frame_5_ek1);
		rectangle_3 = (ImageView) findViewById(R.id.rectangle_3);
		near_by_locations = (TextView) findViewById(R.id.near_by_locations);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		_bg__frame_5_ek3 = (View) findViewById(R.id._bg__frame_5_ek3);
		_bg__pharmacy_ek1 = (View) findViewById(R.id._bg__pharmacy_ek1);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		pharmacies = (TextView) findViewById(R.id.pharmacies);
		_bg__group_ek1 = (View) findViewById(R.id._bg__group_ek1);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
		citt__party_time = (ImageView) findViewById(R.id.citt__party_time);
		match_with_peers_who_share_your_interests_and_break_the_ice_and_chat__explore_hidden_gems__find_popular_hangout_spots_locate_more = (TextView) findViewById(R.id.match_with_peers_who_share_your_interests_and_break_the_ice_and_chat__explore_hidden_gems__find_popular_hangout_spots_locate_more);
		discover__ = (TextView) findViewById(R.id.discover__);
		connect = (TextView) findViewById(R.id.connect);
		_rectangle_121 = (View) findViewById(R.id._rectangle_121);
		arrow_1 = (ImageView) findViewById(R.id.arrow_1);
	
		
		_rectangle_121.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), ProfileActivity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	