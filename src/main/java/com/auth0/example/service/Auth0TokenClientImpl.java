package com.auth0.example.service;

import com.auth0.example.model.rs.Rs;
import com.auth0.example.model.rs.auth0.Auth0Rs;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Service;

@Service
public class Auth0TokenClientImpl implements Auth0TokenClient {
    public Rs getToken() throws UnirestException {
        HttpResponse<JsonNode> jsonResponse = Unirest.post("https://corporate.auth0.com/oauth/token")
                .header("content-type", "application/json")
                .body("{\"client_id\":\"0bTUKDfGjBbd1SUNint67fM0wsKZyRxz\",\"client_secret\":\"BpZsm51bCoDgoaPoKwyg_irRij5WYK_4K78KKDjgLQf8XccAc4nZ9yJOG09FNfrW\",\"audience\":\"https://quickstarts/api\",\"grant_type\":\"client_credentials\"}")
                .asJson();
        Gson gson = new Gson();
        String responseJSONString = jsonResponse.getBody().toString();
        Auth0Rs auth0Rs = gson.fromJson(responseJSONString, Auth0Rs.class);
        return new Rs(auth0Rs.getAccessToken(), auth0Rs.getTokenType());
    }
}
