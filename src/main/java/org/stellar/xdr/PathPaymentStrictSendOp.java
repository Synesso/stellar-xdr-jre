// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

// === xdr source ============================================================

//  struct PathPaymentStrictSendOp
//  {
//      Asset sendAsset;  // asset we pay with
//      int64 sendAmount; // amount of sendAsset to send (excluding fees)
//
//      MuxedAccount destination; // recipient of the payment
//      Asset destAsset;          // what they end up with
//      int64 destMin;            // the minimum amount of dest asset to
//                                // be received
//                                // The operation will fail if it can't be met
//
//      Asset path<5>; // additional hops it must go through to get there
//  };

//  ===========================================================================
public class PathPaymentStrictSendOp implements XdrElement {
  private Asset sendAsset;
  private Int64 sendAmount;
  private MuxedAccount destination;
  private Asset destAsset;
  private Int64 destMin;
  private Asset[] path;

  public PathPaymentStrictSendOp() {
  }

  public static void encode(XdrDataOutputStream stream, PathPaymentStrictSendOp encodedPathPaymentStrictSendOp)
      throws IOException {
    Asset.encode(stream, encodedPathPaymentStrictSendOp.sendAsset);
    Int64.encode(stream, encodedPathPaymentStrictSendOp.sendAmount);
    MuxedAccount.encode(stream, encodedPathPaymentStrictSendOp.destination);
    Asset.encode(stream, encodedPathPaymentStrictSendOp.destAsset);
    Int64.encode(stream, encodedPathPaymentStrictSendOp.destMin);
    int pathsize = encodedPathPaymentStrictSendOp.getPath().length;
    stream.writeInt(pathsize);
    for (int i = 0; i < pathsize; i++) {
      Asset.encode(stream, encodedPathPaymentStrictSendOp.path[i]);
    }
  }

  public static PathPaymentStrictSendOp decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static PathPaymentStrictSendOp decode(XdrDataInputStream stream) throws IOException {
    PathPaymentStrictSendOp decodedPathPaymentStrictSendOp = new PathPaymentStrictSendOp();
    decodedPathPaymentStrictSendOp.sendAsset = Asset.decode(stream);
    decodedPathPaymentStrictSendOp.sendAmount = Int64.decode(stream);
    decodedPathPaymentStrictSendOp.destination = MuxedAccount.decode(stream);
    decodedPathPaymentStrictSendOp.destAsset = Asset.decode(stream);
    decodedPathPaymentStrictSendOp.destMin = Int64.decode(stream);
    int pathsize = stream.readInt();
    decodedPathPaymentStrictSendOp.path = new Asset[pathsize];
    for (int i = 0; i < pathsize; i++) {
      decodedPathPaymentStrictSendOp.path[i] = Asset.decode(stream);
    }
    return decodedPathPaymentStrictSendOp;
  }

  public Asset getSendAsset() {
    return this.sendAsset;
  }

  public void setSendAsset(Asset value) {
    this.sendAsset = value;
  }

  public Int64 getSendAmount() {
    return this.sendAmount;
  }

  public void setSendAmount(Int64 value) {
    this.sendAmount = value;
  }

  public MuxedAccount getDestination() {
    return this.destination;
  }

  public void setDestination(MuxedAccount value) {
    this.destination = value;
  }

  public Asset getDestAsset() {
    return this.destAsset;
  }

  public void setDestAsset(Asset value) {
    this.destAsset = value;
  }

  public Int64 getDestMin() {
    return this.destMin;
  }

  public void setDestMin(Int64 value) {
    this.destMin = value;
  }

  public Asset[] getPath() {
    return this.path;
  }

  public void setPath(Asset[] value) {
    this.path = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public ByteString encode() throws IOException {
    ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
    XdrDataOutputStream xdrOutputStream = new XdrDataOutputStream(byteStream);
    encode(xdrOutputStream);
    return new ByteString(byteStream.toByteArray());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.sendAsset, this.sendAmount, this.destination, this.destAsset, this.destMin,
        Arrays.hashCode(this.path));
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof PathPaymentStrictSendOp)) {
      return false;
    }

    PathPaymentStrictSendOp other = (PathPaymentStrictSendOp) object;
    return Objects.equal(this.sendAsset, other.sendAsset) && Objects.equal(this.sendAmount, other.sendAmount) && Objects
        .equal(this.destination, other.destination) && Objects.equal(this.destAsset, other.destAsset) && Objects.equal(
        this.destMin, other.destMin) && Arrays.equals(this.path, other.path);
  }
}
