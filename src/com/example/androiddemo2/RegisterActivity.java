package com.example.androiddemo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends Activity {
	EditText nameText;
	EditText pwdText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		//将属性初始化，将布局文件的ui组件转换成java对象
		nameText = (EditText)findViewById(R.id.userNameEditReg);
		pwdText = (EditText)findViewById(R.id.pwdEditReg);
	}
	
	public void mySubmit(View viewd){
		//获取输入框的值
		String name = nameText.getText().toString();
		String pwd = pwdText.getText().toString();
		
		//将值传给登录页面，跳转登录页面
		Intent i = new Intent();
		i.putExtra("USERNAME", name);
		i.putExtra("PASSSWORD", pwd);
		setResult(1, i);//将值传给登录页面
		finish();//将当前窗口结束，显示登录窗口
	}

}
