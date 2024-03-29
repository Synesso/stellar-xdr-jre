// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct AuthCert
//  {
//      Curve25519Public pubkey;
//      uint64 expiration;
//      Signature sig;
//  };

//  ===========================================================================
public class AuthCert implements XdrElement {
  public AuthCert() {
  }
  private Curve25519Public pubkey;
  public Curve25519Public getPubkey() {
    return this.pubkey;
  }
  public void setPubkey(Curve25519Public value) {
    this.pubkey = value;
  }

  private Uint64 expiration;
  public Uint64 getExpiration() {
    return this.expiration;
  }

  public void setExpiration(Uint64 value) {
    this.expiration = value;
  }

  private Signature sig;

  public Signature getSig() {
    return this.sig;
  }

  public void setSig(Signature value) {
    this.sig = value;
  }

  public static void encode(XdrDataOutputStream stream, AuthCert encodedAuthCert) throws IOException {
    Curve25519Public.encode(stream, encodedAuthCert.pubkey);
    Uint64.encode(stream, encodedAuthCert.expiration);
    Signature.encode(stream, encodedAuthCert.sig);
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

  public static AuthCert decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static AuthCert decode(XdrDataInputStream stream) throws IOException {
    AuthCert decodedAuthCert = new AuthCert();
    decodedAuthCert.pubkey = Curve25519Public.decode(stream);
    decodedAuthCert.expiration = Uint64.decode(stream);
    decodedAuthCert.sig = Signature.decode(stream);
    return decodedAuthCert;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.pubkey, this.expiration, this.sig);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof AuthCert)) {
      return false;
    }

    AuthCert other = (AuthCert) object;
    return Objects.equal(this.pubkey, other.pubkey) && Objects.equal(this.expiration, other.expiration) && Objects
        .equal(this.sig, other.sig);
  }

  public static final class Builder {
    private Curve25519Public pubkey;
    private Uint64 expiration;
    private Signature sig;

    public Builder pubkey(Curve25519Public pubkey) {
      this.pubkey = pubkey;
      return this;
    }

    public Builder expiration(Uint64 expiration) {
      this.expiration = expiration;
      return this;
    }

    public Builder sig(Signature sig) {
      this.sig = sig;
      return this;
    }

    public AuthCert build() {
      AuthCert val = new AuthCert();
      val.setPubkey(pubkey);
      val.setExpiration(expiration);
      val.setSig(sig);
      return val;
    }
  }
}
