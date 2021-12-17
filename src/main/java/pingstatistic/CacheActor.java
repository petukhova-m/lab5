
import akka.actor.AbstractActor;


import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{






                .match(StoreRequest.class, this::storeToCache)



    private void storeToCache(StoreRequest request) {



    private void findInCache(Pair<String, Integer> request) {


                new CacheResponse(
                        url,


                getSelf()
        );




