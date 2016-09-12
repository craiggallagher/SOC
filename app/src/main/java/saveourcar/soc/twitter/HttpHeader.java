package saveourcar.soc.twitter;

/**
 * Created by Craigg on 04/02/2016.
 */
public class HttpHeader {
    private String key;
    private String value;

    public HttpHeader(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
