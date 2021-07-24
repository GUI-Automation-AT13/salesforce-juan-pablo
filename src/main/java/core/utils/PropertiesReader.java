/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertiesReader {

    /**
     * Gets an object with all environment variables and their values within properties file.
     *
     * @param filePath Json file path.
     * @return a property entity.
     */
    public static Properties getProperties(final String filePath) {
        Properties properties = new Properties();
        try {
            InputStream reading = new FileInputStream(filePath);
            properties.load(reading);
        } catch (IOException | NullPointerException exception) {
            throw new RuntimeException("It was not possible to read file properties.", exception);
        }
        return properties;
    }
}
