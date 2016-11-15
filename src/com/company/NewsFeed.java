package com.company;

/**
 * Created by nawazkhan on 11/15/16.
 */
public class NewsFeed {

    double item1Price;
    double item2Price;
    String item1Picture;
    String item2Picture;

    public NewsFeed(double i1, double i2, String p1, String p2) {
        item1Price = i1;
        item2Price = i2;
        item1Picture = p1;
        item2Picture = p2;
    }

    public double getItem1Price() {return item1Price;}

    public void setItem1Price(double i1) {
        if(item1Price > 0) {
            item1Price = i1;
        }
    }

    public double getItem2Price() {return item2Price;}

    public void setItem2Price(double i2) {
        item2Price = i2;
    }

    public String getItem1Picture() {return item1Picture;}

    public void setItem1Picture(String p1) {
        item1Picture = p1;
    }

    public String getItem2Picture() {return item2Picture;}

    public void setItem2Picture(String p2) {
        item2Picture = p2;
    }


}
