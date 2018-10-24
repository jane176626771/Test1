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
		//�����Գ�ʼ�����������ļ���ui���ת����java����
		nameText = (EditText)findViewById(R.id.userNameEditReg);
		pwdText = (EditText)findViewById(R.id.pwdEditReg);
	}
	
	public void mySubmit(View viewd){
		//��ȡ������ֵ
		String name = nameText.getText().toString();
		String pwd = pwdText.getText().toString();
		
		//��ֵ������¼ҳ�棬��ת��¼ҳ��
		Intent i = new Intent();
		i.putExtra("USERNAME", name);
		i.putExtra("PASSSWORD", pwd);
		setResult(1, i);//��ֵ������¼ҳ��
		finish();//����ǰ���ڽ�������ʾ��¼����
	}

}
