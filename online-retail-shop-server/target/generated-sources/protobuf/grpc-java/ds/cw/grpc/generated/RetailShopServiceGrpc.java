package ds.cw.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: RetailShopService.proto")
public final class RetailShopServiceGrpc {

  private RetailShopServiceGrpc() {}

  public static final String SERVICE_NAME = "ds.cw.grpc.generated.RetailShopService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.cw.grpc.generated.CheckRetailShopItemStockRequest,
      ds.cw.grpc.generated.CheckRetailShopItemStockResponse> getCheckRetailShopItemStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkRetailShopItemStock",
      requestType = ds.cw.grpc.generated.CheckRetailShopItemStockRequest.class,
      responseType = ds.cw.grpc.generated.CheckRetailShopItemStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.cw.grpc.generated.CheckRetailShopItemStockRequest,
      ds.cw.grpc.generated.CheckRetailShopItemStockResponse> getCheckRetailShopItemStockMethod() {
    io.grpc.MethodDescriptor<ds.cw.grpc.generated.CheckRetailShopItemStockRequest, ds.cw.grpc.generated.CheckRetailShopItemStockResponse> getCheckRetailShopItemStockMethod;
    if ((getCheckRetailShopItemStockMethod = RetailShopServiceGrpc.getCheckRetailShopItemStockMethod) == null) {
      synchronized (RetailShopServiceGrpc.class) {
        if ((getCheckRetailShopItemStockMethod = RetailShopServiceGrpc.getCheckRetailShopItemStockMethod) == null) {
          RetailShopServiceGrpc.getCheckRetailShopItemStockMethod = getCheckRetailShopItemStockMethod =
              io.grpc.MethodDescriptor.<ds.cw.grpc.generated.CheckRetailShopItemStockRequest, ds.cw.grpc.generated.CheckRetailShopItemStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkRetailShopItemStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.cw.grpc.generated.CheckRetailShopItemStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.cw.grpc.generated.CheckRetailShopItemStockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RetailShopServiceMethodDescriptorSupplier("checkRetailShopItemStock"))
              .build();
        }
      }
    }
    return getCheckRetailShopItemStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.cw.grpc.generated.SetRetailShopItemStockRequest,
      ds.cw.grpc.generated.SetRetailShopItemStockResponse> getSetRetailShopItemStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setRetailShopItemStock",
      requestType = ds.cw.grpc.generated.SetRetailShopItemStockRequest.class,
      responseType = ds.cw.grpc.generated.SetRetailShopItemStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.cw.grpc.generated.SetRetailShopItemStockRequest,
      ds.cw.grpc.generated.SetRetailShopItemStockResponse> getSetRetailShopItemStockMethod() {
    io.grpc.MethodDescriptor<ds.cw.grpc.generated.SetRetailShopItemStockRequest, ds.cw.grpc.generated.SetRetailShopItemStockResponse> getSetRetailShopItemStockMethod;
    if ((getSetRetailShopItemStockMethod = RetailShopServiceGrpc.getSetRetailShopItemStockMethod) == null) {
      synchronized (RetailShopServiceGrpc.class) {
        if ((getSetRetailShopItemStockMethod = RetailShopServiceGrpc.getSetRetailShopItemStockMethod) == null) {
          RetailShopServiceGrpc.getSetRetailShopItemStockMethod = getSetRetailShopItemStockMethod =
              io.grpc.MethodDescriptor.<ds.cw.grpc.generated.SetRetailShopItemStockRequest, ds.cw.grpc.generated.SetRetailShopItemStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setRetailShopItemStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.cw.grpc.generated.SetRetailShopItemStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.cw.grpc.generated.SetRetailShopItemStockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RetailShopServiceMethodDescriptorSupplier("setRetailShopItemStock"))
              .build();
        }
      }
    }
    return getSetRetailShopItemStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.cw.grpc.generated.OrderRetailShopItemRequest,
      ds.cw.grpc.generated.OrderRetailShopItemResponse> getOrderRetailShopItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "orderRetailShopItem",
      requestType = ds.cw.grpc.generated.OrderRetailShopItemRequest.class,
      responseType = ds.cw.grpc.generated.OrderRetailShopItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.cw.grpc.generated.OrderRetailShopItemRequest,
      ds.cw.grpc.generated.OrderRetailShopItemResponse> getOrderRetailShopItemMethod() {
    io.grpc.MethodDescriptor<ds.cw.grpc.generated.OrderRetailShopItemRequest, ds.cw.grpc.generated.OrderRetailShopItemResponse> getOrderRetailShopItemMethod;
    if ((getOrderRetailShopItemMethod = RetailShopServiceGrpc.getOrderRetailShopItemMethod) == null) {
      synchronized (RetailShopServiceGrpc.class) {
        if ((getOrderRetailShopItemMethod = RetailShopServiceGrpc.getOrderRetailShopItemMethod) == null) {
          RetailShopServiceGrpc.getOrderRetailShopItemMethod = getOrderRetailShopItemMethod =
              io.grpc.MethodDescriptor.<ds.cw.grpc.generated.OrderRetailShopItemRequest, ds.cw.grpc.generated.OrderRetailShopItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "orderRetailShopItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.cw.grpc.generated.OrderRetailShopItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.cw.grpc.generated.OrderRetailShopItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RetailShopServiceMethodDescriptorSupplier("orderRetailShopItem"))
              .build();
        }
      }
    }
    return getOrderRetailShopItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RetailShopServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RetailShopServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RetailShopServiceStub>() {
        @java.lang.Override
        public RetailShopServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RetailShopServiceStub(channel, callOptions);
        }
      };
    return RetailShopServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RetailShopServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RetailShopServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RetailShopServiceBlockingStub>() {
        @java.lang.Override
        public RetailShopServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RetailShopServiceBlockingStub(channel, callOptions);
        }
      };
    return RetailShopServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RetailShopServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RetailShopServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RetailShopServiceFutureStub>() {
        @java.lang.Override
        public RetailShopServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RetailShopServiceFutureStub(channel, callOptions);
        }
      };
    return RetailShopServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RetailShopServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Check inventory stock available
     * </pre>
     */
    public void checkRetailShopItemStock(ds.cw.grpc.generated.CheckRetailShopItemStockRequest request,
        io.grpc.stub.StreamObserver<ds.cw.grpc.generated.CheckRetailShopItemStockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckRetailShopItemStockMethod(), responseObserver);
    }

    /**
     * <pre>
     *Set inventory stock
     * </pre>
     */
    public void setRetailShopItemStock(ds.cw.grpc.generated.SetRetailShopItemStockRequest request,
        io.grpc.stub.StreamObserver<ds.cw.grpc.generated.SetRetailShopItemStockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRetailShopItemStockMethod(), responseObserver);
    }

    /**
     * <pre>
     *Order inventory item
     * </pre>
     */
    public void orderRetailShopItem(ds.cw.grpc.generated.OrderRetailShopItemRequest request,
        io.grpc.stub.StreamObserver<ds.cw.grpc.generated.OrderRetailShopItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderRetailShopItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckRetailShopItemStockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ds.cw.grpc.generated.CheckRetailShopItemStockRequest,
                ds.cw.grpc.generated.CheckRetailShopItemStockResponse>(
                  this, METHODID_CHECK_RETAIL_SHOP_ITEM_STOCK)))
          .addMethod(
            getSetRetailShopItemStockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ds.cw.grpc.generated.SetRetailShopItemStockRequest,
                ds.cw.grpc.generated.SetRetailShopItemStockResponse>(
                  this, METHODID_SET_RETAIL_SHOP_ITEM_STOCK)))
          .addMethod(
            getOrderRetailShopItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ds.cw.grpc.generated.OrderRetailShopItemRequest,
                ds.cw.grpc.generated.OrderRetailShopItemResponse>(
                  this, METHODID_ORDER_RETAIL_SHOP_ITEM)))
          .build();
    }
  }

  /**
   */
  public static final class RetailShopServiceStub extends io.grpc.stub.AbstractAsyncStub<RetailShopServiceStub> {
    private RetailShopServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RetailShopServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RetailShopServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Check inventory stock available
     * </pre>
     */
    public void checkRetailShopItemStock(ds.cw.grpc.generated.CheckRetailShopItemStockRequest request,
        io.grpc.stub.StreamObserver<ds.cw.grpc.generated.CheckRetailShopItemStockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckRetailShopItemStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Set inventory stock
     * </pre>
     */
    public void setRetailShopItemStock(ds.cw.grpc.generated.SetRetailShopItemStockRequest request,
        io.grpc.stub.StreamObserver<ds.cw.grpc.generated.SetRetailShopItemStockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRetailShopItemStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Order inventory item
     * </pre>
     */
    public void orderRetailShopItem(ds.cw.grpc.generated.OrderRetailShopItemRequest request,
        io.grpc.stub.StreamObserver<ds.cw.grpc.generated.OrderRetailShopItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderRetailShopItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RetailShopServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RetailShopServiceBlockingStub> {
    private RetailShopServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RetailShopServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RetailShopServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Check inventory stock available
     * </pre>
     */
    public ds.cw.grpc.generated.CheckRetailShopItemStockResponse checkRetailShopItemStock(ds.cw.grpc.generated.CheckRetailShopItemStockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckRetailShopItemStockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Set inventory stock
     * </pre>
     */
    public ds.cw.grpc.generated.SetRetailShopItemStockResponse setRetailShopItemStock(ds.cw.grpc.generated.SetRetailShopItemStockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRetailShopItemStockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Order inventory item
     * </pre>
     */
    public ds.cw.grpc.generated.OrderRetailShopItemResponse orderRetailShopItem(ds.cw.grpc.generated.OrderRetailShopItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderRetailShopItemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RetailShopServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RetailShopServiceFutureStub> {
    private RetailShopServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RetailShopServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RetailShopServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Check inventory stock available
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.cw.grpc.generated.CheckRetailShopItemStockResponse> checkRetailShopItemStock(
        ds.cw.grpc.generated.CheckRetailShopItemStockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckRetailShopItemStockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Set inventory stock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.cw.grpc.generated.SetRetailShopItemStockResponse> setRetailShopItemStock(
        ds.cw.grpc.generated.SetRetailShopItemStockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRetailShopItemStockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Order inventory item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.cw.grpc.generated.OrderRetailShopItemResponse> orderRetailShopItem(
        ds.cw.grpc.generated.OrderRetailShopItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderRetailShopItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_RETAIL_SHOP_ITEM_STOCK = 0;
  private static final int METHODID_SET_RETAIL_SHOP_ITEM_STOCK = 1;
  private static final int METHODID_ORDER_RETAIL_SHOP_ITEM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RetailShopServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RetailShopServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_RETAIL_SHOP_ITEM_STOCK:
          serviceImpl.checkRetailShopItemStock((ds.cw.grpc.generated.CheckRetailShopItemStockRequest) request,
              (io.grpc.stub.StreamObserver<ds.cw.grpc.generated.CheckRetailShopItemStockResponse>) responseObserver);
          break;
        case METHODID_SET_RETAIL_SHOP_ITEM_STOCK:
          serviceImpl.setRetailShopItemStock((ds.cw.grpc.generated.SetRetailShopItemStockRequest) request,
              (io.grpc.stub.StreamObserver<ds.cw.grpc.generated.SetRetailShopItemStockResponse>) responseObserver);
          break;
        case METHODID_ORDER_RETAIL_SHOP_ITEM:
          serviceImpl.orderRetailShopItem((ds.cw.grpc.generated.OrderRetailShopItemRequest) request,
              (io.grpc.stub.StreamObserver<ds.cw.grpc.generated.OrderRetailShopItemResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RetailShopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RetailShopServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.cw.grpc.generated.RetailShopServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RetailShopService");
    }
  }

  private static final class RetailShopServiceFileDescriptorSupplier
      extends RetailShopServiceBaseDescriptorSupplier {
    RetailShopServiceFileDescriptorSupplier() {}
  }

  private static final class RetailShopServiceMethodDescriptorSupplier
      extends RetailShopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RetailShopServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RetailShopServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RetailShopServiceFileDescriptorSupplier())
              .addMethod(getCheckRetailShopItemStockMethod())
              .addMethod(getSetRetailShopItemStockMethod())
              .addMethod(getOrderRetailShopItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
