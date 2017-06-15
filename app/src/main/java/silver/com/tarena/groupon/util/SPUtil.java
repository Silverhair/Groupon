package silver.com.tarena.groupon.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import silver.com.tarena.groupon.constant.Constant;

/**
 *
 * 对偏好设置文件的操作
 * 1）Context的getSharedPreferences(文件名，模式）
 * 2）Activityde的getSharedPreference(模式)；获取
 * Created by Administrator on 2017/6/15 0015.
 */

public class SPUtil {
    SharedPreferences sp;

    //通过构造器重载，以不同的方式来获得偏好设置文件

    public SPUtil(Context context, String name){
        sp = context.getSharedPreferences(name,Context.MODE_PRIVATE);
    }

    public SPUtil(Context context){
        sp = PreferenceManager.getDefaultSharedPreferences(context);

    }

    public boolean isFirst(){

        return sp.getBoolean(Constant.FIRST,true);

    }

    public void setFirst(boolean flag){
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(Constant.FIRST,flag);
        editor.commit();
    }

}
