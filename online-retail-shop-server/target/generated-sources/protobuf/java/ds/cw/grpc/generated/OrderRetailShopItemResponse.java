// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RetailShopService.proto

package ds.cw.grpc.generated;

/**
 * Protobuf type {@code ds.cw.grpc.generated.OrderRetailShopItemResponse}
 */
public final class OrderRetailShopItemResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ds.cw.grpc.generated.OrderRetailShopItemResponse)
    OrderRetailShopItemResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderRetailShopItemResponse.newBuilder() to construct.
  private OrderRetailShopItemResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderRetailShopItemResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderRetailShopItemResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderRetailShopItemResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            status_ = input.readBool();
            break;
          }
          case 16: {

            itemIdForOrder_ = input.readInt32();
            break;
          }
          case 24: {

            valueForOrder_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.cw.grpc.generated.RetailShopServiceOuterClass.internal_static_ds_cw_grpc_generated_OrderRetailShopItemResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.cw.grpc.generated.RetailShopServiceOuterClass.internal_static_ds_cw_grpc_generated_OrderRetailShopItemResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.cw.grpc.generated.OrderRetailShopItemResponse.class, ds.cw.grpc.generated.OrderRetailShopItemResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private boolean status_;
  /**
   * <code>bool status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public boolean getStatus() {
    return status_;
  }

  public static final int ITEMIDFORORDER_FIELD_NUMBER = 2;
  private int itemIdForOrder_;
  /**
   * <code>int32 itemIdForOrder = 2;</code>
   * @return The itemIdForOrder.
   */
  @java.lang.Override
  public int getItemIdForOrder() {
    return itemIdForOrder_;
  }

  public static final int VALUEFORORDER_FIELD_NUMBER = 3;
  private int valueForOrder_;
  /**
   * <code>int32 valueForOrder = 3;</code>
   * @return The valueForOrder.
   */
  @java.lang.Override
  public int getValueForOrder() {
    return valueForOrder_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != false) {
      output.writeBool(1, status_);
    }
    if (itemIdForOrder_ != 0) {
      output.writeInt32(2, itemIdForOrder_);
    }
    if (valueForOrder_ != 0) {
      output.writeInt32(3, valueForOrder_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, status_);
    }
    if (itemIdForOrder_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, itemIdForOrder_);
    }
    if (valueForOrder_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, valueForOrder_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.cw.grpc.generated.OrderRetailShopItemResponse)) {
      return super.equals(obj);
    }
    ds.cw.grpc.generated.OrderRetailShopItemResponse other = (ds.cw.grpc.generated.OrderRetailShopItemResponse) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (getItemIdForOrder()
        != other.getItemIdForOrder()) return false;
    if (getValueForOrder()
        != other.getValueForOrder()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStatus());
    hash = (37 * hash) + ITEMIDFORORDER_FIELD_NUMBER;
    hash = (53 * hash) + getItemIdForOrder();
    hash = (37 * hash) + VALUEFORORDER_FIELD_NUMBER;
    hash = (53 * hash) + getValueForOrder();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.cw.grpc.generated.OrderRetailShopItemResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.cw.grpc.generated.OrderRetailShopItemResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ds.cw.grpc.generated.OrderRetailShopItemResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ds.cw.grpc.generated.OrderRetailShopItemResponse)
      ds.cw.grpc.generated.OrderRetailShopItemResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.cw.grpc.generated.RetailShopServiceOuterClass.internal_static_ds_cw_grpc_generated_OrderRetailShopItemResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.cw.grpc.generated.RetailShopServiceOuterClass.internal_static_ds_cw_grpc_generated_OrderRetailShopItemResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.cw.grpc.generated.OrderRetailShopItemResponse.class, ds.cw.grpc.generated.OrderRetailShopItemResponse.Builder.class);
    }

    // Construct using ds.cw.grpc.generated.OrderRetailShopItemResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = false;

      itemIdForOrder_ = 0;

      valueForOrder_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.cw.grpc.generated.RetailShopServiceOuterClass.internal_static_ds_cw_grpc_generated_OrderRetailShopItemResponse_descriptor;
    }

    @java.lang.Override
    public ds.cw.grpc.generated.OrderRetailShopItemResponse getDefaultInstanceForType() {
      return ds.cw.grpc.generated.OrderRetailShopItemResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ds.cw.grpc.generated.OrderRetailShopItemResponse build() {
      ds.cw.grpc.generated.OrderRetailShopItemResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.cw.grpc.generated.OrderRetailShopItemResponse buildPartial() {
      ds.cw.grpc.generated.OrderRetailShopItemResponse result = new ds.cw.grpc.generated.OrderRetailShopItemResponse(this);
      result.status_ = status_;
      result.itemIdForOrder_ = itemIdForOrder_;
      result.valueForOrder_ = valueForOrder_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.cw.grpc.generated.OrderRetailShopItemResponse) {
        return mergeFrom((ds.cw.grpc.generated.OrderRetailShopItemResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.cw.grpc.generated.OrderRetailShopItemResponse other) {
      if (other == ds.cw.grpc.generated.OrderRetailShopItemResponse.getDefaultInstance()) return this;
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
      }
      if (other.getItemIdForOrder() != 0) {
        setItemIdForOrder(other.getItemIdForOrder());
      }
      if (other.getValueForOrder() != 0) {
        setValueForOrder(other.getValueForOrder());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.cw.grpc.generated.OrderRetailShopItemResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.cw.grpc.generated.OrderRetailShopItemResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean status_ ;
    /**
     * <code>bool status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public boolean getStatus() {
      return status_;
    }
    /**
     * <code>bool status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(boolean value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = false;
      onChanged();
      return this;
    }

    private int itemIdForOrder_ ;
    /**
     * <code>int32 itemIdForOrder = 2;</code>
     * @return The itemIdForOrder.
     */
    @java.lang.Override
    public int getItemIdForOrder() {
      return itemIdForOrder_;
    }
    /**
     * <code>int32 itemIdForOrder = 2;</code>
     * @param value The itemIdForOrder to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdForOrder(int value) {
      
      itemIdForOrder_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 itemIdForOrder = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemIdForOrder() {
      
      itemIdForOrder_ = 0;
      onChanged();
      return this;
    }

    private int valueForOrder_ ;
    /**
     * <code>int32 valueForOrder = 3;</code>
     * @return The valueForOrder.
     */
    @java.lang.Override
    public int getValueForOrder() {
      return valueForOrder_;
    }
    /**
     * <code>int32 valueForOrder = 3;</code>
     * @param value The valueForOrder to set.
     * @return This builder for chaining.
     */
    public Builder setValueForOrder(int value) {
      
      valueForOrder_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 valueForOrder = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValueForOrder() {
      
      valueForOrder_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ds.cw.grpc.generated.OrderRetailShopItemResponse)
  }

  // @@protoc_insertion_point(class_scope:ds.cw.grpc.generated.OrderRetailShopItemResponse)
  private static final ds.cw.grpc.generated.OrderRetailShopItemResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.cw.grpc.generated.OrderRetailShopItemResponse();
  }

  public static ds.cw.grpc.generated.OrderRetailShopItemResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderRetailShopItemResponse>
      PARSER = new com.google.protobuf.AbstractParser<OrderRetailShopItemResponse>() {
    @java.lang.Override
    public OrderRetailShopItemResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderRetailShopItemResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderRetailShopItemResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderRetailShopItemResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.cw.grpc.generated.OrderRetailShopItemResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

