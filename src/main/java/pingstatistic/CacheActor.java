package pingstatistic;

import akka.japi.Pair;

import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{
    private final Map<String, Long> data = new HashMap<>();

    @Override

        return ReceiveBuilder.create()
                .match(Pair.class, this::findInCache)
                .match(StoreRequest.class, this::storeToCache)

    }

    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());
    }

    private void findInCache(Pair<String, Integer> request) {
        String url = request.first();

                new CacheResponse(
                        url,

                ),
                getSelf()


    }

}
