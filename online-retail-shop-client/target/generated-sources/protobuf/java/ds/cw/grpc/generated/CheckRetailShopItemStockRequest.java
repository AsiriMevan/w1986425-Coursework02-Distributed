// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RetailShopService.proto

package ds.cw.grpc.generated;

/**
 * Protobuf type {@code ds.cw.grpc.generated.CheckRetailShopItemStockRequest}
 */
public final class CheckRetailShopItemStockRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ds.cw.grpc.generated.CheckRetailShopItemStockRequest)
    CheckRetailShopItemStockRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckRetailShopItemStockRequest.newBuilder() to construct.
  private CheckRetailShopItemStockRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckRetailShopItemStockRequest() {
    lockName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckRetailShopItemStockRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckRetailShopItemStockRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            lockName_ = s;
            break;
          }
          case 16: {

            itemId_ = input.readInt32();
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
    return ds.cw.grpc.generated.RetailShopServiceOuterClass.internal_static_ds_cw_grpc_generated_CheckRetailShopItemStockRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.cw.grpc.generated.RetailShopServiceOuterClass.internal_static_ds_cw_grpc_generated_CheckRetailShopItemStockRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.cw.grpc.generated.CheckRetailShopItemStockRequest.class, ds.cw.grpc.generated.CheckRetailShopItemStockRequest.Builder.class);
  }

  public static final int LOCKNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object lockName_;
  /**
   * <code>string lockName = 1;</code>
   * @return The lockName.
   */
  @java.lang.Override
  public java.lang.String getLockName() {
    java.lang.Object ref = lockName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lockName_ = s;
      return s;
    }
  }
  /**
   * <code>string lockName = 1;</code>
   * @return The bytes for lockName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLockNameBytes() {
    java.lang.Object ref = lockName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lockName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEMID_FIELD_NUMBER = 2;
  private int itemId_;
  /**
   * <code>int32 itemId = 2;</code>
   * @return The itemId.
   */
  @java.lang.Override
  public int getItemId() {
    return itemId_;
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
    if (!getLockNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lockName_);
    }
    if (itemId_ != 0) {
      output.writeInt32(2, itemId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLockNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lockName_);
    }
    if (itemId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, itemId_);
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
    if (!(obj instanceof ds.cw.grpc.generated.CheckRetailShopItemStockRequest)) {
      return super.equals(obj);
    }
    ds.cw.grpc.generated.CheckRetailShopItemStockRequest other = (ds.cw.grpc.generated.CheckRetailShopItemStockRequest) obj;

    if (!getLockName()
        .equals(other.getLockName())) return false;
    if (getItemId()
        != other.getItemId()) return false;
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
    hash = (37 * hash) + LOCKNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLockName().hashCode();
    hash = (37 * hash) + ITEMID_FIELD_NUMBER;
    hash = (53 * hash) + getItemId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest parseFrom(
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
  public static Builder newBuilder(ds.cw.grpc.generated.CheckRetailShopItemStockRequest prototype) {
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
   * Protobuf type {@code ds.cw.grpc.generated.CheckRetailShopItemStockRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ds.cw.grpc.generated.CheckRetailShopItemStockRequest)
      ds.cw.grpc.generated.CheckRetailShopItemStockRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.cw.grpc.generated.RetailShopServiceOuterClass.internal_static_ds_cw_grpc_generated_CheckRetailShopItemStockRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.cw.grpc.generated.RetailShopServiceOuterClass.internal_static_ds_cw_grpc_generated_CheckRetailShopItemStockRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.cw.grpc.generated.CheckRetailShopItemStockRequest.class, ds.cw.grpc.generated.CheckRetailShopItemStockRequest.Builder.class);
    }

    // Construct using ds.cw.grpc.generated.CheckRetailShopItemStockRequest.newBuilder()
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
      lockName_ = "";

      itemId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.cw.grpc.generated.RetailShopServiceOuterClass.internal_static_ds_cw_grpc_generated_CheckRetailShopItemStockRequest_descriptor;
    }

    @java.lang.Override
    public ds.cw.grpc.generated.CheckRetailShopItemStockRequest getDefaultInstanceForType() {
      return ds.cw.grpc.generated.CheckRetailShopItemStockRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ds.cw.grpc.generated.CheckRetailShopItemStockRequest build() {
      ds.cw.grpc.generated.CheckRetailShopItemStockRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.cw.grpc.generated.CheckRetailShopItemStockRequest buildPartial() {
      ds.cw.grpc.generated.CheckRetailShopItemStockRequest result = new ds.cw.grpc.generated.CheckRetailShopItemStockRequest(this);
      result.lockName_ = lockName_;
      result.itemId_ = itemId_;
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
      if (other instanceof ds.cw.grpc.generated.CheckRetailShopItemStockRequest) {
        return mergeFrom((ds.cw.grpc.generated.CheckRetailShopItemStockRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.cw.grpc.generated.CheckRetailShopItemStockRequest other) {
      if (other == ds.cw.grpc.generated.CheckRetailShopItemStockRequest.getDefaultInstance()) return this;
      if (!other.getLockName().isEmpty()) {
        lockName_ = other.lockName_;
        onChanged();
      }
      if (other.getItemId() != 0) {
        setItemId(other.getItemId());
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
      ds.cw.grpc.generated.CheckRetailShopItemStockRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.cw.grpc.generated.CheckRetailShopItemStockRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object lockName_ = "";
    /**
     * <code>string lockName = 1;</code>
     * @return The lockName.
     */
    public java.lang.String getLockName() {
      java.lang.Object ref = lockName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lockName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lockName = 1;</code>
     * @return The bytes for lockName.
     */
    public com.google.protobuf.ByteString
        getLockNameBytes() {
      java.lang.Object ref = lockName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lockName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lockName = 1;</code>
     * @param value The lockName to set.
     * @return This builder for chaining.
     */
    public Builder setLockName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lockName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lockName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLockName() {
      
      lockName_ = getDefaultInstance().getLockName();
      onChanged();
      return this;
    }
    /**
     * <code>string lockName = 1;</code>
     * @param value The bytes for lockName to set.
     * @return This builder for chaining.
     */
    public Builder setLockNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lockName_ = value;
      onChanged();
      return this;
    }

    private int itemId_ ;
    /**
     * <code>int32 itemId = 2;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }
    /**
     * <code>int32 itemId = 2;</code>
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(int value) {
      
      itemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 itemId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      
      itemId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ds.cw.grpc.generated.CheckRetailShopItemStockRequest)
  }

  // @@protoc_insertion_point(class_scope:ds.cw.grpc.generated.CheckRetailShopItemStockRequest)
  private static final ds.cw.grpc.generated.CheckRetailShopItemStockRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.cw.grpc.generated.CheckRetailShopItemStockRequest();
  }

  public static ds.cw.grpc.generated.CheckRetailShopItemStockRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckRetailShopItemStockRequest>
      PARSER = new com.google.protobuf.AbstractParser<CheckRetailShopItemStockRequest>() {
    @java.lang.Override
    public CheckRetailShopItemStockRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckRetailShopItemStockRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckRetailShopItemStockRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckRetailShopItemStockRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.cw.grpc.generated.CheckRetailShopItemStockRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

