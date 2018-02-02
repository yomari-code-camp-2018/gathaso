package com.example.prabin.gtso.Opportunity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prabin.gtso.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OpportunityFragment extends Fragment {


    public OpportunityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_opportunity, container, false);
    }

}
