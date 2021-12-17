package pingstatistic;



import java.util.HashMap;


public class CacheActor extends AbstractActor{




        return ReceiveBuilder.create()



    }

    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());
    }


        String url = request.first();





                getSelf()




}
