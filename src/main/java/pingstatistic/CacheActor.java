package pingstatistic;


import akka.japi.pf.ReceiveBuilder;
import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{
    private final Map<String, Long> data = new HashMap<>();

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()

                .match(StoreRequest.class, this::storeToCache)

    }

    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());
    }

    private void findInCache(Pair<String, Integer> request) {
        String url = request.first();
        sender().tell(
                new CacheResponse(

                        data.containsKey(url) ? data.get(url) : -1L
                ),
                getSelf()
        );

    }

}
