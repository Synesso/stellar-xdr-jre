// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  union ManageBuyOfferResult switch (ManageBuyOfferResultCode code)
//  {
//  case MANAGE_BUY_OFFER_SUCCESS:
//      ManageOfferSuccessResult success;
//  default:
//      void;
//  };

//  ===========================================================================
public class ManageBuyOfferResult implements XdrElement {
  ManageBuyOfferResultCode code;
  private ManageOfferSuccessResult success;

  public ManageBuyOfferResult() {
  }

  public static void encode(XdrDataOutputStream stream, ManageBuyOfferResult encodedManageBuyOfferResult)
      throws IOException {
    //Xdrgen::AST::Identifier
    //ManageBuyOfferResultCode
    stream.writeInt(encodedManageBuyOfferResult.getDiscriminant().getValue());
    switch (encodedManageBuyOfferResult.getDiscriminant()) {
      case MANAGE_BUY_OFFER_SUCCESS:
        ManageOfferSuccessResult.encode(stream, encodedManageBuyOfferResult.success);
        break;
      default:
        break;
    }
  }

  public static ManageBuyOfferResult decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static ManageBuyOfferResult decode(XdrDataInputStream stream) throws IOException {
    ManageBuyOfferResult decodedManageBuyOfferResult = new ManageBuyOfferResult();
    ManageBuyOfferResultCode discriminant = ManageBuyOfferResultCode.decode(stream);
    decodedManageBuyOfferResult.setDiscriminant(discriminant);
    switch (decodedManageBuyOfferResult.getDiscriminant()) {
      case MANAGE_BUY_OFFER_SUCCESS:
        decodedManageBuyOfferResult.success = ManageOfferSuccessResult.decode(stream);
        break;
      default:
        break;
    }
    return decodedManageBuyOfferResult;
  }

  public ManageBuyOfferResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(ManageBuyOfferResultCode value) {
    this.code = value;
  }

  public ManageOfferSuccessResult getSuccess() {
    return this.success;
  }

  public void setSuccess(ManageOfferSuccessResult value) {
    this.success = value;
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
    return Objects.hashCode(this.success, this.code);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof ManageBuyOfferResult)) {
      return false;
    }

    ManageBuyOfferResult other = (ManageBuyOfferResult) object;
    return Objects.equal(this.success, other.success) && Objects.equal(this.code, other.code);
  }
}
