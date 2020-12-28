// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  union BeginSponsoringFutureReservesResult switch (BeginSponsoringFutureReservesResultCode code)
//  {
//  case BEGIN_SPONSORING_FUTURE_RESERVES_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================
public class BeginSponsoringFutureReservesResult implements XdrElement {
  BeginSponsoringFutureReservesResultCode code;

  public BeginSponsoringFutureReservesResult() {
  }

  public static void encode(XdrDataOutputStream stream,
      BeginSponsoringFutureReservesResult encodedBeginSponsoringFutureReservesResult) throws IOException {
    //Xdrgen::AST::Identifier
    //BeginSponsoringFutureReservesResultCode
    stream.writeInt(encodedBeginSponsoringFutureReservesResult.getDiscriminant().getValue());
    switch (encodedBeginSponsoringFutureReservesResult.getDiscriminant()) {
      case BEGIN_SPONSORING_FUTURE_RESERVES_SUCCESS:
        break;
      default:
        break;
    }
  }

  public static BeginSponsoringFutureReservesResult decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static BeginSponsoringFutureReservesResult decode(XdrDataInputStream stream) throws IOException {
    BeginSponsoringFutureReservesResult decodedBeginSponsoringFutureReservesResult =
        new BeginSponsoringFutureReservesResult();
    BeginSponsoringFutureReservesResultCode discriminant = BeginSponsoringFutureReservesResultCode.decode(stream);
    decodedBeginSponsoringFutureReservesResult.setDiscriminant(discriminant);
    switch (decodedBeginSponsoringFutureReservesResult.getDiscriminant()) {
      case BEGIN_SPONSORING_FUTURE_RESERVES_SUCCESS:
        break;
      default:
        break;
    }
    return decodedBeginSponsoringFutureReservesResult;
  }

  public BeginSponsoringFutureReservesResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(BeginSponsoringFutureReservesResultCode value) {
    this.code = value;
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
    return Objects.hashCode(this.code);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof BeginSponsoringFutureReservesResult)) {
      return false;
    }

    BeginSponsoringFutureReservesResult other = (BeginSponsoringFutureReservesResult) object;
    return Objects.equal(this.code, other.code);
  }
}
