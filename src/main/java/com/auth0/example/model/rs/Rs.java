package com.auth0.example.model.rs;

import com.google.gson.annotations.SerializedName;

public class Rs {
    @SerializedName("token")
    private String token;

    public String getAccess_token() {
        return token;
    }

    public void setAccess_token(String access_token) {
        this.token = access_token;
    }

    public Rs() {
    }

    public Rs(String token) {
        this.token = token;
    }
}
