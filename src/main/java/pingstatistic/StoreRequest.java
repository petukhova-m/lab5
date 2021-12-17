

public class StoreRequest {
    private String url;
    private Long time;

    public StoreRequest(String url, long time) {

        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public long getTime() {
        return time;
    }

