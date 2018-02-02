package com.example.prabin.gtso.Appointment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prabin.gtso.R;

import java.util.ArrayList;

/**
 * Created by Prabin on 1/31/2018.
 */

public class AppointmentListAdapter extends RecyclerView.Adapter<AppointmentListAdapter.ViewHolder> {

    Context mContext;
    ArrayList<AppointmentItem> items;

    public AppointmentListAdapter(Context mContext, ArrayList<AppointmentItem> items) {
        this.mContext = mContext;
        this.items = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        /*TextView name, qualification,  compName, compAddress, compContact;
        ImageView image;*/

        ImageView profileImage;
         TextView name, about,contact, email;

        public ViewHolder(View itemView) {
            super(itemView);

            profileImage = itemView.findViewById(R.id.profile_image);
            name = itemView.findViewById(R.id.profile_name);
            about = itemView.findViewById(R.id.profile_about);
            contact  = itemView.findViewById(R.id.profile_contact);
            email  = itemView.findViewById(R.id.profile_email);

            /*image  = itemView.findViewById(R.id.appointment_profile_pic);
            name = itemView.findViewById(R.id.appointment_profile_name);
            qualification  = itemView.findViewById(R.id.appointment_profile_qualification);
            compName = itemView.findViewById(R.id.appointment_company_name);
            compAddress = itemView.findViewById(R.id.appointment_company_address);
            compContact = itemView.findViewById(R.id.appointment_company_contact);*/
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_appointment_detail, parent, false);
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.appointment_single_row, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        AppointmentItem item = items.get(position);
/*
        holder.name.setText(item.getName));
        holder.qualification.setText(item.getQualification());
        holder.compName.setText(item.getCompName());
        holder.compAddress.setText(item.getCompAddress());
        holder.compContact.setText(item.getCompContact());*/

        holder.name.setText(item.getName());
        holder.about.setText(item.getAbout());
        holder.contact.setText(item.getContact());
        holder.email.setText(item.getEmail());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
