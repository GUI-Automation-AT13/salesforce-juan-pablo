package core.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigProperties {

    /**
     * Parameter for password.
     */
    @JsonProperty("password")
    private String password;

    /**
     * Parameter for baseUri.
     */
    @JsonProperty("baseUri")
    private String baseUri;

    /**
     * Parameter for browser.
     */
    @JsonProperty("browser")
    private String browser;

    /**
     * Parameter for explicit wait time.
     */
    @JsonProperty("explicit_wait_time")
    private String explicitWaitTime;

    /**
     * Parameter for implicit wait time.
     */
    @JsonProperty("implicit_wait_time")
    private String implicitWaitTime;

    /**
     * Parameter for username.
     */
    @JsonProperty("username")
    private String username;

    /**
     * Gets the password's value.
     *
     * @return a String with the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets the baseUri's value.
     *
     * @return a String with the baseUri
     */
    public String getBaseUri() {
        return baseUri;
    }

    /**
     * Gets the browser's value.
     *
     * @return a String with the browser
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * Gets the explicit wait time value.
     *
     * @return a String with the explicit wait time
     */
    public String getExplicitWaitTime() {
        return explicitWaitTime;
    }

    /**
     * Gets the implicit wait time value.
     *
     * @return a String with the implicit wait time
     */
    public String getImplicitWaitTime() {
        return implicitWaitTime;
    }

    /**
     * Gets the username's value.
     *
     * @return a String with the username
     */
    public String getUsername() {
        return username;
    }
}
