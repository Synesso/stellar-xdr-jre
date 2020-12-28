// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  typedef string string64<64>;

//  ===========================================================================
public class String64 implements XdrElement {
  private XdrString string64;

  public static void encode(XdrDataOutputStream stream, String64 encodedString64) throws IOException {
    encodedString64.string64.encode(stream);
  }

  public static String64 decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static String64 decode(XdrDataInputStream stream) throws IOException {
    String64 decodedString64 = new String64();
    decodedString64.string64 = XdrString.decode(stream, 64);
    return decodedString64;
  }

  public XdrString getString64() {
    return this.string64;
  }

  public void setString64(XdrString value) {
    this.string64 = value;
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
    return Objects.hashCode(this.string64);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof String64)) {
      return false;
    }

    String64 other = (String64) object;
    return Objects.equal(this.string64, other.string64);
  }
}
