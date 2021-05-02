// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct DecoratedSignature
//  {
//      SignatureHint hint;  // last 4 bytes of the public key, used as a hint
//      Signature signature; // actual signature
//  };

//  ===========================================================================
public class DecoratedSignature implements XdrElement {
  private SignatureHint hint;
  private Signature signature;

  public DecoratedSignature() {
  }

  public static void encode(
      XdrDataOutputStream stream,
      DecoratedSignature encodedDecoratedSignature
  ) throws IOException {
    SignatureHint.encode(stream, encodedDecoratedSignature.hint);
    Signature.encode(stream, encodedDecoratedSignature.signature);
  }

  public static DecoratedSignature decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static DecoratedSignature decode(XdrDataInputStream stream) throws IOException {
    DecoratedSignature decodedDecoratedSignature = new DecoratedSignature();
    decodedDecoratedSignature.hint = SignatureHint.decode(stream);
    decodedDecoratedSignature.signature = Signature.decode(stream);
    return decodedDecoratedSignature;
  }

  public SignatureHint getHint() {
    return this.hint;
  }

  public void setHint(SignatureHint value) {
    this.hint = value;
  }

  public Signature getSignature() {
    return this.signature;
  }

  public void setSignature(Signature value) {
    this.signature = value;
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
    return Objects.hashCode(this.hint, this.signature);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof DecoratedSignature)) {
      return false;
    }

    DecoratedSignature other = (DecoratedSignature) object;
    return Objects.equal(this.hint, other.hint) && Objects.equal(this.signature, other.signature);
  }

  public static final class Builder {
    private SignatureHint hint;
    private Signature signature;

    public Builder hint(SignatureHint hint) {
      this.hint = hint;
      return this;
    }

    public Builder signature(Signature signature) {
      this.signature = signature;
      return this;
    }

    public DecoratedSignature build() {
      DecoratedSignature val = new DecoratedSignature();
      val.setHint(hint);
      val.setSignature(signature);
      return val;
    }
  }
}
