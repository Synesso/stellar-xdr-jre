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

//  union PathPaymentStrictSendResult switch (PathPaymentStrictSendResultCode code)
//  {
//  case PATH_PAYMENT_STRICT_SEND_SUCCESS:
//      struct
//      {
//          ClaimOfferAtom offers<>;
//          SimplePaymentResult last;
//      } success;
//  case PATH_PAYMENT_STRICT_SEND_NO_ISSUER:
//      Asset noIssuer; // the asset that caused the error
//  default:
//      void;
//  };

//  ===========================================================================
public class PathPaymentStrictSendResult implements XdrElement {
  PathPaymentStrictSendResultCode code;
  private PathPaymentStrictSendResultSuccess success;
  private Asset noIssuer;

  public PathPaymentStrictSendResult() {
  }

  public static void encode(XdrDataOutputStream stream, PathPaymentStrictSendResult encodedPathPaymentStrictSendResult)
      throws IOException {
    //Xdrgen::AST::Identifier
    //PathPaymentStrictSendResultCode
    stream.writeInt(encodedPathPaymentStrictSendResult.getDiscriminant().getValue());
    switch (encodedPathPaymentStrictSendResult.getDiscriminant()) {
      case PATH_PAYMENT_STRICT_SEND_SUCCESS:
        PathPaymentStrictSendResultSuccess.encode(stream, encodedPathPaymentStrictSendResult.success);
        break;
      case PATH_PAYMENT_STRICT_SEND_NO_ISSUER:
        Asset.encode(stream, encodedPathPaymentStrictSendResult.noIssuer);
        break;
      default:
        break;
    }
  }

  public static PathPaymentStrictSendResult decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static PathPaymentStrictSendResult decode(XdrDataInputStream stream) throws IOException {
    PathPaymentStrictSendResult decodedPathPaymentStrictSendResult = new PathPaymentStrictSendResult();
    PathPaymentStrictSendResultCode discriminant = PathPaymentStrictSendResultCode.decode(stream);
    decodedPathPaymentStrictSendResult.setDiscriminant(discriminant);
    switch (decodedPathPaymentStrictSendResult.getDiscriminant()) {
      case PATH_PAYMENT_STRICT_SEND_SUCCESS:
        decodedPathPaymentStrictSendResult.success = PathPaymentStrictSendResultSuccess.decode(stream);
        break;
      case PATH_PAYMENT_STRICT_SEND_NO_ISSUER:
        decodedPathPaymentStrictSendResult.noIssuer = Asset.decode(stream);
        break;
      default:
        break;
    }
    return decodedPathPaymentStrictSendResult;
  }

  public PathPaymentStrictSendResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(PathPaymentStrictSendResultCode value) {
    this.code = value;
  }

  public PathPaymentStrictSendResultSuccess getSuccess() {
    return this.success;
  }

  public void setSuccess(PathPaymentStrictSendResultSuccess value) {
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
    if (!(object instanceof PathPaymentStrictSendResult)) {
      return false;
    }

    PathPaymentStrictSendResult other = (PathPaymentStrictSendResult) object;
    return Objects.equal(this.success, other.success) && Objects.equal(this.noIssuer, other.noIssuer) && Objects.equal(
        this.code, other.code);
  }

  public static final class Builder {
    private PathPaymentStrictSendResultCode discriminant;
    private PathPaymentStrictSendResultSuccess success;
    private Asset noIssuer;

    public Builder discriminant(PathPaymentStrictSendResultCode discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public Builder success(PathPaymentStrictSendResultSuccess success) {
      this.success = success;
      return this;
    }

    public Builder noIssuer(Asset noIssuer) {
      this.noIssuer = noIssuer;
      return this;
    }

    public PathPaymentStrictSendResult build() {
      PathPaymentStrictSendResult val = new PathPaymentStrictSendResult();
      val.setDiscriminant(discriminant);
      val.setSuccess(success);
      val.setNoIssuer(noIssuer);
      return val;
    }
  }

  public static class PathPaymentStrictSendResultSuccess {
    private ClaimOfferAtom[] offers;
    private SimplePaymentResult last;

    public PathPaymentStrictSendResultSuccess() {
    }

    public static void encode(XdrDataOutputStream stream,
        PathPaymentStrictSendResultSuccess encodedPathPaymentStrictSendResultSuccess) throws IOException {
      int offerssize = encodedPathPaymentStrictSendResultSuccess.getOffers().length;
      stream.writeInt(offerssize);
      for (int i = 0; i < offerssize; i++) {
        ClaimOfferAtom.encode(stream, encodedPathPaymentStrictSendResultSuccess.offers[i]);
      }
      SimplePaymentResult.encode(stream, encodedPathPaymentStrictSendResultSuccess.last);
    }

    public static PathPaymentStrictSendResultSuccess decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static PathPaymentStrictSendResultSuccess decode(XdrDataInputStream stream) throws IOException {
      PathPaymentStrictSendResultSuccess decodedPathPaymentStrictSendResultSuccess =
          new PathPaymentStrictSendResultSuccess();
      int offerssize = stream.readInt();
      decodedPathPaymentStrictSendResultSuccess.offers = new ClaimOfferAtom[offerssize];
      for (int i = 0; i < offerssize; i++) {
        decodedPathPaymentStrictSendResultSuccess.offers[i] = ClaimOfferAtom.decode(stream);
      }
      decodedPathPaymentStrictSendResultSuccess.last = SimplePaymentResult.decode(stream);
      return decodedPathPaymentStrictSendResultSuccess;
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
      if (!(object instanceof PathPaymentStrictSendResultSuccess)) {
        return false;
      }

      PathPaymentStrictSendResultSuccess other = (PathPaymentStrictSendResultSuccess) object;
      return Arrays.equals(this.offers, other.offers) && Objects.equal(this.last, other.last);
    }

    public static final class Builder {
      private ClaimOfferAtom[] offers;
      private SimplePaymentResult last;

      public Builder offers(ClaimOfferAtom[] offers) {
        this.offers = offers;
        return this;
      }

      public Builder last(SimplePaymentResult last) {
        this.last = last;
        return this;
      }

      public PathPaymentStrictSendResultSuccess build() {
        PathPaymentStrictSendResultSuccess val = new PathPaymentStrictSendResultSuccess();
        val.setOffers(offers);
        val.setLast(last);
        return val;
      }
    }
  }
}
