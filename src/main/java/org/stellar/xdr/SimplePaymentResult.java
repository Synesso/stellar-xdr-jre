// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct SimplePaymentResult
//  {
//      AccountID destination;
//      Asset asset;
//      int64 amount;
//  };

//  ===========================================================================
public class SimplePaymentResult implements XdrElement {
  private AccountID destination;
  private Asset asset;
  private Int64 amount;

  public SimplePaymentResult() {
  }

  public static void encode(
      XdrDataOutputStream stream,
      SimplePaymentResult encodedSimplePaymentResult
  ) throws IOException {
    AccountID.encode(stream, encodedSimplePaymentResult.destination);
    Asset.encode(stream, encodedSimplePaymentResult.asset);
    Int64.encode(stream, encodedSimplePaymentResult.amount);
  }

  public static SimplePaymentResult decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static SimplePaymentResult decode(XdrDataInputStream stream) throws IOException {
    SimplePaymentResult decodedSimplePaymentResult = new SimplePaymentResult();
    decodedSimplePaymentResult.destination = AccountID.decode(stream);
    decodedSimplePaymentResult.asset = Asset.decode(stream);
    decodedSimplePaymentResult.amount = Int64.decode(stream);
    return decodedSimplePaymentResult;
  }

  public AccountID getDestination() {
    return this.destination;
  }

  public void setDestination(AccountID value) {
    this.destination = value;
  }

  public Asset getAsset() {
    return this.asset;
  }

  public void setAsset(Asset value) {
    this.asset = value;
  }

  public Int64 getAmount() {
    return this.amount;
  }

  public void setAmount(Int64 value) {
    this.amount = value;
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
    return Objects.hashCode(this.destination, this.asset, this.amount);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SimplePaymentResult)) {
      return false;
    }

    SimplePaymentResult other = (SimplePaymentResult) object;
    return Objects.equal(this.destination, other.destination) && Objects.equal(this.asset, other.asset) && Objects
        .equal(this.amount, other.amount);
  }

  public static final class Builder {
    private AccountID destination;
    private Asset asset;
    private Int64 amount;

    public Builder destination(AccountID destination) {
      this.destination = destination;
      return this;
    }

    public Builder asset(Asset asset) {
      this.asset = asset;
      return this;
    }

    public Builder amount(Int64 amount) {
      this.amount = amount;
      return this;
    }

    public SimplePaymentResult build() {
      SimplePaymentResult val = new SimplePaymentResult();
      val.setDestination(destination);
      val.setAsset(asset);
      val.setAmount(amount);
      return val;
    }
  }
}
