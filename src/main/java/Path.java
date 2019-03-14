import java.text.MessageFormat;

public enum Path {
    BASEURL("www.getpostman.com/collections"),
    APIID("/xxxxxxxxxxxx")

    ;

    String uri;

    Path(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public String getUri(String... id) {
        return MessageFormat.format(getUri(), id);
    }
}

