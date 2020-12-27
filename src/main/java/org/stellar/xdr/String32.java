// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  typedef string string32<32>;

//  ===========================================================================
public class String32 implements XdrElement {
  private XdrString string32;

  public static void encode(XdrDataOutputStream stream, String32 encodedString32) throws IOException {
    encodedString32.string32.encode(stream);
  }

  public static String32 decode(XdrDataInputStream stream) throws IOException {
    String32 decodedString32 = new String32();
    decodedString32.string32 = XdrString.decode(stream, 32);
    return decodedString32;
  }

  public XdrString getString32() {
    return this.string32;
  }

  public void setString32(XdrString value) {
    this.string32 = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.string32);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof String32)) {
      return false;
    }

    String32 other = (String32) object;
    return Objects.equal(this.string32, other.string32);
  }
}
