package com.example.androiddemo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView showView; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myrelative);
		showView = (TextView)findViewById(R.id.showView);
	}
	
	/**
	 * ����View v������ǵ���İ�ť
	 * @param v
	 */
	public void login(View v){
		switch (v.getId()) {
		case R.id.loginBtn://����ǵ�¼��ť
			
			break;

		case R.id.registerBtn://���ע�ᰴť
			//��ת��ע�ᴰ����
			Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
			startActivityForResult(intent, 1);//�ڴ�������ҳ�淵�ظ���ǰҳ��ֵ��
			break;
		}
	}
	
	/**
	 * ��ʹ��startActivityForResult������ҳ�淵��ֵʱ���Զ����ø÷���
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(requestCode==1 && resultCode==1){
			String name = data.getStringExtra("USERNAME");
			String pwd = data.getStringExtra("PASSSWORD");
			showView.setText(name+";"+pwd);
			Toast.makeText(MainActivity.this, "ע��ɹ�", Toast.LENGTH_LONG).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
