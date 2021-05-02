// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  union EndSponsoringFutureReservesResult switch (
//      EndSponsoringFutureReservesResultCode code)
//  {
//  case END_SPONSORING_FUTURE_RESERVES_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================
public class EndSponsoringFutureReservesResult implements XdrElement {
  EndSponsoringFutureReservesResultCode code;

  public EndSponsoringFutureReservesResult() {
  }

  public static void encode(
      XdrDataOutputStream stream,
      EndSponsoringFutureReservesResult encodedEndSponsoringFutureReservesResult
  ) throws IOException {
    //Xdrgen::AST::Identifier
    //EndSponsoringFutureReservesResultCode
    stream.writeInt(encodedEndSponsoringFutureReservesResult.getDiscriminant().getValue());
    switch (encodedEndSponsoringFutureReservesResult.getDiscriminant()) {
      case END_SPONSORING_FUTURE_RESERVES_SUCCESS:
        break;
      default:
        break;
    }
  }

  public static EndSponsoringFutureReservesResult decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static EndSponsoringFutureReservesResult decode(XdrDataInputStream stream) throws IOException {
    EndSponsoringFutureReservesResult decodedEndSponsoringFutureReservesResult =
        new EndSponsoringFutureReservesResult();
    EndSponsoringFutureReservesResultCode discriminant = EndSponsoringFutureReservesResultCode.decode(stream);
    decodedEndSponsoringFutureReservesResult.setDiscriminant(discriminant);
    switch (decodedEndSponsoringFutureReservesResult.getDiscriminant()) {
      case END_SPONSORING_FUTURE_RESERVES_SUCCESS:
        break;
      default:
        break;
    }
    return decodedEndSponsoringFutureReservesResult;
  }

  public EndSponsoringFutureReservesResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(EndSponsoringFutureReservesResultCode value) {
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
    if (!(object instanceof EndSponsoringFutureReservesResult)) {
      return false;
    }

    EndSponsoringFutureReservesResult other = (EndSponsoringFutureReservesResult) object;
    return Objects.equal(this.code, other.code);
  }

  public static final class Builder {
    private EndSponsoringFutureReservesResultCode discriminant;

    public Builder discriminant(EndSponsoringFutureReservesResultCode discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public EndSponsoringFutureReservesResult build() {
      EndSponsoringFutureReservesResult val = new EndSponsoringFutureReservesResult();
      val.setDiscriminant(discriminant);
      return val;
    }
  }
}
