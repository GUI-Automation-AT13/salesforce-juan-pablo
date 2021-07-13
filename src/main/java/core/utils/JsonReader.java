package core.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import core.entities.ConfigProperties;

import java.io.File;
import java.io.IOException;

public class JsonReader {

    public ConfigProperties readConfig() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File("config.json"), ConfigProperties.class);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return null;
    }
}
