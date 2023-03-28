package service

import io.grpc.Server
import io.grpc.netty.NettyServerBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class HelloWorldServer(private val port: Int) {
    private val server: Server = NettyServerBuilder
        .forPort(port)
        .addService(service())
        .build()

    fun start() {
        server.start()
        println("Server started, listening on $port")
       /* CoroutineScope(Dispatchers.IO).launch {
            println("*** shutting down gRPC server since JVM is shutting down")
            this@HelloWorldServer.stop()
            println("*** server shut down")
        }*/

    }

    private fun stop() {
        server.shutdown()
    }

    fun blockUntilShutdown() {
        server.awaitTermination()
    }


}

/*fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 50051
    val server = HelloWorldServer(port)
    server.start()
    server.blockUntilShutdown()
}*/
