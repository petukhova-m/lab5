package pingstatistic;


import akka.japi.pf.ReceiveBuilder;
import java.util.HashMap;
import java.util.Map;




    @Override

        return ReceiveBuilder.create()
                .match(Pair.class, this::findInCache)
                .match(StoreRequest.class, this::storeToCache)
                .build();
    }


        data.put(request.getUrl(), request.getTime());
    }


        String url = request.first();

                new CacheResponse(
                        url,
                        data.containsKey(url) ? data.get(url) : -1L
                ),
                getSelf()


    }


