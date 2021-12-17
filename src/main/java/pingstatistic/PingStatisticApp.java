







import akka.stream.ActorMaterializer;







import java.io.IOException;

import java.util.Collections;

import java.util.concurrent.CompletableFuture;





public class PingStatisticApp {

    public static final int OK_CODE = 200;




    public static Pair<String, Integer> makePair(HttpRequest request) {

        Query query = request.getUri().query();

        String count = query.get("count").orElse("10");





                result -> {
                    long responceTime = ((CacheResponse) result).getTime();
                    if (responceTime > 0) {

                    }

                            .toMat(

                                    Keep.right()
                            )










    }



                .mapConcat(request -> Collections.nCopies(request.second(), request.first()))
                .mapAsync(5,
                        url -> {

                            long start = System.currentTimeMillis();

                            return async





                })






        cache = system.actorOf(Props.create(CacheActor.class));


        final Flow<HttpRequest, HttpResponse, NotUsed> routeFlow = Flow
                .of(HttpRequest.class)








        final CompletionStage<ServerBinding> binding = http.bindAndHandle(


                materializer





                .thenAccept(unbound -> system.terminate()); // and shutdown when done
    }

}
