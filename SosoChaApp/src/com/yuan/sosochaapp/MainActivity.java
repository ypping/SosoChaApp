package com.yuan.sosochaapp;

import java.util.ArrayList;

import com.yuan.sosochaapp.feagment.FuJIngFragmentOne;
import com.yuan.sosochaapp.feagment.FuJingFragment;
import com.yuan.sosochaapp.feagment.GuanZhuFragment;
import com.yuan.sosochaapp.feagment.GuanZhuFragmentOne;
import com.yuan.sosochaapp.feagment.QiangDiaoFragment;
import com.yuan.sosochaapp.feagment.QiangDiaoFragmentOne;
import com.yuan.sosochaapp.feagment.ShouYeFragment;
import com.yuan.sosochaapp.feagment.ShouYeFragmentOne;
import com.yuan.sosochaapp.view.MyFragmentPagerAdapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.ViewFlipper;

@SuppressLint("NewApi")
public class MainActivity extends FragmentActivity {
	android.app.FragmentManager fragmentManager;
	ShouYeFragment shouYeFragment;
	FuJingFragment fuJingFragment;

	QiangDiaoFragment qiangDiaoFragment;
	GuanZhuFragment guanZhuFragment;
	RadioButton radioButtons1;
	RadioButton radioButtons2;
	RadioButton radioButtons3;
	RadioButton radioButtons4;
	RadioButton radioButtons5;
	ViewPager viewPager;

	LinearLayout linear1;
	LinearLayout linear2;
	LinearLayout linear3;
	LinearLayout linear4;
	LinearLayout linear5;
	RadioButton button1;
	RadioButton button2;
	RadioButton button3;
	RadioButton button4;
	RadioButton button5;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (RadioButton) findViewById(R.id.radio_button11);
		button2 = (RadioButton) findViewById(R.id.radio_button12);
		button3 = (RadioButton) findViewById(R.id.radio_button13);
		button4 = (RadioButton) findViewById(R.id.radio_button14);
		ImageView imageView=(ImageView)findViewById(R.id.main_acitvity_image_denglu);
		imageView.setOnClickListener(listener);
		fragmentManager = getFragmentManager();
		shouYeFragment = new ShouYeFragment();
		fuJingFragment = new FuJingFragment();
		qiangDiaoFragment = new QiangDiaoFragment();
		guanZhuFragment = new GuanZhuFragment();
		linear1 = (LinearLayout) findViewById(R.id.activity_main_shou_ye);
		linear2 = (LinearLayout) findViewById(R.id.activity_main_guan_zhu);
		linear3 = (LinearLayout) findViewById(R.id.activity_main_qiang_diao);
		linear4 = (LinearLayout) findViewById(R.id.activity_main_fu_jing);
		linear5 = (LinearLayout) findViewById(R.id.activity_main_wo);
		// fragmentTransaction.add(ViewGroup, shouYeFragment);
		// fragmentTransaction.add(R.id.view_pager, fuJingFragment);
		// fragmentTransaction.add(R.id.view_pager, qiangDiaoFragment);
		// fragmentTransaction.add(R.id.view_pager, guanZhuFragment);
		FuJIngFragmentOne mainFragment = new FuJIngFragmentOne();
		GuanZhuFragmentOne attentionFragment = new GuanZhuFragmentOne();
		QiangDiaoFragmentOne qiangDiaoFragment = new QiangDiaoFragmentOne();
		ShouYeFragmentOne shouYeFragmentOne = new ShouYeFragmentOne();

