package com.yuan.sosochaapp.view;

import java.util.ArrayList;

import com.yuan.sosochaapp.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class ViewPagerActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pager_view);
		LayoutInflater layoutInflater = getLayoutInflater();
		View view1 = layoutInflater.inflate(R.layout.shou_ye_activity, null);
		View view2 = layoutInflater.inflate(R.layout.can_ping_xiang_qing_soso_acticity, null);
		View view3 = layoutInflater.inflate(R.layout.fu_jing_activity_zhu, null);
		// View view4=layoutInflater.inflate(R.layout.ping_lun_list_view, null);
		// View
		// view5=layoutInflater.inflate(R.layout.can_ping_xiang_qing_soso_acticity,
		// null);
		ArrayList<View> list = new ArrayList<View>();

		list.add(view1);
		list.add(view2);
		list.add(view3);
		// list.add(view4);
		// list.add(view5);
		MyPagerAdapter myPagerAdapter = new MyPagerAdapter(list);
		ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
		viewPager.setAdapter(myPagerAdapter);
	}
}
