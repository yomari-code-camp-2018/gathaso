package com.example.prabin.gtso;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.prabin.gtso.Appointment.AppointmentFragment;
import com.example.prabin.gtso.FocusGroup.FocusGroupFragment;
import com.example.prabin.gtso.Opportunity.OpportunityFragment;

public class MainActivity extends AppCompatActivity {

    AppointmentFragment appointment = new AppointmentFragment();
    OpportunityFragment opportunity = new OpportunityFragment();
    FocusGroupFragment focusGroup = new FocusGroupFragment();

    FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setSelectedItemId(R.id.navigation_opportunity);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        manager.beginTransaction().replace(R.id.main_placeholder, opportunity)
                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                .commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_appointment:
                    manager.beginTransaction().replace(R.id.main_placeholder, appointment)
                            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                            .commit();
                    return true;
                case R.id.navigation_opportunity:
                    manager.beginTransaction().replace(R.id.main_placeholder, opportunity)
                            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                            .commit();
                    return true;
                case R.id.navigation_focus_group:
                    manager.beginTransaction().replace(R.id.main_placeholder, focusGroup)
                            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                            .commit();
                    return true;
            }
            return false;
        }
    };
}
