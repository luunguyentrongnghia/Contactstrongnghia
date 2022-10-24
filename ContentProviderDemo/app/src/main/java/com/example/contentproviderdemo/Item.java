package com.example.contentproviderdemo;

public class Item {
    private String mName,information;


    public Item(String mName, String information) {
        this.mName = mName;
        this.information=information;


    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }




}
