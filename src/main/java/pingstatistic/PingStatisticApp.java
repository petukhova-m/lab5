







import akka.stream.ActorMaterializer;

















public class PingStatisticApp {

    public static final int OK_CODE = 200;






        Query query = request.getUri().query();

        String count = query.get("count").orElse("10");









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















                materializer





                .thenAccept(unbound -> system.terminate()); // and shutdown when done


}
