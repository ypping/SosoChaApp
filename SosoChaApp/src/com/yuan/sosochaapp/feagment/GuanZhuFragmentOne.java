package com.yuan.sosochaapp.feagment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yuan.sosochaapp.R;
import com.yuan.sosochaapp.feagment.GuanZhuFragment.Student;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class GuanZhuFragmentOne extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		LinearLayout linearLayout = new LinearLayout(getActivity());
		linearLayout.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

		View view = inflater.inflate(R.layout.guan_zhu_sosocao_activity, linearLayout, true);
		sss = new String[] { "zhuti_icon", "zhuti_title", "zhuti_tu1", "zhuti_tu2", "zhuti_tu3" };
		in = new int[] { R.id.guan_zhu_shangbiao, R.id.guan_zhu_shanghu, R.id.guan_zhu_datu, R.id.guan_zhu_xiaotu1,
				R.id.guan_zhu_xiaotu2 };
		listView = (ListView) view.findViewById(R.id.list_view_guan_zhu);
		list = new ArrayList<Map<String, Object>>();
		Student stu = new Student("大宝山名茶", R.drawable.dabaoshanmingca, R.drawable.da, R.drawable.xiao,
				R.drawable.xiao2);
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("zhuti_title", stu.str);
		map1.put("zhuti_icon", stu.id);
		map1.put("zhuti_tu1", stu.tu1);
		map1.put("zhuti_tu2", stu.tu2);
		map1.put("zhuti_tu3", stu.tu3);
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("zhuti_title", stu.str);
		map2.put("zhuti_icon", stu.id);
		map2.put("zhuti_tu1", stu.tu1);
		map2.put("zhuti_tu2", stu.tu2);
		map2.put("zhuti_tu3", stu.tu3);
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("zhuti_title", stu.str);
		map3.put("zhuti_icon", stu.id);
		map3.put("zhuti_tu1", stu.tu1);
		map3.put("zhuti_tu2", stu.tu2);
		map3.put("zhuti_tu3", stu.tu3);
		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("zhuti_title", stu.str);
		map4.put("zhuti_icon", stu.id);
		map4.put("zhuti_tu1", stu.tu1);
		map4.put("zhuti_tu2", stu.tu2);
		map4.put("zhuti_tu3", stu.tu3);
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		simpleAdapter();
		return view;
	}

	
		ListView listView;
		List<Map<String, Object>> list;
		String[] sss;
		int[] in;

	
			

		public void simpleAdapter() {
			// 实例适配器
			SimpleAdapter cha = new SimpleAdapter(getActivity(), list, R.layout.guan_zhu_list_view, sss, in);
			listView.setAdapter(cha);
		}

		public List<Map<String, Student>> data() {

			return null;
		}

		class Student {
			int id;
			String str;
			int tu1;
			int tu2;
			int tu3;

			Student(int id) {
				this.id = id;
			}

			Student(String str, int id, int tu1, int tu2, int tu3) {
				this.str = str;
				this.id = id;
				this.tu1 = tu1;
				this.tu2 = tu2;
				this.tu3 = tu3;
			}
		}
}
