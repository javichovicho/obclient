/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.onlinebankingclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.*;

/**
 * 20/06/2018
 * @author jagon
 */
public class ClientPost {
    public static void main(String[] args){
        try{
            
            Client client = Client.create();
            int port = 49000;
            String url = "http://localhost:" + port + "/api/accounts/createCustomer";
            WebResource webResource = client.resource(url);
            
            String name = "Andrew";
            
            String input = "{\"name\":\"" + name + "\"}";
            
            ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);
            String output = response.getEntity(String.class);
            System.out.println(output);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
