package core.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigProperties {

    @JsonProperty("password")
    private String password;

    @JsonProperty("baseUri")
    private String baseUri;

    @JsonProperty("browser")
    private String browser;

    @JsonProperty("explicit_wait_time")
    private String explicitWaitTime;

    @JsonProperty("implicit_wait_time")
    private String implicitWaitTime;

    @JsonProperty("username")
    private String username;

    public String getPassword() {
        return password;
    }

    public String getBaseUri() {
        return baseUri;
    }

    public String getBrowser() {
        return browser;
    }

    public String getExplicitWaitTime() {
        return explicitWaitTime;
    }

    public String getImplicitWaitTime() {
        return implicitWaitTime;
    }

    public String getUsername() {
        return username;
    }
}
