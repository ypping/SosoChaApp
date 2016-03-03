package com.yuan.sosochaapp;

import java.util.ArrayList;

import com.yuan.sosochaapp.adapter.FuJingJuLiData;
import com.yuan.sosochaapp.data.FuJingJuLiBaseAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class SosoChaFuJingJuLi extends Activity {
	FuJingJuLiBaseAdapter myBaseAdapter;
	ArrayList<FuJingJuLiData> list;
	ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fu_jing_ju_li_activity);
		listView = (ListView) findViewById(R.id.fu_jing_ju_li_activity_listview);
		TextView textView = (TextView) findViewById(R.id.activity_ding_cai_dan);
		list = new ArrayList<FuJingJuLiData>();
		textView.setText("附近");
		getData();
		myBaseAdapter = new FuJingJuLiBaseAdapter(SosoChaFuJingJuLi.this, list);
		listView.setAdapter(myBaseAdapter);
	}

	private void getData() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			FuJingJuLiData data = new FuJingJuLiData();
			data.setImage(R.drawable.touxiang);
			data.setTitle("家乡缘茶叶专卖店" + i);
			data.setJuLi((int) (Math.random() * 1000) + "米");
			data.setPinglun((int) (Math.random() * 100) + "已评价");
			data.setZhuYing("主营：红茶、白茶、绿茶。。");
			data.setHaoPing((int) (Math.random() * 100) + "%" + "好评");
			list.add(data);
		}
	}
}
