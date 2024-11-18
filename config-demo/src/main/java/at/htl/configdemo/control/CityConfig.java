package at.htl.configdemo.control;

import at.htl.configdemo.entity.CustomConfiguration;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class CityConfig {

    @Inject
    CustomConfiguration configuration;

    public String getCity(){
        return configuration.city();
    }

    public Optional<List<String>> getCities(){
        return configuration.cities();
    }

    public CustomConfiguration.Other getOther(){
        return configuration.other();
    }
}
