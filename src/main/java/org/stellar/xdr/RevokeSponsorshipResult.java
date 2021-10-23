// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  union RevokeSponsorshipResult switch (RevokeSponsorshipResultCode code)
//  {
//  case REVOKE_SPONSORSHIP_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================
public class RevokeSponsorshipResult implements XdrElement {
  public RevokeSponsorshipResult() {
  }

  RevokeSponsorshipResultCode code;

  public RevokeSponsorshipResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(RevokeSponsorshipResultCode value) {
    this.code = value;
  }

  public static final class Builder {
    private RevokeSponsorshipResultCode discriminant;

    public Builder discriminant(RevokeSponsorshipResultCode discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public RevokeSponsorshipResult build() {
      RevokeSponsorshipResult val = new RevokeSponsorshipResult();
      val.setDiscriminant(discriminant);
      return val;
    }
  }

  public static void encode(
      XdrDataOutputStream stream,
      RevokeSponsorshipResult encodedRevokeSponsorshipResult
  ) throws IOException {
    //Xdrgen::AST::Identifier
    //RevokeSponsorshipResultCode
    stream.writeInt(encodedRevokeSponsorshipResult.getDiscriminant().getValue());
    switch (encodedRevokeSponsorshipResult.getDiscriminant()) {
      case REVOKE_SPONSORSHIP_SUCCESS:
        break;
      default:
        break;
    }
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

  public static RevokeSponsorshipResult decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static RevokeSponsorshipResult decode(XdrDataInputStream stream) throws IOException {
    RevokeSponsorshipResult decodedRevokeSponsorshipResult = new RevokeSponsorshipResult();
    RevokeSponsorshipResultCode discriminant = RevokeSponsorshipResultCode.decode(stream);
    decodedRevokeSponsorshipResult.setDiscriminant(discriminant);
    switch (decodedRevokeSponsorshipResult.getDiscriminant()) {
      case REVOKE_SPONSORSHIP_SUCCESS:
        break;
      default:
        break;
    }
    return decodedRevokeSponsorshipResult;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.code);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof RevokeSponsorshipResult)) {
      return false;
    }

    RevokeSponsorshipResult other = (RevokeSponsorshipResult) object;
    return Objects.equal(this.code, other.code);
  }
}
