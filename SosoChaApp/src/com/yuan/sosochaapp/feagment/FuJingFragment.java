package com.yuan.sosochaapp.feagment;

import com.yuan.sosochaapp.R;

import android.annotation.SuppressLint;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;

@SuppressLint("NewApi")
public class FuJingFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		LinearLayout linearLayout = new LinearLayout(getActivity());
		linearLayout.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		View view = inflater.inflate(R.layout.fu_jing_activity_zhu, linearLayout, true);
		return view;
	}
}
