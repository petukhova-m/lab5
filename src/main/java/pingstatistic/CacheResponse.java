package pingstatistic;

public class CacheResponse {
    private final String url;


    public String getUrl() {
        return url;
    }

    public Long getTime() {
        return time;
    }


    public CacheResponse(String url, Long time) {
        this.url = url;
        this.time = time;
    }
}
