package pingstatistic;

import akka.japi.Pair;
import akka.japi.pf.ReceiveBuilder;
import java.util.HashMap;


public class CacheActor extends AbstractActor{


    @Override

        return ReceiveBuilder.create()
                .match(Pair.class, this::findInCache)
                .match(StoreRequest.class, this::storeToCache)

    }


        data.put(request.getUrl(), request.getTime());
    }




                new CacheResponse(
                        url,


                getSelf()


    }


