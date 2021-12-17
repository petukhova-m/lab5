package pingstatistic;
import akka.actor.AbstractActor;
import akka.japi.Pair;
import akka.japi.pf.ReceiveBuilder;
import java.util.HashMap;
import java.util.Map;

public class CacheActor extends AbstractActor{


    @Override
    public Receive createReceive() {



                .build();
    }

    private void storeToCache(StoreRequest request) {
        data.put(request.getUrl(), request.getTime());
    }

    private void findInCache(Pair<String, Integer> request) {

        sender().tell(
                new CacheResponse(
                        url,

                ),
                getSelf()
        );

    }

}
