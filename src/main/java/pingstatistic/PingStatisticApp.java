







import akka.stream.ActorMaterializer;

















public class PingStatisticApp {






















                            .toMat(

                                    Keep.right()











    }



                .mapConcat(request -> Collections.nCopies(request.second(), request.first()))

                        url -> {

                            long start = System.currentTimeMillis();







                })






















                materializer








}
