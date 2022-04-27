package com.patristar;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class TabInit extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab);
		
		Resources res = getResources();
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		// tab 1
		intent = new Intent().setClass(this, Activity1.class);
		spec = tabHost.newTabSpec("Activity1").setIndicator("Activity1",res.getDrawable(R.drawable.tab_icon1)).setContent(intent);
		tabHost.addTab(spec);
		// tab2
		intent = new Intent().setClass(this, Activity2.class);
		spec = tabHost.newTabSpec("Activity2").setIndicator("Activity2",res.getDrawable(R.drawable.tab_icon2)).setContent(intent);
		tabHost.addTab(spec);
		// tab3
		intent = new Intent().setClass(this, Activity3.class);
		spec = tabHost.newTabSpec("Activity3").setIndicator("Activity3",res.getDrawable(R.drawable.tab_icon3)).setContent(intent);
		tabHost.addTab(spec);
		// tab4
		intent = new Intent(this, Activity4.class);
		spec = tabHost.newTabSpec("Activity4")
				.setIndicator("Activity4", null)
				.setContent(intent);
		tabHost.addTab(spec);
		
		
	}
	

}
