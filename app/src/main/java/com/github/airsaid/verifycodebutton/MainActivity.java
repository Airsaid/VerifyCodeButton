package com.github.airsaid.verifycodebutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.github.airsaid.verifycodebutton.widget.VerifyCodeButton;

public class MainActivity extends AppCompatActivity {

    private VerifyCodeButton mBtnCode;
    private EditText mEdtPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnCode = (VerifyCodeButton) findViewById(R.id.btn_code);
        mEdtPhone = (EditText) findViewById(R.id.edt_phone);
        mBtnCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 校验手机号是否输入正确
                String phone = mEdtPhone.getText().toString();
                if(!TextUtils.isEmpty(phone)){
                    Toast.makeText(MainActivity.this, "执行发送验证码操作", Toast.LENGTH_SHORT).show();
                    // 开始倒计时
                    mBtnCode.start();
                }else{
                    Toast.makeText(MainActivity.this, "请输入手机号", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
