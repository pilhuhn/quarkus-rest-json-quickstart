package org.acme.rest.json;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fruits")
public class FruitResource {

    @Inject
    @RestClient
    RemoteFruit fruits;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        String fruit = "apple";
        try {
            fruit = fruits.getFruit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "hello " + fruit;
    }
}
