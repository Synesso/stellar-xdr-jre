// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct BeginSponsoringFutureReservesOp
//  {
//      AccountID sponsoredID;
//  };

//  ===========================================================================
public class BeginSponsoringFutureReservesOp implements XdrElement {
  public BeginSponsoringFutureReservesOp() {
  }

  private AccountID sponsoredID;

  public AccountID getSponsoredID() {
    return this.sponsoredID;
  }

  public void setSponsoredID(AccountID value) {
    this.sponsoredID = value;
  }

  public static void encode(
      XdrDataOutputStream stream,
      BeginSponsoringFutureReservesOp encodedBeginSponsoringFutureReservesOp
  ) throws IOException {
    AccountID.encode(stream, encodedBeginSponsoringFutureReservesOp.sponsoredID);
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

  public static BeginSponsoringFutureReservesOp decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static BeginSponsoringFutureReservesOp decode(XdrDataInputStream stream) throws IOException {
    BeginSponsoringFutureReservesOp decodedBeginSponsoringFutureReservesOp = new BeginSponsoringFutureReservesOp();
    decodedBeginSponsoringFutureReservesOp.sponsoredID = AccountID.decode(stream);
    return decodedBeginSponsoringFutureReservesOp;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.sponsoredID);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof BeginSponsoringFutureReservesOp)) {
      return false;
    }

    BeginSponsoringFutureReservesOp other = (BeginSponsoringFutureReservesOp) object;
    return Objects.equal(this.sponsoredID, other.sponsoredID);
  }

  public static final class Builder {
    private AccountID sponsoredID;

    public Builder sponsoredID(AccountID sponsoredID) {
      this.sponsoredID = sponsoredID;
      return this;
    }

    public BeginSponsoringFutureReservesOp build() {
      BeginSponsoringFutureReservesOp val = new BeginSponsoringFutureReservesOp();
      val.setSponsoredID(sponsoredID);
      return val;
    }
  }
}
