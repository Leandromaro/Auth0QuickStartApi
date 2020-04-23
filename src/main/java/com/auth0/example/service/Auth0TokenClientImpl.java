package com.auth0.example.service;

import com.auth0.example.model.rq.Rq;
import com.auth0.example.model.rs.Rs;
import com.auth0.example.model.rs.auth0.Auth0Rs;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Auth0TokenClientImpl implements Auth0TokenClient {


    @Value("${auth0.url}")
    private String auth0Url;

    public Rs getToken(Rq rq) throws UnirestException {
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(rq);
        HttpResponse<JsonNode> jsonResponse = Unirest.post(auth0Url)
                .header("content-type", "application/json")
                .body(jsonRequest)
                .asJson();
        String responseJSONString = jsonResponse.getBody().toString();
        Auth0Rs auth0Rs = gson.fromJson(responseJSONString, Auth0Rs.class);
        return new Rs(auth0Rs.toString());
    }
}
