package com.yuan.sosochaapp.adapter;

import java.util.ArrayList;

import com.yuan.sosochaapp.R;
import com.yuan.sosochaapp.data.DataShuJu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TuanGouBaseAdapter extends BaseAdapter {
	ArrayList<DataShuJu> list;
	Context context;
	LayoutInflater inflater;

	public TuanGouBaseAdapter() {

	}

	public TuanGouBaseAdapter(ArrayList<DataShuJu> list, Context context) {
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
			convertView = inflater.inflate(R.layout.tuan_gou_list_view, null);
			holder = new Holder();
			holder.imageTitle = (ImageView) convertView.findViewById(R.id.tuan_gou_image_title);
			holder.textTitle = (TextView) convertView.findViewById(R.id.tuan_gou_text_title);
			holder.textShiJian = (TextView) convertView.findViewById(R.id.tuan_gou_text_shijian);
			holder.textYiShou = (TextView) convertView.findViewById(R.id.tuan_gou_text_yishouwan);
			holder.textMaiJia = (TextView) convertView.findViewById(R.id.tuan_gou_text_jiage);
			holder.textYuanJia = (TextView) convertView.findViewById(R.id.tuan_gou_text_yuanjia1);
			holder.textButton = (TextView) convertView.findViewById(R.id.tuan_gou_text_gou_mai);
			holder.textGouMai = (TextView) convertView.findViewById(R.id.tuan_gou_text_goumairen);
			holder.textXianLiang=(TextView)convertView.findViewById(R.id.tuan_gou_text_xianliang);
			convertView.setTag(holder);
		}
		holder = (Holder) convertView.getTag();
		DataShuJu data = (DataShuJu) getItem(position);
		if (data.getTextGouMai() == data.getTextXianLiang()) {
			
			
			holder.textShiJian.setVisibility(View.GONE);
			holder.textButton.setBackgroundColor(555555);
			holder.textYiShou.setVisibility(View.VISIBLE);
		} else {
			holder.textShiJian.setText(data.getTextShiJian());
			holder.textShiJian.setVisibility(View.VISIBLE);
			holder.textYiShou.setVisibility(View.GONE);
		}
		holder.imageTitle.setId(data.getImageTitle());
		holder.textMaiJia.setText(data.getTextMaiJia());
		holder.textTitle.setText(data.getTextTitle());
		holder.textButton.setText(data.getTextButton());
		//holder.textXianLiang.setText(data.getTextXianLiang());
		//holder.textGouMai.setText(data.getTextGouMai());
		holder.textYuanJia.setText(data.getTextYuanJia());
		return convertView;
	}

	class Holder {
		TextView textYiShou;
		TextView textShiJian;
		TextView textTitle;
		TextView textMaiJia;
		TextView textYuanJia;
		TextView textXianLiang;
		TextView textGouMai;
		TextView textButton;
		ImageView imageTitle;
	}

}
