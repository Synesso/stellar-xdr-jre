// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  typedef int int32;

//  ===========================================================================
public class Int32 implements XdrElement {
  private Integer int32;

  public static void encode(XdrDataOutputStream stream, Int32 encodedInt32) throws IOException {
    stream.writeInt(encodedInt32.int32);
  }

  public static Int32 decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static Int32 decode(XdrDataInputStream stream) throws IOException {
    Int32 decodedInt32 = new Int32();
    decodedInt32.int32 = stream.readInt();
    return decodedInt32;
  }

  public Integer getInt32() {
    return this.int32;
  }

  public void setInt32(Integer value) {
    this.int32 = value;
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
    return Objects.hashCode(this.int32);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Int32)) {
      return false;
    }

    Int32 other = (Int32) object;
    return Objects.equal(this.int32, other.int32);
  }
}
