package pingstatistic;


    private final String url;


    public String getUrl() {

    }

    public Long getTime() {
        return time;
    }


    public CacheResponse(String url, Long time) {
        this.url = url;
        this.time = time;
    }
}
