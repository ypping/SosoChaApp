package com.yuan.sosochaapp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import com.yuan.sosochaapp.adapter.PingLun;
import com.yuan.sosochaapp.data.PingLunAdapter;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;

public class SosoChaPingLun extends Activity {
	ArrayList<PingLun> list;
	ListView listView;
	AlertDialog alertDialog;
	PingLunAdapter myBaseAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ping_lun_soso_cha_activity);
		list = new ArrayList<PingLun>();
		listView = (ListView) findViewById(R.id.activity_ping_lun_listview);
		ImageView image = (ImageView) findViewById(R.id.ping_lun_soso_image);
		image.setOnClickListener(click);

		getData();
		myBaseAdapter = new PingLunAdapter(list, SosoChaPingLun.this);
		listView.setAdapter(myBaseAdapter);
	}

	OnClickListener click = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			creatAlertDiaLog();
		}
	};

	public void creatAlertDiaLog() {
		if (alertDialog == null) {
			View view;
			android.app.AlertDialog.Builder builder = new AlertDialog.Builder(this);
			view = getLayoutInflater().inflate(R.layout.ping_lun_popup_window, null);
			builder.setView(view);
			builder.setOnCancelListener(new OnCancelListener() {
				
				@Override
				public void onCancel(DialogInterface dialog) {
					// TODO Auto-generated method stub
				
				}
			});
			alertDialog = builder.create();
		}
		alertDialog.show();
	}

	private void getData() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			PingLun pingLun = new PingLun();
			pingLun.setPerson("小学生" + (int) (Math.random() * 10));
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			pingLun.setTime(format.format(new Date()));
			pingLun.setTitle("" + ((int) (Math.random() * 1000)) * ((int) (Math.random() * 1000)));
			list.add(pingLun);
		}

	}

}
