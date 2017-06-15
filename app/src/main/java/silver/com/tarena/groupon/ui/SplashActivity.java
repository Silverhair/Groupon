package silver.com.tarena.groupon.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;


import silver.com.tarena.groupon.R;
import silver.com.tarena.groupon.constant.Constant;
import silver.com.tarena.groupon.util.SPUtil;


public class SplashActivity extends Activity {

    SPUtil spUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        spUtil = new SPUtil(this);
        //界面停留几秒钟
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //读取偏好设置文件中的值
                //根据是否是第一次使用进行相应的界面跳转
                Intent intent;

                if(true){
                    //向新手指导页跳转
                    intent = new Intent(SplashActivity.this,GuideActivity.class);
                    spUtil.setFirst(false);
                }else{
                    //向主页面跳转
                    intent = new Intent(SplashActivity.this,MainActivity.class);
                }

                startActivity(intent);
                finish();
            }
        },1500);

    }
}
