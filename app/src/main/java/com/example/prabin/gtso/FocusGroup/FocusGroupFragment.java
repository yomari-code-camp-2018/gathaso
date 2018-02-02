package com.example.prabin.gtso.FocusGroup;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prabin.gtso.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FocusGroupFragment extends Fragment {


    public FocusGroupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_focus_group, container, false);
    }

}
