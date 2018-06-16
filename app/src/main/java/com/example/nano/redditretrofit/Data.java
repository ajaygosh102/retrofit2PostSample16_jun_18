package com.example.nano.redditretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("username")
    @Expose
    private String username;

    @SerializedName("phone")
    @Expose
    private String phone;

    public String getUsername() {
        return username;
    }

    public String getPhone() {
        return phone;
    }

    public String getRegistration_status() {
        return registration_status;
    }

    public String getUsertype() {
        return usertype;
    }

    @SerializedName("registration_status")
    @Expose
    private String registration_status;
    @SerializedName("usertype")
    @Expose
    private String usertype;
}
