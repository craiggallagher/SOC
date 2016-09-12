package saveourcar.soc.twitter;

public abstract class HttpGetRequestListener {

    public void onPrepare() {
    }

    abstract public void onSuccess(String result);

    abstract public void onFailure(Exception ex);

}
