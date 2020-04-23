package com.auth0.example.model.rs;

import com.google.gson.annotations.SerializedName;

public class Rs {
    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("token_type")
    private String tokenType;

    public String getAccess_token() {
        return accessToken;
    }

    public void setAccess_token(String access_token) {
        this.accessToken = access_token;
    }

    public String getToken_type() {
        return tokenType;
    }

    public void setToken_type(String token_type) {
        this.tokenType = token_type;
    }

    public Rs() {
    }

    public Rs(String access_token, String token_type) {
        this.accessToken = access_token;
        this.tokenType = token_type;
    }
}
