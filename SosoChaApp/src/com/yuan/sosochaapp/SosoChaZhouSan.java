package com.yuan.sosochaapp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.yuan.sosochaapp.adapter.ZhouSanAdapter;
import com.yuan.sosochaapp.data.ZhouSan;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class SosoChaZhouSan extends Activity {
	ArrayList<ZhouSan> list;
	Context context;
	ZhouSanAdapter adapter;
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zhou_san_activity);
		list=new ArrayList<ZhouSan>();
		
		listView=(ListView)findViewById(R.id.zhou_san_list_view);
		TextView textView=(TextView)findViewById(R.id.activity_ding_cai_dan);
		textView.setText("周三");
		getData();
		adapter = new ZhouSanAdapter(SosoChaZhouSan.this, list);
		listView.setAdapter(adapter);
	}
	private ArrayList<ZhouSan> getData() {
		// TODO Auto-generated method stub
		for(int i=0;i<7;i++){
			ZhouSan zhouSan=new ZhouSan();
			zhouSan.setDazhe("2.2-5.5折");
			zhouSan.setHuodong("满"+(int)(Math.random()*100)+"减"+(int)(Math.random()*100)+"，上不封顶");
			zhouSan.setImageView(R.drawable.zhousan);
			SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
			zhouSan.setShijian("倒计时   "+format.format(new Date()));
			zhouSan.setTitle("2014新茶");
			list.add(zhouSan);
		}
		return list;
	}
}
