package com.example.spinner;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemSelectedListener{
	private TextView textView;
	private Spinner spinner;
	private List<String>list;
	private ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView)findViewById(R.id.text);
		spinner = (Spinner)findViewById(R.id.spinner);
		textView.setText("��ѡ��ĵص��ǹ���");
		//��������Դ
		list = new ArrayList<String>();
		list.add("����");
		list.add("�Ͼ�");
		list.add("����");
		list.add("������˹");
		//�½�������ArrayAdapter
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
		//���������б���ʽ
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		//����������
		spinner.setAdapter(adapter);
		//���ü�����
		spinner.setOnItemSelectedListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		String city = adapter.getItem(position);
		textView.setText("��ѡ��ĳ�����"+city);
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
}
