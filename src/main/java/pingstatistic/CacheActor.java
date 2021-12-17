package pingstatistic;

import akka.japi.Pair;
import akka.japi.pf.ReceiveBuilder;
import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{


    @Override


                .match(Pair.class, this::findInCache)
                .match(StoreRequest.class, this::storeToCache)
                .build();
    }


        data.put(request.getUrl(), request.getTime());
    }




                new CacheResponse(
                        url,
                        data.containsKey(url) ? data.get(url) : -1L
                ),
                getSelf()


    }


