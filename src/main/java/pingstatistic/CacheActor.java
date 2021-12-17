package pingstatistic;
import akka.actor.AbstractActor;
import akka.japi.Pair;

import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{
    private final Map<String, Long> data = new HashMap<>();


    public Receive createReceive() {


                .match(StoreRequest.class, this::storeToCache)
                .build();


    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());
    }

    private void findInCache(Pair<String, Integer> request) {


                new CacheResponse(
                        url,
                        data.containsKey(url) ? data.get(url) : -1L
                ),
                getSelf()
        );

    }


