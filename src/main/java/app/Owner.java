package app;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/owner")
public class Owner<Cars> {
    private String Fullname;
    private String Email;
    private long ID;

    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @GET


        public Car getCarInformation() {
        
        return new Car("Audi", "RS", 2012);
    }

    @POST
    @Path("/carowner")
    @Produces(MediaType.APPLICATION_JSON)
        public String CarOwner(){
        return" Mohammed own car";
       }
       public static <viod> void me(){

        String NAMEE;
        System.out.println("mohammed");

    }
}