# VerifyCodeButton
This is a custom button on Android View, used to obtain a verification code.

# Preview
![](https://github.com/Airsaid/VerifyCodeButton/blob/master/gif/VerifyCodeButton.gif)

# Use

## step1
```
<com.github.airsaid.verifycodebutton.widget.VerifyCodeButton
        android:id="@+id/btn_code"
        android:layout_width="100dp"
        android:layout_height="30dp"
        android:background="@drawable/bg_button_code"
        android:gravity="center"
        android:text="获取验证码"
        android:textColor="#FFFFFF"
        app:vcb_afterCountdownText="重新获取"
        app:vcb_clickAfterBackground="@drawable/bg_button_code_click_after"
        app:vcb_countdownTime="6"/>
```

## step2
```
VerifyCodeButton mBtnCode = (VerifyCodeButton) findViewById(R.id.btn_code);
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
```

# Contact me

- Blog : http://blog.csdn.net/airsaid
- Email: Airsaid1024@gmail.com
- QQ Group: 5707887
