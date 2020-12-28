// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct Auth
//  {
//      // Empty message, just to confirm
//      // establishment of MAC keys.
//      int unused;
//  };

//  ===========================================================================
public class Auth implements XdrElement {
  private Integer unused;

  public Auth() {
  }

  public static void encode(XdrDataOutputStream stream, Auth encodedAuth) throws IOException {
    stream.writeInt(encodedAuth.unused);
  }

  public static Auth decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static Auth decode(XdrDataInputStream stream) throws IOException {
    Auth decodedAuth = new Auth();
    decodedAuth.unused = stream.readInt();
    return decodedAuth;
  }

  public Integer getUnused() {
    return this.unused;
  }

  public void setUnused(Integer value) {
    this.unused = value;
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
    return Objects.hashCode(this.unused);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Auth)) {
      return false;
    }

    Auth other = (Auth) object;
    return Objects.equal(this.unused, other.unused);
  }

  public static final class Builder {
    private Integer unused;

    public Builder unused(Integer unused) {
      this.unused = unused;
      return this;
    }

    public Auth build() {
      Auth val = new Auth();
      val.setUnused(unused);
      return val;
    }
  }
}
