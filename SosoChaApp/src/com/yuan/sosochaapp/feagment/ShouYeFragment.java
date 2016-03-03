package com.yuan.sosochaapp.feagment;

import java.util.ArrayList;

import com.yuan.sosochaapp.R;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

@SuppressLint("NewApi")
public class ShouYeFragment extends Fragment {
	ArrayList<String> data;
	View view;
	Context context;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		// LinearLayout linearLayout = new LinearLayout(getActivity());
		// linearLayout.setLayoutParams(new
		// LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		view = inflater.inflate(R.layout.shou_ye_activity, null);
		context=getActivity();
		findView();
		return view;
	}
	
	private void findView(){
		TextView text = (TextView) view.findViewById(R.id.mei_zhou_san_time);
		text.setText("4:45-9:45");
		ListView listView=(ListView)view.findViewById(45);
		//listView.setAdapter(new ListAdapter(context,data));
	}
}
