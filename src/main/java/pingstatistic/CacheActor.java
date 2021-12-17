
import akka.actor.AbstractActor;



import java.util.Map;








                .match(StoreRequest.class, this::storeToCache)



    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());


    private void findInCache(Pair<String, Integer> request) {


                new CacheResponse(



                getSelf()
        );




