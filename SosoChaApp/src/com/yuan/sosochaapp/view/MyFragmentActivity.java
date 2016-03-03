package com.yuan.sosochaapp.view;

import java.util.ArrayList;

import com.yuan.sosochaapp.R;
import com.yuan.sosochaapp.feagment.FuJIngFragmentOne;
import com.yuan.sosochaapp.feagment.FuJingFragment;
import com.yuan.sosochaapp.feagment.GuanZhuFragment;
import com.yuan.sosochaapp.feagment.GuanZhuFragmentOne;
import com.yuan.sosochaapp.feagment.QiangDiaoFragment;
import com.yuan.sosochaapp.feagment.QiangDiaoFragmentOne;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MyFragmentActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_pager_view);
		FuJIngFragmentOne mainFragment = new FuJIngFragmentOne();
		GuanZhuFragmentOne attentionFragment = new GuanZhuFragmentOne();
		QiangDiaoFragmentOne qiangDiaoFragment = new QiangDiaoFragmentOne();
		ArrayList<Fragment> list = new ArrayList<Fragment>();
		list.add(mainFragment);
		list.add(attentionFragment);
		list.add(qiangDiaoFragment);
		ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
		MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), list);
		viewPager.setAdapter(myFragmentPagerAdapter);
	}
}
