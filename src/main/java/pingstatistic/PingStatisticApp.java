







import akka.stream.ActorMaterializer;











import java.util.concurrent.CompletableFuture;





public class PingStatisticApp {

    public static final int OK_CODE = 200;




    public static Pair<String, Integer> makePair(HttpRequest request) {

        Query query = request.getUri().query();

        String count = query.get("count").orElse("10");





                result -> {



                    }

                            .toMat(

                                    Keep.right()
                            )










    }



                .mapConcat(request -> Collections.nCopies(request.second(), request.first()))

                        url -> {

                            long start = System.currentTimeMillis();

                            return async





                })






        cache = system.actorOf(Props.create(CacheActor.class));












        final CompletionStage<ServerBinding> binding = http.bindAndHandle(


                materializer





                .thenAccept(unbound -> system.terminate()); // and shutdown when done


}
