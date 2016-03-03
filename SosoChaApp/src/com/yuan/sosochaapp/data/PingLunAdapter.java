package com.yuan.sosochaapp.data;

import java.util.ArrayList;

import com.yuan.sosochaapp.R;
import com.yuan.sosochaapp.adapter.PingLun;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class PingLunAdapter extends BaseAdapter {
	LayoutInflater inflater;
	Context context;
	ArrayList<PingLun> list;

	public PingLunAdapter() {
	}

	public PingLunAdapter(ArrayList<PingLun> list, Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.list = list;
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Holder holder;
		if (convertView == null || convertView.getTag() == null) {
			convertView = inflater.inflate(R.layout.ping_lun_list_view, null);
			holder = new Holder();
			holder.title = (TextView) convertView.findViewById(R.id.ping_lun_title);
			holder.person = (TextView) convertView.findViewById(R.id.ping_lun_person);
			holder.time = (TextView) convertView.findViewById(R.id.ping_lun_time);
			convertView.setTag(holder);
		}
		holder = (Holder) convertView.getTag();
		PingLun pingLun = (PingLun) getItem(position);
		holder.title.setText(pingLun.getTitle());
		holder.person.setText(pingLun.getPerson());
		holder.time.setText(pingLun.getTime());
		return convertView;
	}

	class Holder {
		TextView title;
		TextView person;
		TextView time;
	}

}
