// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Arrays;

// === xdr source ============================================================

//  struct PathPaymentStrictReceiveOp
//  {
//      Asset sendAsset; // asset we pay with
//      int64 sendMax;   // the maximum amount of sendAsset to
//                       // send (excluding fees).
//                       // The operation will fail if can't be met
//  
//      MuxedAccount destination; // recipient of the payment
//      Asset destAsset;          // what they end up with
//      int64 destAmount;         // amount they end up with
//  
//      Asset path<5>; // additional hops it must go through to get there
//  };

//  ===========================================================================
public class PathPaymentStrictReceiveOp implements XdrElement {
  private Asset sendAsset;
  private Int64 sendMax;
  private MuxedAccount destination;
  private Asset destAsset;
  private Int64 destAmount;
  private Asset[] path;

  public PathPaymentStrictReceiveOp() {
  }

  public static void encode(XdrDataOutputStream stream, PathPaymentStrictReceiveOp encodedPathPaymentStrictReceiveOp)
      throws IOException {
    Asset.encode(stream, encodedPathPaymentStrictReceiveOp.sendAsset);
    Int64.encode(stream, encodedPathPaymentStrictReceiveOp.sendMax);
    MuxedAccount.encode(stream, encodedPathPaymentStrictReceiveOp.destination);
    Asset.encode(stream, encodedPathPaymentStrictReceiveOp.destAsset);
    Int64.encode(stream, encodedPathPaymentStrictReceiveOp.destAmount);
    int pathsize = encodedPathPaymentStrictReceiveOp.getPath().length;
    stream.writeInt(pathsize);
    for (int i = 0; i < pathsize; i++) {
      Asset.encode(stream, encodedPathPaymentStrictReceiveOp.path[i]);
    }
  }

  public static PathPaymentStrictReceiveOp decode(XdrDataInputStream stream) throws IOException {
    PathPaymentStrictReceiveOp decodedPathPaymentStrictReceiveOp = new PathPaymentStrictReceiveOp();
    decodedPathPaymentStrictReceiveOp.sendAsset = Asset.decode(stream);
    decodedPathPaymentStrictReceiveOp.sendMax = Int64.decode(stream);
    decodedPathPaymentStrictReceiveOp.destination = MuxedAccount.decode(stream);
    decodedPathPaymentStrictReceiveOp.destAsset = Asset.decode(stream);
    decodedPathPaymentStrictReceiveOp.destAmount = Int64.decode(stream);
    int pathsize = stream.readInt();
    decodedPathPaymentStrictReceiveOp.path = new Asset[pathsize];
    for (int i = 0; i < pathsize; i++) {
      decodedPathPaymentStrictReceiveOp.path[i] = Asset.decode(stream);
    }
    return decodedPathPaymentStrictReceiveOp;
  }

  public Asset getSendAsset() {
    return this.sendAsset;
  }

  public void setSendAsset(Asset value) {
    this.sendAsset = value;
  }

  public Int64 getSendMax() {
    return this.sendMax;
  }

  public void setSendMax(Int64 value) {
    this.sendMax = value;
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

  public Int64 getDestAmount() {
    return this.destAmount;
  }

  public void setDestAmount(Int64 value) {
    this.destAmount = value;
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

  @Override
  public int hashCode() {
    return Objects.hashCode(this.sendAsset, this.sendMax, this.destination, this.destAsset, this.destAmount,
        Arrays.hashCode(this.path));
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof PathPaymentStrictReceiveOp)) {
      return false;
    }

    PathPaymentStrictReceiveOp other = (PathPaymentStrictReceiveOp) object;
    return Objects.equal(this.sendAsset, other.sendAsset)
        && Objects.equal(this.sendMax, other.sendMax)
        && Objects.equal(this.destination, other.destination)
        && Objects.equal(this.destAsset, other.destAsset)
        && Objects.equal(this.destAmount, other.destAmount)
        && Arrays.equals(this.path, other.path);
  }
}