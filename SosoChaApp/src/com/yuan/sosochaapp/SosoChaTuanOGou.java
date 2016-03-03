package com.yuan.sosochaapp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import com.yuan.sosochaapp.adapter.TuanGouBaseAdapter;
import com.yuan.sosochaapp.data.DataShuJu;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class SosoChaTuanOGou extends Activity {
	ListView listView;
	ArrayList<DataShuJu> list;
	TuanGouBaseAdapter tuanGou;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		list = new ArrayList<DataShuJu>();
		setContentView(R.layout.tuan_gou_soso_activity);
		listView = (ListView) findViewById(R.id.activity_tuan_gou_listview);
		TextView textView=(TextView)findViewById(R.id.activity_ding_cai_dan);
		textView.setText("团购");
		getData();
		
		tuanGou = new TuanGouBaseAdapter(list, SosoChaTuanOGou.this);
		listView.setAdapter(tuanGou);
	}

	public ArrayList<DataShuJu> getData() {

		for (int i = 0; i < 7; i++) {
			DataShuJu data = new DataShuJu();
			if (i == 0) {
				data.setTextGouMai(50);
				data.setTextXianLiang(50);
			} else {
				data.setTextGouMai((int) (Math.random() * 100));
				data.setTextXianLiang((int) (Math.random() * 100));
			}

			data.setTag(i);
			data.setImageTitle(R.drawable.gengduojingxi01);
			data.setTextButton("购买");

			data.setTextYiShou("已售完");
			data.setTextMaiJia("￥" + (int) (Math.random() * 100));
			SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
			data.setTextShiJian("倒计时" + (format.format(new Date())));
			data.setTextTitle("2014新茶上市正宗雨前龙井团购专场");
			data.setTextView("团购");
			data.setTextYuanJia("" + (int) (Math.random() * 100));

			list.add(data);
		}
		return list;
	}
}
