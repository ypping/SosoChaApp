package com.yuan.sosochaapp.data;

import java.util.ArrayList;

import com.yuan.sosochaapp.R;
import com.yuan.sosochaapp.adapter.FuJingJuLiData;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FuJingJuLiBaseAdapter extends BaseAdapter {
	Context context;
	ArrayList<FuJingJuLiData> list;
	LayoutInflater inflater;

	public FuJingJuLiBaseAdapter(Context context, ArrayList<FuJingJuLiData> list) {
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
			convertView = inflater.inflate(R.layout.fu_jing_ju_li_list_view, null);
			holder = new Holder();
			holder.image = (ImageView) convertView.findViewById(R.id.fu_jing_ju_li_image);
			holder.title = (TextView) convertView.findViewById(R.id.fu_jing_ju_li_title);
			holder.zhuYing = (TextView) convertView.findViewById(R.id.fu_jing_ju_li_zhu_ying);
			holder.pingLun = (TextView) convertView.findViewById(R.id.fu_jing_ju_li_ping_lun);
			holder.haoPing = (TextView) convertView.findViewById(R.id.fu_jing_ju_li_hao_ping);
			holder.juLi = (TextView) convertView.findViewById(R.id.fu_jing_ju_li_shu_liang);
			convertView.setTag(holder);
		}
		holder = (Holder) convertView.getTag();
		FuJingJuLiData data = (FuJingJuLiData) getItem(position);
		holder.image.setId(data.getImage());
		holder.haoPing.setText(data.getHaoPing());
		holder.juLi.setText(data.getJuLi());
		holder.pingLun.setText(data.getPinglun());
		holder.title.setText(data.getTitle());
		holder.zhuYing.setText(data.getZhuYing());
		return convertView;
	}

	class Holder {
		ImageView image;
		TextView title;
		TextView zhuYing;
		TextView pingLun;
		TextView haoPing;
		TextView juLi;
	}
}
