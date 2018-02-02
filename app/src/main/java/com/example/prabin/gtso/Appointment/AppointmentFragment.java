package com.example.prabin.gtso.Appointment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.prabin.gtso.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AppointmentFragment extends Fragment {

    private ArrayList<AppointmentItem> items;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private AppointmentListAdapter mAdapter;


    public AppointmentFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializeData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_appointment, container, false);

        mRecyclerView = v.findViewById(R.id.appointment_recyclerView);

        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new AppointmentListAdapter(getContext(), items);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));

        return v;
    }

    private void initializeData() {

        items = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            AppointmentItem item = new AppointmentItem("Img", "Name " + i, "About " + i,
                    "Contact " + i, "Email " + i);
            items.add(item);
        }
    }

}
