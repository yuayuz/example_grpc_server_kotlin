package service

import grpc_code_gen.hello.GreeterGrpcKt
import grpc_code_gen.hello.Hello.HelloRequest
import grpc_code_gen.hello.helloReply


class service: GreeterGrpcKt.GreeterCoroutineImplBase(

) {
    /*override suspend fun sayHello(request: Hello.HelloRequest): Hello.HelloReply {
        val name= request.name
        val builder=Hello.HelloReply.newBuilder()
        builder.message= "hello,$name"
        return  builder.defaultInstanceForType
    }*/
    override suspend fun sayHello(request: HelloRequest)= helloReply{
        message="hello,${request.name}!"
    }

}
