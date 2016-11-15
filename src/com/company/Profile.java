package com.company;

/**
 * Created by nawazkhan on 11/15/16.
 */
public class Profile {
    String bio;
    String lookingFor;
    String bestfriend;

    public Profile(String b, String l, String bf) {
        bio = b;
        lookingFor = l;
        bestfriend = bf;
    }

    public String getBio() {return bio;}

    public void setBio(String b) {
        if(b.length() <201) {
            bio = b;
        }
    }

    public String getLookingFor() { return lookingFor;}

    public void setLookingFor(String l) {
        lookingFor = l;
    }
    public String getBestfriend() { return bestfriend;}

    public void setBestfriend(String bf) {
        bestfriend = bf;
    }



}
