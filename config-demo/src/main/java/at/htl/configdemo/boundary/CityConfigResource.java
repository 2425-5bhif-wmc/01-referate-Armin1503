package at.htl.configdemo.boundary;

import at.htl.configdemo.control.CityConfig;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Optional;

@Path("config")
@Produces(MediaType.APPLICATION_JSON)
public class CityConfigResource {

    @Inject
    CityConfig cityConfig;

    @GET
    @Path("city")
    public String getCity(){
        return cityConfig.getCity();
    }

    @GET
    @Path("cities")
    public Optional<List<String>> getCities(){
        return cityConfig.getCities();
    }

    @GET
    @Path("other/city")
    public String getOtherCity(){
        return cityConfig.getOther().city();
    }

    @GET
    @Path("other/cities")
    public Optional<List<String>> getOtherCities(){
        return cityConfig.getOther().cities();
    }
}
