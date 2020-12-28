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

//  union PathPaymentStrictReceiveResult switch (
//      PathPaymentStrictReceiveResultCode code)
//  {
//  case PATH_PAYMENT_STRICT_RECEIVE_SUCCESS:
//      struct
//      {
//          ClaimOfferAtom offers<>;
//          SimplePaymentResult last;
//      } success;
//  case PATH_PAYMENT_STRICT_RECEIVE_NO_ISSUER:
//      Asset noIssuer; // the asset that caused the error
//  default:
//      void;
//  };

//  ===========================================================================
public class PathPaymentStrictReceiveResult implements XdrElement {
  PathPaymentStrictReceiveResultCode code;
  private PathPaymentStrictReceiveResultSuccess success;
  private Asset noIssuer;

  public PathPaymentStrictReceiveResult() {
  }

  public static void encode(XdrDataOutputStream stream,
      PathPaymentStrictReceiveResult encodedPathPaymentStrictReceiveResult) throws IOException {
    //Xdrgen::AST::Identifier
    //PathPaymentStrictReceiveResultCode
    stream.writeInt(encodedPathPaymentStrictReceiveResult.getDiscriminant().getValue());
    switch (encodedPathPaymentStrictReceiveResult.getDiscriminant()) {
      case PATH_PAYMENT_STRICT_RECEIVE_SUCCESS:
        PathPaymentStrictReceiveResultSuccess.encode(stream, encodedPathPaymentStrictReceiveResult.success);
        break;
      case PATH_PAYMENT_STRICT_RECEIVE_NO_ISSUER:
        Asset.encode(stream, encodedPathPaymentStrictReceiveResult.noIssuer);
        break;
      default:
        break;
    }
  }

  public static PathPaymentStrictReceiveResult decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static PathPaymentStrictReceiveResult decode(XdrDataInputStream stream) throws IOException {
    PathPaymentStrictReceiveResult decodedPathPaymentStrictReceiveResult = new PathPaymentStrictReceiveResult();
    PathPaymentStrictReceiveResultCode discriminant = PathPaymentStrictReceiveResultCode.decode(stream);
    decodedPathPaymentStrictReceiveResult.setDiscriminant(discriminant);
    switch (decodedPathPaymentStrictReceiveResult.getDiscriminant()) {
      case PATH_PAYMENT_STRICT_RECEIVE_SUCCESS:
        decodedPathPaymentStrictReceiveResult.success = PathPaymentStrictReceiveResultSuccess.decode(stream);
        break;
      case PATH_PAYMENT_STRICT_RECEIVE_NO_ISSUER:
        decodedPathPaymentStrictReceiveResult.noIssuer = Asset.decode(stream);
        break;
      default:
        break;
    }
    return decodedPathPaymentStrictReceiveResult;
  }

  public PathPaymentStrictReceiveResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(PathPaymentStrictReceiveResultCode value) {
    this.code = value;
  }

  public PathPaymentStrictReceiveResultSuccess getSuccess() {
    return this.success;
  }

  public void setSuccess(PathPaymentStrictReceiveResultSuccess value) {
    this.success = value;
  }

  public Asset getNoIssuer() {
    return this.noIssuer;
  }

  public void setNoIssuer(Asset value) {
    this.noIssuer = value;
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
    return Objects.hashCode(this.success, this.noIssuer, this.code);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof PathPaymentStrictReceiveResult)) {
      return false;
    }

    PathPaymentStrictReceiveResult other = (PathPaymentStrictReceiveResult) object;
    return Objects.equal(this.success, other.success) && Objects.equal(this.noIssuer, other.noIssuer) && Objects.equal(
        this.code, other.code);
  }

  public static class PathPaymentStrictReceiveResultSuccess {
    private ClaimOfferAtom[] offers;
    private SimplePaymentResult last;

    public PathPaymentStrictReceiveResultSuccess() {
    }

    public static void encode(XdrDataOutputStream stream,
        PathPaymentStrictReceiveResultSuccess encodedPathPaymentStrictReceiveResultSuccess) throws IOException {
      int offerssize = encodedPathPaymentStrictReceiveResultSuccess.getOffers().length;
      stream.writeInt(offerssize);
      for (int i = 0; i < offerssize; i++) {
        ClaimOfferAtom.encode(stream, encodedPathPaymentStrictReceiveResultSuccess.offers[i]);
      }
      SimplePaymentResult.encode(stream, encodedPathPaymentStrictReceiveResultSuccess.last);
    }

    public static PathPaymentStrictReceiveResultSuccess decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static PathPaymentStrictReceiveResultSuccess decode(XdrDataInputStream stream) throws IOException {
      PathPaymentStrictReceiveResultSuccess decodedPathPaymentStrictReceiveResultSuccess =
          new PathPaymentStrictReceiveResultSuccess();
      int offerssize = stream.readInt();
      decodedPathPaymentStrictReceiveResultSuccess.offers = new ClaimOfferAtom[offerssize];
      for (int i = 0; i < offerssize; i++) {
        decodedPathPaymentStrictReceiveResultSuccess.offers[i] = ClaimOfferAtom.decode(stream);
      }
      decodedPathPaymentStrictReceiveResultSuccess.last = SimplePaymentResult.decode(stream);
      return decodedPathPaymentStrictReceiveResultSuccess;
    }

    public ClaimOfferAtom[] getOffers() {
      return this.offers;
    }

    public void setOffers(ClaimOfferAtom[] value) {
      this.offers = value;
    }

    public SimplePaymentResult getLast() {
      return this.last;
    }

    public void setLast(SimplePaymentResult value) {
      this.last = value;
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
      return Objects.hashCode(Arrays.hashCode(this.offers), this.last);
    }

    @Override
    public boolean equals(Object object) {
      if (object == null || !(object instanceof PathPaymentStrictReceiveResultSuccess)) {
        return false;
      }

      PathPaymentStrictReceiveResultSuccess other = (PathPaymentStrictReceiveResultSuccess) object;
      return Arrays.equals(this.offers, other.offers) && Objects.equal(this.last, other.last);
    }
  }
}
