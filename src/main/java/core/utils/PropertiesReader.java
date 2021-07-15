package core.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertiesReader {

    /**
     * Gets an object with all environment variables and their values within properties file.
     *
     * @return a property entity.
     */
    public static Properties getProperties(final String filePath) {
        Properties properties = new Properties();
        try {
            InputStream reading = new FileInputStream(filePath);
            properties.load(reading);
        } catch (IOException | NullPointerException e) {
            throw new RuntimeException("It was not possible to read file properties.", e);
        }
        return properties;
    }
}
