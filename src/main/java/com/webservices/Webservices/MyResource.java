package com.webservices.Webservices;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservices.Webservices.bean.Profile;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {


	private static ArrayList<Profile> l=new ArrayList<>();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
/*    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }*/
    
    @GET
    
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<Profile> getProfile()
    {
    	
    	return l;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Profile addMessage(Profile m)
    {
    
    	
    	l.add(m);
    	
    	return m;

}
}
