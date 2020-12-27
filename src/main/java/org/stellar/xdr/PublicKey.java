// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  union PublicKey switch (PublicKeyType type)
//  {
//  case PUBLIC_KEY_TYPE_ED25519:
//      uint256 ed25519;
//  };

//  ===========================================================================
public class PublicKey implements XdrElement {
  PublicKeyType type;
  private Uint256 ed25519;

  public PublicKey() {
  }

  public static void encode(XdrDataOutputStream stream, PublicKey encodedPublicKey) throws IOException {
    //Xdrgen::AST::Identifier
    //PublicKeyType
    stream.writeInt(encodedPublicKey.getDiscriminant().getValue());
    switch (encodedPublicKey.getDiscriminant()) {
      case PUBLIC_KEY_TYPE_ED25519:
        Uint256.encode(stream, encodedPublicKey.ed25519);
        break;
    }
  }

  public static PublicKey decode(XdrDataInputStream stream) throws IOException {
    PublicKey decodedPublicKey = new PublicKey();
    PublicKeyType discriminant = PublicKeyType.decode(stream);
    decodedPublicKey.setDiscriminant(discriminant);
    switch (decodedPublicKey.getDiscriminant()) {
      case PUBLIC_KEY_TYPE_ED25519:
        decodedPublicKey.ed25519 = Uint256.decode(stream);
        break;
    }
    return decodedPublicKey;
  }

  public PublicKeyType getDiscriminant() {
    return this.type;
  }

  public void setDiscriminant(PublicKeyType value) {
    this.type = value;
  }

  public Uint256 getEd25519() {
    return this.ed25519;
  }

  public void setEd25519(Uint256 value) {
    this.ed25519 = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.ed25519, this.type);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof PublicKey)) {
      return false;
    }

    PublicKey other = (PublicKey) object;
    return Objects.equal(this.ed25519, other.ed25519) && Objects.equal(this.type, other.type);
  }
}