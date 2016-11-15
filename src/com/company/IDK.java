package com.company;

/**
 * Created by nawazkhan on 11/15/16.
 */
public class IDK {


    int xx;
    int yy;
    public IDK(int x, int y) {
        xx = x;
        yy = y;
    }
    public int getXx() { return xx;}

    public void setXx(int x) {
        if(xx >= 0) {
            xx = x;
        }
    }

    public int getYy() { return yy;}

    public void setYy(int y) {
        yy = y;
    }

}
