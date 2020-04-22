package com.auth0.example.model.rs;

public class Rs {
    private String access_token;
    private String token_type;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public Rs() {
    }

    public Rs(String access_token, String token_type) {
        this.access_token = access_token;
        this.token_type = token_type;
    }
}