		ArrayList<Fragment> list = new ArrayList<Fragment>();
		list.add(shouYeFragmentOne);
		list.add(mainFragment);
		list.add(attentionFragment);
		list.add(qiangDiaoFragment);
		

		ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
		viewPager.setOnPageChangeListener(changeListener2);
		MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), list);
		viewPager.setAdapter(myFragmentPagerAdapter);
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.shou_ye_radio_group);
		radioGroup.setOnCheckedChangeListener(changeListener);
	}

	public void getBoolean(int arg0) {
		Drawable drawable1;
		if (arg0 == 0) {

			drawable1 = getResources().getDrawable(R.drawable.shou_ye_fugai);
			drawable1.setBounds(0, 0, drawable1.getMinimumWidth(), drawable1.getMinimumHeight());
			button1.setCompoundDrawables(null, drawable1, null, null);

		} else {
			drawable1 = getResources().getDrawable(R.drawable.shouye);
			drawable1.setBounds(0, 0, drawable1.getMinimumWidth(), drawable1.getMinimumHeight());
			button1.setCompoundDrawables(null, drawable1, null, null);
		}
		if (arg0 == 1) {
			drawable1 = getResources().getDrawable(R.drawable.guan_zhu_fugai);
			drawable1.setBounds(0, 0, drawable1.getMinimumWidth(), drawable1.getMinimumHeight());
			button2.setCompoundDrawables(null, drawable1, null, null);
		} else {
			drawable1 = getResources().getDrawable(R.drawable.guanzhu);
			drawable1.setBounds(0, 0, drawable1.getMinimumWidth(), drawable1.getMinimumHeight());
			button2.setCompoundDrawables(null, drawable1, null, null);
		}
		if (arg0 == 2) {
			drawable1 = getResources().getDrawable(R.drawable.qiang_diao_fugai);
			drawable1.setBounds(0, 0, drawable1.getMinimumWidth(), drawable1.getMinimumHeight());
			button3.setCompoundDrawables(null, drawable1, null, null);

		} else {
			drawable1 = getResources().getDrawable(R.drawable.qiangdiao);
			drawable1.setBounds(0, 0, drawable1.getMinimumWidth(), drawable1.getMinimumHeight());
			button3.setCompoundDrawables(null, drawable1, null, null);
		}
		if (arg0 == 3) {
			drawable1 = getResources().getDrawable(R.drawable.fu_jing_fugai);
			drawable1.setBounds(0, 0, drawable1.getMinimumWidth(), drawable1.getMinimumHeight());
			button4.setCompoundDrawables(null, drawable1, null, null);

		} else {
			drawable1 = getResources().getDrawable(R.drawable.fujing);
			drawable1.setBounds(0, 0, drawable1.getMinimumWidth(), drawable1.getMinimumHeight());
			button4.setCompoundDrawables(null, drawable1, null, null);
		}
	}

	OnPageChangeListener changeListener2 = new OnPageChangeListener() {

		@Override
		public void onPageSelected(int arg0) {
			// TODO Auto-generated method stub
			Log.i("onPageSelected", "++++" + arg0);

			switch (arg0) {
			case 0:
				linear1.setVisibility(View.VISIBLE);
				linear2.setVisibility(View.GONE);
				linear3.setVisibility(View.GONE);
				linear4.setVisibility(View.GONE);
				linear5.setVisibility(View.GONE);
				getBoolean(arg0);
				break;
			case 1:
				linear1.setVisibility(View.GONE);
				linear2.setVisibility(View.VISIBLE);
				linear3.setVisibility(View.GONE);
				linear4.setVisibility(View.GONE);
				linear5.setVisibility(View.GONE);
				getBoolean(arg0);
				break;
			case 2:
				linear1.setVisibility(View.GONE);
				linear2.setVisibility(View.GONE);
				linear3.setVisibility(View.VISIBLE);
				linear4.setVisibility(View.GONE);
				linear5.setVisibility(View.GONE);
				getBoolean(arg0);
				break;
			case 3:
				linear1.setVisibility(View.GONE);
				linear2.setVisibility(View.GONE);
				linear3.setVisibility(View.GONE);
				linear4.setVisibility(View.VISIBLE);
				linear5.setVisibility(View.GONE);
				getBoolean(arg0);
				break;
			case 4:
				linear1.setVisibility(View.GONE);
				linear2.setVisibility(View.GONE);
				linear3.setVisibility(View.GONE);
				linear4.setVisibility(View.GONE);
				linear5.setVisibility(View.VISIBLE);
				getBoolean(arg0);
				break;
			default:
				break;
			}
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub
			Log.i("onPageScrolled", "-----+" + arg0);
		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub
			Log.i("onPageScrollStateChanged", "qqqqqqq" + arg0);
		}
	};
	RadioButton[] radioButtons = new RadioButton[] { radioButtons1, radioButtons2, radioButtons3, radioButtons4 };
	OnCheckedChangeListener changeListener = new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			if (viewPager == null) {
				viewPager = (ViewPager) findViewById(R.id.view_pager);
			}
			// TODO Auto-generated method stub
			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

			/*
			 * if (radioButtons[0].isChecked()) {
			 * fragmentTransaction.hide(fuJingFragment);
			 * fragmentTransaction.show(shouYeFragment);
			 * fragmentTransaction.hide(qiangDiaoFragment);
			 * fragmentTransaction.hide(guanZhuFragment); } else if
			 * (radioButtons[1].isChecked()) {
			 * fragmentTransaction.hide(shouYeFragment);
			 * fragmentTransaction.show(guanZhuFragment);
			 * fragmentTransaction.hide(qiangDiaoFragment);
			 * fragmentTransaction.hide(fuJingFragment); } else if
			 * (radioButtons[2].isChecked()) {
			 * fragmentTransaction.hide(shouYeFragment);
			 * fragmentTransaction.show(qiangDiaoFragment);
			 * fragmentTransaction.hide(fuJingFragment);
			 * fragmentTransaction.hide(guanZhuFragment); } else if
			 * (radioButtons[3].isChecked()) {
			 * fragmentTransaction.hide(shouYeFragment);
			 * fragmentTransaction.show(fuJingFragment);
			 * fragmentTransaction.hide(qiangDiaoFragment);
			 * fragmentTransaction.hide(guanZhuFragment); }
			 */

			switch (group.getCheckedRadioButtonId()) {
			case R.id.radio_button11:
				/*
				 * fragmentTransaction.hide(fuJingFragment);
				 * fragmentTransaction.show(shouYeFragment);
				 * fragmentTransaction.hide(qiangDiaoFragment);
				 * fragmentTransaction.hide(guanZhuFragment);
				 * fragmentTransaction.commit();
				 */
				viewPager.setCurrentItem(0);
				break;
			case R.id.radio_button12:
				/*
				 * fragmentTransaction.hide(shouYeFragment);
				 * fragmentTransaction.show(guanZhuFragment);
				 * fragmentTransaction.hide(qiangDiaoFragment);
				 * fragmentTransaction.hide(fuJingFragment);
				 * fragmentTransaction.commit();
				 */
				viewPager.setCurrentItem(1);
				break;
			case R.id.radio_button13:
				/*
				 * fragmentTransaction.hide(shouYeFragment);
				 * fragmentTransaction.show(qiangDiaoFragment);
				 * fragmentTransaction.hide(fuJingFragment);
				 * fragmentTransaction.hide(guanZhuFragment);
				 * fragmentTransaction.commit();
				 */
				viewPager.setCurrentItem(2);
				break;
			case R.id.radio_button14:
				/*
				 * fragmentTransaction.hide(shouYeFragment);
				 * fragmentTransaction.show(fuJingFragment);
				 * fragmentTransaction.hide(qiangDiaoFragment);
				 * fragmentTransaction.hide(guanZhuFragment);
				 * fragmentTransaction.commit();
				 */
				viewPager.setCurrentItem(3);
				break;
			default:
				break;
			}

		}
	};
	OnClickListener listener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent intent=new Intent(MainActivity.this, SosoChaDengLu.class);
			Log.i("", "listener"+intent);
			startActivity(intent);
		}
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
