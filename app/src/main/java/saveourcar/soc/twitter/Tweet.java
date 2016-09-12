package saveourcar.soc.twitter;
import com.google.gson.annotations.SerializedName;
public class Tweet {
    @SerializedName("text")
    private String content;

    public String getContent() {
        return content;
    }
}
