package salesforce.config;

import core.utils.PropertiesReader;

import java.util.Properties;

public class EnvConfig {

    private String baseUrl;
    private String loginUrl;
    private String userName;
    private String password;


    private static EnvConfig envConfig;

    private EnvConfig() {
        initialize();
    }

    public static EnvConfig getInstance() {
        if (envConfig == null) {
            envConfig = new EnvConfig();
        }
        return envConfig;
    }

    private void initialize() {
        Properties properties = PropertiesReader.getProperties("config.properties");
        loginUrl = properties.getProperty("loginUrl");
        baseUrl = properties.getProperty("baseUrl");
        userName = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public String getUserName() {
        return userName;
    }

    public java.lang.String getPassword() {
        return password;
    }
}
