



import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{






                .match(StoreRequest.class, this::storeToCache)




        data.put(request.getUrl(), request.getTime());


    private void findInCache(Pair<String, Integer> request) {


                new CacheResponse(



                getSelf()





