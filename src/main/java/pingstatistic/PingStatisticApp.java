







import akka.stream.ActorMaterializer;

















public class PingStatisticApp {

    public static final int OK_CODE = 200;






        Query query = request.getUri().query();











                    }

                            .toMat(

                                    Keep.right()
                            )










    }



                .mapConcat(request -> Collections.nCopies(request.second(), request.first()))

                        url -> {

                            long start = System.currentTimeMillis();







                })






















                materializer








}
