package com.company;

/**
 * Created by nawazkhan on 11/15/16.
 */
public class PersonaLInfo {

    int age;
    int height;
    String ethnicBackround;

    public PersonaLInfo(int a, int h, String b) {
        age = a;
        height = h;
        ethnicBackround = b;
    }

    public int getAge() { return age;}

    public void setAge(int a) {
        if(isAgePositive(a)) {
            age = a;
        }
    }
    public boolean isAgePositive(int a) {
        return a > 0;
    }

    public int getHeight() { return height;}

    public void setHeight(int h) {
        height = h;
    }

    public String getEthnicBackround() { return ethnicBackround;}

    public void setEthnicBackround(String b) {
        ethnicBackround = b;
    }


}
