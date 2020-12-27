// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  union SetOptionsResult switch (SetOptionsResultCode code)
//  {
//  case SET_OPTIONS_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================
public class SetOptionsResult implements XdrElement {
  SetOptionsResultCode code;

  public SetOptionsResult() {
  }

  public static void encode(XdrDataOutputStream stream, SetOptionsResult encodedSetOptionsResult) throws IOException {
    //Xdrgen::AST::Identifier
    //SetOptionsResultCode
    stream.writeInt(encodedSetOptionsResult.getDiscriminant().getValue());
    switch (encodedSetOptionsResult.getDiscriminant()) {
      case SET_OPTIONS_SUCCESS:
        break;
      default:
        break;
    }
  }

  public static SetOptionsResult decode(XdrDataInputStream stream) throws IOException {
    SetOptionsResult decodedSetOptionsResult = new SetOptionsResult();
    SetOptionsResultCode discriminant = SetOptionsResultCode.decode(stream);
    decodedSetOptionsResult.setDiscriminant(discriminant);
    switch (decodedSetOptionsResult.getDiscriminant()) {
      case SET_OPTIONS_SUCCESS:
        break;
      default:
        break;
    }
    return decodedSetOptionsResult;
  }

  public SetOptionsResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(SetOptionsResultCode value) {
    this.code = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.code);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof SetOptionsResult)) {
      return false;
    }

    SetOptionsResult other = (SetOptionsResult) object;
    return Objects.equal(this.code, other.code);
  }
}
