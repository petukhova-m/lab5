package pingstatistic;
import akka.actor.AbstractActor;


import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{







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
