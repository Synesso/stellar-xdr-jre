// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  struct SignedSurveyRequestMessage
//  {
//      Signature requestSignature;
//      SurveyRequestMessage request;
//  };

//  ===========================================================================
public class SignedSurveyRequestMessage implements XdrElement {
  private Signature requestSignature;
  private SurveyRequestMessage request;

  public SignedSurveyRequestMessage() {
  }

  public static void encode(XdrDataOutputStream stream, SignedSurveyRequestMessage encodedSignedSurveyRequestMessage)
      throws IOException {
    Signature.encode(stream, encodedSignedSurveyRequestMessage.requestSignature);
    SurveyRequestMessage.encode(stream, encodedSignedSurveyRequestMessage.request);
  }

  public static SignedSurveyRequestMessage decode(XdrDataInputStream stream) throws IOException {
    SignedSurveyRequestMessage decodedSignedSurveyRequestMessage = new SignedSurveyRequestMessage();
    decodedSignedSurveyRequestMessage.requestSignature = Signature.decode(stream);
    decodedSignedSurveyRequestMessage.request = SurveyRequestMessage.decode(stream);
    return decodedSignedSurveyRequestMessage;
  }

  public Signature getRequestSignature() {
    return this.requestSignature;
  }

  public void setRequestSignature(Signature value) {
    this.requestSignature = value;
  }

  public SurveyRequestMessage getRequest() {
    return this.request;
  }

  public void setRequest(SurveyRequestMessage value) {
    this.request = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.requestSignature, this.request);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof SignedSurveyRequestMessage)) {
      return false;
    }

    SignedSurveyRequestMessage other = (SignedSurveyRequestMessage) object;
    return Objects.equal(this.requestSignature, other.requestSignature) && Objects.equal(this.request, other.request);
  }
}
