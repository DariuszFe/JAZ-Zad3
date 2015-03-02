package com.example.servletjspdemo.domain;

/**
 * Created by robert on 02.03.15.
 */
public class ConferenceRegistration {

    private String name;
    private String lastName;
    private String email;
    private String prac;
    private String zaj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrac() {
        return prac;
    }

    public void setPrac(String prac) {
        this.prac = prac;
    }

    public String getZaj() {
        return zaj;
    }

    public void setZaj(String zaj) {
        this.zaj = zaj;
    }

    @Override
    public boolean equals(Object obj) {
        if (((ConferenceRegistration) obj).getEmail().equals(email))
            return true;

        return false;
    }
}
