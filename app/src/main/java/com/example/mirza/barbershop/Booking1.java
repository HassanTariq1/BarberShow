package com.example.mirza.barbershop;

/**
 * Created by Mirza on 5/9/2018.
 */

public class Booking1 {

String name, add, ph, t,d,st,tn;

    public Booking1() {


    }

    public Booking1(String name, String add, String ph, String t, String d, String st, String tn) {
        this.name = name;
        this.add = add;
        this.ph = ph;
        this.t = t;
        this.d = d;
        this.st = st;
        this.tn = tn;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public String getPh() {
        return ph;
    }

    public String getT() {
        return t;
    }

    public String getD() {
        return d;
    }

    public String getSt() {
        return st;
    }

    public String getTn() {
        return tn;
    }

}
