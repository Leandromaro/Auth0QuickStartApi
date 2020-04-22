package com.auth0.example.service;

import com.auth0.example.model.rs.Rs;
import com.mashape.unirest.http.exceptions.UnirestException;

public interface Auth0TokenClient {
    Rs getToken() throws UnirestException;
}
