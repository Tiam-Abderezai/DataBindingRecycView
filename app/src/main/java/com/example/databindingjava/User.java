package com.example.databindingjava;

public class User {

    public String mName;
    public String mEmail;


    public User(String mName, String mEmail) {
        this.mName = mName;
        this.mEmail = mEmail;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
}
