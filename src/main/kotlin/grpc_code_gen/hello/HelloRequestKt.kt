//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: hello.proto

package grpc_code_gen.hello;

@kotlin.jvm.JvmName("-initializehelloRequest")
public inline fun helloRequest(block: grpc_code_gen.hello.HelloRequestKt.Dsl.() -> kotlin.Unit): grpc_code_gen.hello.Hello.HelloRequest =
  grpc_code_gen.hello.HelloRequestKt.Dsl._create(grpc_code_gen.hello.Hello.HelloRequest.newBuilder()).apply { block() }._build()
public object HelloRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: grpc_code_gen.hello.Hello.HelloRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: grpc_code_gen.hello.Hello.HelloRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): grpc_code_gen.hello.Hello.HelloRequest = _builder.build()

    /**
     * <code>string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun grpc_code_gen.hello.Hello.HelloRequest.copy(block: grpc_code_gen.hello.HelloRequestKt.Dsl.() -> kotlin.Unit): grpc_code_gen.hello.Hello.HelloRequest =
  grpc_code_gen.hello.HelloRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

