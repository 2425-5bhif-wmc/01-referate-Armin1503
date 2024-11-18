package at.htl.configdemo.entity;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

import java.util.List;
import java.util.Optional;

@ConfigMapping(prefix = "custom")
public interface CustomConfiguration {

    @WithDefault("Linz")
    String city();

    Optional<List<String>> cities();

    Other other();

    interface Other {

        @WithDefault("Paris")
        String city();

        Optional<List<String>> cities();
    }
}
