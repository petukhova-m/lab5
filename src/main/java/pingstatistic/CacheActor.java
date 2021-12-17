package pingstatistic;
import akka.actor.AbstractActor;

import akka.japi.pf.ReceiveBuilder;
import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{
    private final Map<String, Long> data = new HashMap<>();

    @Override

        return ReceiveBuilder.create()
                .match(Pair.class, this::findInCache)
                .match(StoreRequest.class, this::storeToCache)
                .build();
    }

    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());
    }


        String url = request.first();

                new CacheResponse(
                        url,
                        data.containsKey(url) ? data.get(url) : -1L
                ),
                getSelf()
        );

    }

}
