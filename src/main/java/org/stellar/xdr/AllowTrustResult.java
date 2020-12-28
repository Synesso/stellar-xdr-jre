// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  union AllowTrustResult switch (AllowTrustResultCode code)
//  {
//  case ALLOW_TRUST_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================
public class AllowTrustResult implements XdrElement {
  AllowTrustResultCode code;

  public AllowTrustResult() {
  }

  public static void encode(XdrDataOutputStream stream, AllowTrustResult encodedAllowTrustResult) throws IOException {
    //Xdrgen::AST::Identifier
    //AllowTrustResultCode
    stream.writeInt(encodedAllowTrustResult.getDiscriminant().getValue());
    switch (encodedAllowTrustResult.getDiscriminant()) {
      case ALLOW_TRUST_SUCCESS:
        break;
      default:
        break;
    }
  }

  public static AllowTrustResult decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static AllowTrustResult decode(XdrDataInputStream stream) throws IOException {
    AllowTrustResult decodedAllowTrustResult = new AllowTrustResult();
    AllowTrustResultCode discriminant = AllowTrustResultCode.decode(stream);
    decodedAllowTrustResult.setDiscriminant(discriminant);
    switch (decodedAllowTrustResult.getDiscriminant()) {
      case ALLOW_TRUST_SUCCESS:
        break;
      default:
        break;
    }
    return decodedAllowTrustResult;
  }

  public AllowTrustResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(AllowTrustResultCode value) {
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
    if (!(object instanceof AllowTrustResult)) {
      return false;
    }

    AllowTrustResult other = (AllowTrustResult) object;
    return Objects.equal(this.code, other.code);
  }

  public static final class Builder {
    private AllowTrustResultCode discriminant;

    public Builder discriminant(AllowTrustResultCode discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public AllowTrustResult build() {
      AllowTrustResult val = new AllowTrustResult();
      val.setDiscriminant(discriminant);
      return val;
    }
  }
}
