package pingstatistic;

public class StoreRequest {
    private String url;
    private Long time;

    public StoreRequest(String url, long time) {
        this.url = url;
        this.time = time;
    }


        return url;
    }

    public long getTime() {
        return time;
    }
}
