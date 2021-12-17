







import akka.stream.ActorMaterializer;







import java.io.IOException;

import java.util.Collections;

import java.util.concurrent.CompletableFuture;





public class PingStatisticApp {

    public static final int OK_CODE = 200;




    public static Pair<String, Integer> makePair(HttpRequest request) {

        Query query = request.getUri().query();

        String count = query.get("count").orElse("10");

    }



                result -> {
                    long responceTime = ((CacheResponse) result).getTime();
                    if (responceTime > 0) {
                        return CompletableFuture.completedFuture(new Pair<>(pair.first(), responceTime));
                    }

                            .toMat(

                                    Keep.right()
                            )




                                                    pair.first(),




                });
    }


                .<Pair<String, Integer>>create()
                .mapConcat(request -> Collections.nCopies(request.second(), request.first()))
                .mapAsync(5,
                        url -> {

                            long start = System.currentTimeMillis();

                            return async





                })
                .toMat(Sink.fold(0L, Long::sum), Keep.right());





        cache = system.actorOf(Props.create(CacheActor.class));
        final Http http = Http.get(system);
        materializer = ActorMaterializer.create(system);
        final Flow<HttpRequest, HttpResponse, NotUsed> routeFlow = Flow
                .of(HttpRequest.class)








        final CompletionStage<ServerBinding> binding = http.bindAndHandle(
                routeFlow,

                materializer



        binding

                .thenAccept(unbound -> system.terminate()); // and shutdown when done
    }

}
