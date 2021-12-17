
import akka.actor.AbstractActor;



import java.util.Map;

public class CacheActor extends AbstractActor{






                .match(StoreRequest.class, this::storeToCache)



    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());





                new CacheResponse(



                getSelf()





