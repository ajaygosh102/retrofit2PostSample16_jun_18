package com.example.nano.redditretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Files {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("phone")
    @Expose
    private String phone;

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    @SerializedName("data")
    @Expose
    private ArrayList<Data> data;
}
