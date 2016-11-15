package com.company;

/**
 * Created by nawazkhan on 11/15/16.
 */
public class Login {
    String firstName;
    String lastName;
    String phoneNumber;

    public Login(String p, String l, String f) {
        phoneNumber = p;
        lastName = l;
        phoneNumber = f;
    }

    public String getPhoneNumber() { return phoneNumber;}

    public void setPhoneNumber(String p) {
        if(p.length() == 10) {
            phoneNumber = p;
        }
    }
    public String getFirstName() { return firstName;}

    public void setFirstName(String f) {
        firstName = f;
    }
    public String getLastName() { return lastName;   }

    public void setLastName(String l) {
        lastName = l;
    }



}
