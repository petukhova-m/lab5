package pingstatistic;
import akka.actor.AbstractActor;


import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{






                .match(StoreRequest.class, this::storeToCache)
                .build();
    }

    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());
    }




                new CacheResponse(
                        url,


                getSelf()
        );

    }

}
