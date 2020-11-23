
package org.acme.rest.json;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
@RegisterRestClient(configKey = "test")
public interface RemoteFruit {

    @GET
    @Path("/")
    @Produces("application/json")
    String getFruit();
}
