package silver.com.tarena.groupon.ui;


import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import silver.com.tarena.groupon.R;
import silver.com.tarena.groupon.adapter.MyPagerAdapter;

public class GuideActivity extends FragmentActivity{
    ViewPager viewPager;
    MyPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        viewPager=(ViewPager)findViewById(R.id.viewPager_Guide);
        initViewPager();
    }

    private void initViewPager() {
        adapter=new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }


}