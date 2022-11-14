package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "stork://my-service/hello")
public interface MyService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String greet();
}
