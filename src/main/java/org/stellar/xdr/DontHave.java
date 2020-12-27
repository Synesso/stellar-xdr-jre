// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  struct DontHave
//  {
//      MessageType type;
//      uint256 reqHash;
//  };

//  ===========================================================================
public class DontHave implements XdrElement {
  private MessageType type;
  private Uint256 reqHash;

  public DontHave() {
  }

  public static void encode(XdrDataOutputStream stream, DontHave encodedDontHave) throws IOException {
    MessageType.encode(stream, encodedDontHave.type);
    Uint256.encode(stream, encodedDontHave.reqHash);
  }

  public static DontHave decode(XdrDataInputStream stream) throws IOException {
    DontHave decodedDontHave = new DontHave();
    decodedDontHave.type = MessageType.decode(stream);
    decodedDontHave.reqHash = Uint256.decode(stream);
    return decodedDontHave;
  }

  public MessageType getType() {
    return this.type;
  }

  public void setType(MessageType value) {
    this.type = value;
  }

  public Uint256 getReqHash() {
    return this.reqHash;
  }

  public void setReqHash(Uint256 value) {
    this.reqHash = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.type, this.reqHash);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof DontHave)) {
      return false;
    }

    DontHave other = (DontHave) object;
    return Objects.equal(this.type, other.type) && Objects.equal(this.reqHash, other.reqHash);
  }
}
