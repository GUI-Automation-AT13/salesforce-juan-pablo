package salesforce.ui;

public enum Pages {
    LOGIN("https://login.salesforce.com"),
    ACCOUNT("/lightning/o/Account/list?filterName=Recent"),
    CONTACTS("/lightning/o/Contact/list?filterName=Recent");

    private final String pageRoute;

    Pages(final String pageRoute) {
        this.pageRoute = pageRoute;
    }

    /**
     * .
     * @return .
     */
    public String getPageRoute() {
        return pageRoute;
    }

    @Override
    public String toString() {
        return "pageRoute=" + pageRoute;
    }
}
