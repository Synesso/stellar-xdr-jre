// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  union LedgerCloseMeta switch (int v)
//  {
//  case 0:
//      LedgerCloseMetaV0 v0;
//  };

//  ===========================================================================
public class LedgerCloseMeta implements XdrElement {
  Integer v;
  private LedgerCloseMetaV0 v0;

  public LedgerCloseMeta() {
  }

  public static void encode(XdrDataOutputStream stream, LedgerCloseMeta encodedLedgerCloseMeta) throws IOException {
    //Xdrgen::AST::Typespecs::Int
    //Integer
    stream.writeInt(encodedLedgerCloseMeta.getDiscriminant().intValue());
    switch (encodedLedgerCloseMeta.getDiscriminant()) {
      case 0:
        LedgerCloseMetaV0.encode(stream, encodedLedgerCloseMeta.v0);
        break;
    }
  }

  public static LedgerCloseMeta decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static LedgerCloseMeta decode(XdrDataInputStream stream) throws IOException {
    LedgerCloseMeta decodedLedgerCloseMeta = new LedgerCloseMeta();
    Integer discriminant = stream.readInt();
    decodedLedgerCloseMeta.setDiscriminant(discriminant);
    switch (decodedLedgerCloseMeta.getDiscriminant()) {
      case 0:
        decodedLedgerCloseMeta.v0 = LedgerCloseMetaV0.decode(stream);
        break;
    }
    return decodedLedgerCloseMeta;
  }

  public Integer getDiscriminant() {
    return this.v;
  }

  public void setDiscriminant(Integer value) {
    this.v = value;
  }

  public LedgerCloseMetaV0 getV0() {
    return this.v0;
  }

  public void setV0(LedgerCloseMetaV0 value) {
    this.v0 = value;
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
    return Objects.hashCode(this.v0, this.v);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof LedgerCloseMeta)) {
      return false;
    }

    LedgerCloseMeta other = (LedgerCloseMeta) object;
    return Objects.equal(this.v0, other.v0) && Objects.equal(this.v, other.v);
  }

  public static final class Builder {
    private Integer discriminant;
    private LedgerCloseMetaV0 v0;

    public Builder discriminant(Integer discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public Builder v0(LedgerCloseMetaV0 v0) {
      this.v0 = v0;
      return this;
    }

    public LedgerCloseMeta build() {
      LedgerCloseMeta val = new LedgerCloseMeta();
      val.setDiscriminant(discriminant);
      val.setV0(v0);
      return val;
    }
  }
}
