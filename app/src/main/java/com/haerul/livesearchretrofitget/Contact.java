package com.haerul.livesearchretrofitget;

import com.google.gson.annotations.SerializedName;

/**
 * Created by haerul on 17/03/18.
 */

public class Contact {

    @SerializedName("id") private int Id;
    @SerializedName("name") private String Name;
    @SerializedName("email") private String Email;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
