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
	 * 参数View v代表的是点击的按钮
	 * @param v
	 */
	public void login(View v){
		switch (v.getId()) {
		case R.id.loginBtn://点击是登录按钮
			
			break;

		case R.id.registerBtn://点击注册按钮
			//跳转到注册窗口中
			Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
			startActivityForResult(intent, 1);//期待启动的页面返回给当前页面值。
			break;
		}
	}
	
	/**
	 * 当使用startActivityForResult启动的页面返回值时，自动调用该方法
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(requestCode==1 && resultCode==1){
			String name = data.getStringExtra("USERNAME");
			String pwd = data.getStringExtra("PASSSWORD");
			showView.setText(name+";"+pwd);
			Toast.makeText(MainActivity.this, "注册成功", Toast.LENGTH_LONG).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
