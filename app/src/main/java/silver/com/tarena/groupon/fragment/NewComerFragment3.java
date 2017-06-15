package silver.com.tarena.groupon.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import silver.com.tarena.groupon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewComerFragment3 extends BaseFragment {


    public NewComerFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_new_comer_fragment3, container, false);
        return view;
    }

}
