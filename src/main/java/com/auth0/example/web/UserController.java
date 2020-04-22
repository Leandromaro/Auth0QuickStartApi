package com.auth0.example.web;

import com.auth0.example.model.rq.Rq;
import com.auth0.example.model.rs.Rs;
import com.auth0.example.service.Auth0TokenClient;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "login", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final Auth0TokenClient auth0TokenClient ;

    public UserController(Auth0TokenClient auth0TokenClient) {
        this.auth0TokenClient = auth0TokenClient;
    }

    @PostMapping(path = "/token", consumes = "application/json", produces = "application/json")
    public Rs auth(Rq request) throws UnirestException {
        return auth0TokenClient.getToken();
    }
}
