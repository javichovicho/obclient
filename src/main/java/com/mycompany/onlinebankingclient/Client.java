/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.onlinebankingclient;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * 30/07/2018
 * @author jagon
 */
public class Client {
    public static void main(String[] args){
        int port = 49000;
        String getUrl = "http://localhost:" + port + "/api/accounts/customer/1/account/2";
        
        com.sun.jersey.api.client.Client client = com.sun.jersey.api.client.Client.create();
        WebResource target = client.resource(getUrl);
        
        ClientResponse response = target
                .get(ClientResponse.class);
        
        System.out.println(response.getEntity(String.class));
        
    }
}
