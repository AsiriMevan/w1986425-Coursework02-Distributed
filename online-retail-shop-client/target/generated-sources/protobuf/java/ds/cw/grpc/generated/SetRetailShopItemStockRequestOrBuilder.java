// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RetailShopService.proto

package ds.cw.grpc.generated;

public interface SetRetailShopItemStockRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ds.cw.grpc.generated.SetRetailShopItemStockRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string lockName = 1;</code>
   * @return The lockName.
   */
  java.lang.String getLockName();
  /**
   * <code>string lockName = 1;</code>
   * @return The bytes for lockName.
   */
  com.google.protobuf.ByteString
      getLockNameBytes();

  /**
   * <code>int32 itemId = 2;</code>
   * @return The itemId.
   */
  int getItemId();

  /**
   * <code>int32 value = 3;</code>
   * @return The value.
   */
  int getValue();

  /**
   * <code>bool isSentByPrimary = 4;</code>
   * @return The isSentByPrimary.
   */
  boolean getIsSentByPrimary();
}
