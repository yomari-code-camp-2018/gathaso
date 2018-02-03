package com.example.prabin.gtso.Opportunity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.prabin.gtso.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OpportunityFragment extends Fragment {


    ImageButton btnMeditation;

    public OpportunityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_opportunity, container, false);

        btnMeditation = view.findViewById(R.id.opportunity_meditation);
        btnMeditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTherapyActivity();
            }
        });
        return view;
    }

    private void openTherapyActivity() {
        startActivity(new Intent(getContext(), MeditatationActivity.class));
    }

}
