package com.yuan.sosochaapp.adapter;

import java.util.ArrayList;

import com.yuan.sosochaapp.R;
import com.yuan.sosochaapp.data.ZhouSan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ZhouSanAdapter extends BaseAdapter {
	Context context;
	ArrayList<ZhouSan> list;
	LayoutInflater inflater;
	public ZhouSanAdapter(){}
	public ZhouSanAdapter(Context context,ArrayList<ZhouSan> list){
		this.context=context;
		this.list=list;
		inflater=LayoutInflater.from(context);
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
		if(convertView==null||convertView.getTag()==null){
			convertView = inflater.inflate(R.layout.zhou_san_list_view, null);
			holder=new Holder();
			holder.inage=(ImageView)convertView.findViewById(R.id.zhou_san_image);
			holder.shijian=(TextView)convertView.findViewById(R.id.zhou_san_shijian);
			holder.huodong=(TextView)convertView.findViewById(R.id.zhou_san_huodong);
			holder.title=(TextView)convertView.findViewById(R.id.zhou_san_title);
			holder.dazhe=(TextView)convertView.findViewById(R.id.zhou_san_dazhe);
			convertView.setTag(holder);
		}
		holder=(Holder)convertView.getTag();
		ZhouSan zhouSan=(ZhouSan)getItem(position);
		holder.dazhe.setText(zhouSan.getDazhe());
		holder.huodong.setText(zhouSan.getHuodong());
		holder.inage.setId(zhouSan.getImageView());
		holder.shijian.setText(zhouSan.getShijian());
		holder.title.setText(zhouSan.getTitle());
		return convertView;
	}
class Holder{
	ImageView inage;
	TextView shijian;
	TextView huodong;
	TextView title;
	TextView dazhe;
}
}
