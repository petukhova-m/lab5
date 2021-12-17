package pingstatistic;

import akka.japi.Pair;

import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{




        return ReceiveBuilder.create()
                .match(Pair.class, this::findInCache)
                .match(StoreRequest.class, this::storeToCache)

    }

    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());
    }

    private void findInCache(Pair<String, Integer> request) {
        String url = request.first();


                        url,

                ),
                getSelf()




}
