package pingstatistic;
import akka.actor.AbstractActor;
import akka.japi.Pair;

import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{


    @Override



                .match(StoreRequest.class, this::storeToCache)
                .build();
    }

    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());
    }

    private void findInCache(Pair<String, Integer> request) {


                new CacheResponse(
                        url,


                getSelf()
        );

    }

}
