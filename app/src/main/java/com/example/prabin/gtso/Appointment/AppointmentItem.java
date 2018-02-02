package com.example.prabin.gtso.Appointment;

/**
 * Created by Prabin on 2/1/2018.
 */

public class AppointmentItem {

    String image, name, about, contact, email;

    public AppointmentItem(String image, String name, String about, String contact, String email) {
        this.image = image;
        this.name = name;
        this.about = about;
        this.contact = contact;
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }
}
