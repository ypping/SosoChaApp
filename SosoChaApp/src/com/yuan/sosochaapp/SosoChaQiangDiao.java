package com.yuan.sosochaapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class SosoChaQiangDiao extends Activity {
	ListView listView;
	List<Map<String, Object>> list;
	String[] sss;
	int[] in;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.qiang_diao_sosocha_activity);
		sss = new String[] { "id", "mingcheng", "shijian", "dianzhan", "pingjia", "tu1", "tu2", "tu3", "tu4", "tu5",
				"tu6", "touxiang1", "touxiang2", "touxiang3", "touxiang4" };
		in = new int[] { R.id.qiang_diao_listview_touxiang, R.id.qiang_diao_listview_mingcheng,
				R.id.qiang_diao_listview_shijian, R.id.qiang_diao_listview_dianzhan, R.id.qiang_diao_listview_pingjia,
				R.id.qiang_diao_listview_image1, R.id.qiang_diao_listview_image2, R.id.qiang_diao_listview_image3,
				R.id.qiang_diao_listview_image4, R.id.qiang_diao_listview_image5, R.id.qiang_diao_listview_image6,
				R.id.qiang_diao_listview_touxiang1, R.id.qiang_diao_listview_touxiang2,
				R.id.qiang_diao_listview_touxiang3, R.id.qiang_diao_listview_touxiang4 };
		listView = (ListView) findViewById(R.id.activity_qiang_diao_listview);
		list = new ArrayList<Map<String, Object>>();
		Student stu = new Student();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("mingcheng", "李小妮子");
		map1.put("id", stu.id);
		map1.put("shijian", 18);
		map1.put("dianzhan", 20);
		map1.put("pingjia", 10);
		map1.put("tu1", stu.tu1);
		map1.put("tu2", stu.tu2);
		map1.put("tu3", stu.tu3);
		map1.put("tu4", stu.tu4);
		map1.put("tu5", stu.tu5);
		map1.put("tu6", stu.tu6);
		map1.put("touxiang1", stu.touxiang1);
		map1.put("touxiang2", stu.touxiang2);
		map1.put("touxiang3", stu.touxiang3);
		map1.put("touxiang4", stu.touxiang4);
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("mingcheng", stu.mingcheng);
		map2.put("id", stu.id);
		map2.put("shijian", stu.shijian);
		map2.put("dianzhan", stu.dianzhan);
		map2.put("pingjia", stu.pingjia);
		map2.put("tu1", stu.tu1);
		map2.put("tu2", stu.tu2);
		map2.put("tu3", stu.tu3);
		map2.put("tu4", stu.tu4);
		map2.put("tu5", stu.tu5);
		map2.put("tu6", stu.tu6);
		map2.put("touxiang1", stu.touxiang1);
		map2.put("touxiang2", stu.touxiang2);
		map2.put("touxiang3", stu.touxiang3);
		map2.put("touxiang4", stu.touxiang4);
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("mingcheng", stu.mingcheng);
		map3.put("id", stu.id);
		map3.put("shijian", stu.shijian);
		map3.put("dianzhan", stu.dianzhan);
		map3.put("pingjia", stu.pingjia);
		map3.put("tu1", stu.tu1);
		map3.put("tu2", stu.tu2);
		map3.put("tu3", stu.tu3);
		map3.put("tu4", stu.tu4);
		map3.put("tu5", stu.tu5);
		map3.put("tu6", stu.tu6);
		map3.put("touxiang1", stu.touxiang1);
		map3.put("touxiang2", stu.touxiang2);
		map3.put("touxiang3", stu.touxiang3);
		map3.put("touxiang4", stu.touxiang4);
		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("mingcheng", stu.mingcheng);
		map4.put("id", stu.id);
		map4.put("shijian", stu.shijian);
		map4.put("dianzhan", stu.dianzhan);
		map4.put("pingjia", stu.pingjia);
		map4.put("tu1", stu.tu1);
		map4.put("tu2", stu.tu2);
		map4.put("tu3", stu.tu3);
		map4.put("tu4", stu.tu4);
		map4.put("tu5", stu.tu5);
		map4.put("tu6", stu.tu6);
		map4.put("touxiang1", stu.touxiang1);
		map4.put("touxiang2", stu.touxiang2);
		map4.put("touxiang3", stu.touxiang3);
		map4.put("touxiang4", stu.touxiang4);
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		simpleAdapter();
	}

	public void simpleAdapter() {

		SimpleAdapter cha = new SimpleAdapter(this, list, R.layout.qiang_diao_list_view, sss, in);
		listView.setAdapter(cha);
	}

	class Student {
		int id;
		String mingcheng;
		String shijian;
		String dianzhan;
		String pingjia;
		int tu1;
		int tu2;
		int tu3;
		int tu4;
		int tu5;
		int tu6;
		int touxiang1;
		int touxiang2;
		int touxiang3;
		int touxiang4;

		Student() {
		}

		Student(int id, String mingcheng, String shijian, String dianzhan, String pingjia, int tu1, int tu2, int tu3,
				int tu4, int tu5, int tu6, int touxiang1, int touxiang2, int touxiang3, int touxiang4) {
			this.mingcheng = mingcheng;
			this.id = id;
			this.shijian = shijian;
			this.dianzhan = dianzhan;
			this.pingjia = pingjia;
			this.mingcheng = mingcheng;
			this.tu1 = tu1;
			this.tu2 = tu2;
			this.tu3 = tu3;
			this.tu4 = tu4;
			this.tu5 = tu5;
			this.tu6 = tu6;
			this.touxiang1 = touxiang1;
			this.touxiang2 = touxiang2;
			this.touxiang3 = touxiang3;
			this.touxiang4 = touxiang4;
		}
	}
}
