// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  typedef unsigned int uint32;

//  ===========================================================================
public class Uint32 implements XdrElement {
  private Integer uint32;

  public static void encode(XdrDataOutputStream stream, Uint32 encodedUint32) throws IOException {
    stream.writeInt(encodedUint32.uint32);
  }

  public static Uint32 decode(XdrDataInputStream stream) throws IOException {
    Uint32 decodedUint32 = new Uint32();
    decodedUint32.uint32 = stream.readInt();
    return decodedUint32;
  }

  public Integer getUint32() {
    return this.uint32;
  }

  public void setUint32(Integer value) {
    this.uint32 = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.uint32);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof Uint32)) {
      return false;
    }

    Uint32 other = (Uint32) object;
    return Objects.equal(this.uint32, other.uint32);
  }
}
