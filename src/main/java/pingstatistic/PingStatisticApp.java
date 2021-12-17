





import akka.japi.Pair;

import akka.stream.ActorMaterializer;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.Keep;

import akka.stream.javadsl.Source;



import java.io.IOException;
import java.time.Duration;
import java.util.Collections;

import java.util.concurrent.CompletableFuture;

import java.util.concurrent.Future;



public class PingStatisticApp {
    public static final int SERVER_PORT = 8080;
    public static final int OK_CODE = 200;




    public static Pair<String, Integer> makePair(HttpRequest request) {

        Query query = request.getUri().query();

        String count = query.get("count").orElse("10");

    }


        return Patterns.ask(cache, pair, Duration.ofMillis(5000)).thenCompose(
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
    private static Sink<Pair<String, Integer>, CompletionStage<Long>> testSink() {

                .<Pair<String, Integer>>create()
                .mapConcat(request -> Collections.nCopies(request.second(), request.first()))
                .mapAsync(5,
                        url -> {

                            long start = System.currentTimeMillis();

                            return async





                })
                .toMat(Sink.fold(0L, Long::sum), Keep.right());

    public static void main(String[] args) throws IOException {


        ActorSystem system = ActorSystem.create("routes");
        cache = system.actorOf(Props.create(CacheActor.class));
        final Http http = Http.get(system);
        materializer = ActorMaterializer.create(system);
        final Flow<HttpRequest, HttpResponse, NotUsed> routeFlow = Flow
                .of(HttpRequest.class)








        final CompletionStage<ServerBinding> binding = http.bindAndHandle(
                routeFlow,

                materializer



        binding
                .thenCompose(ServerBinding::unbind)
                .thenAccept(unbound -> system.terminate()); // and shutdown when done
    }

}
