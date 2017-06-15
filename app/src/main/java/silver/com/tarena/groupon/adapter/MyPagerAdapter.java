package silver.com.tarena.groupon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import silver.com.tarena.groupon.fragment.NewComerFragment1;
import silver.com.tarena.groupon.fragment.NewComerFragment2;
import silver.com.tarena.groupon.fragment.NewComerFragment3;
import silver.com.tarena.groupon.fragment.NewComerFragment4;

/**
 * Created by Administrator on 2017/6/15 0015.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> Fragmentlist;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        Fragmentlist=new ArrayList<Fragment>();
        Fragmentlist.add(new NewComerFragment1());
        Fragmentlist.add(new NewComerFragment2());
        Fragmentlist.add(new NewComerFragment3());
        Fragmentlist.add(new NewComerFragment4());

    }


    @Override
    public Fragment getItem(int position) {
        return Fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return Fragmentlist.size();
    }
}
