// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct SetTrustLineFlagsOp
//  {
//      AccountID trustor;
//      Asset asset;
//
//      uint32 clearFlags; // which flags to clear
//      uint32 setFlags;   // which flags to set
//  };

//  ===========================================================================
public class SetTrustLineFlagsOp implements XdrElement {
  private AccountID trustor;
  private Asset asset;
  private Uint32 clearFlags;
  private Uint32 setFlags;

  public SetTrustLineFlagsOp() {
  }

  public static void encode(
      XdrDataOutputStream stream,
      SetTrustLineFlagsOp encodedSetTrustLineFlagsOp
  ) throws IOException {
    AccountID.encode(stream, encodedSetTrustLineFlagsOp.trustor);
    Asset.encode(stream, encodedSetTrustLineFlagsOp.asset);
    Uint32.encode(stream, encodedSetTrustLineFlagsOp.clearFlags);
    Uint32.encode(stream, encodedSetTrustLineFlagsOp.setFlags);
  }

  public static SetTrustLineFlagsOp decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static SetTrustLineFlagsOp decode(XdrDataInputStream stream) throws IOException {
    SetTrustLineFlagsOp decodedSetTrustLineFlagsOp = new SetTrustLineFlagsOp();
    decodedSetTrustLineFlagsOp.trustor = AccountID.decode(stream);
    decodedSetTrustLineFlagsOp.asset = Asset.decode(stream);
    decodedSetTrustLineFlagsOp.clearFlags = Uint32.decode(stream);
    decodedSetTrustLineFlagsOp.setFlags = Uint32.decode(stream);
    return decodedSetTrustLineFlagsOp;
  }

  public AccountID getTrustor() {
    return this.trustor;
  }

  public void setTrustor(AccountID value) {
    this.trustor = value;
  }

  public Asset getAsset() {
    return this.asset;
  }

  public void setAsset(Asset value) {
    this.asset = value;
  }

  public Uint32 getClearFlags() {
    return this.clearFlags;
  }

  public void setClearFlags(Uint32 value) {
    this.clearFlags = value;
  }

  public Uint32 getSetFlags() {
    return this.setFlags;
  }

  public void setSetFlags(Uint32 value) {
    this.setFlags = value;
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
    return Objects.hashCode(this.trustor, this.asset, this.clearFlags, this.setFlags);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SetTrustLineFlagsOp)) {
      return false;
    }

    SetTrustLineFlagsOp other = (SetTrustLineFlagsOp) object;
    return Objects.equal(this.trustor, other.trustor) && Objects.equal(this.asset, other.asset) && Objects
        .equal(this.clearFlags, other.clearFlags) && Objects.equal(this.setFlags, other.setFlags);
  }

  public static final class Builder {
    private AccountID trustor;
    private Asset asset;
    private Uint32 clearFlags;
    private Uint32 setFlags;

    public Builder trustor(AccountID trustor) {
      this.trustor = trustor;
      return this;
    }

    public Builder asset(Asset asset) {
      this.asset = asset;
      return this;
    }

    public Builder clearFlags(Uint32 clearFlags) {
      this.clearFlags = clearFlags;
      return this;
    }

    public Builder setFlags(Uint32 setFlags) {
      this.setFlags = setFlags;
      return this;
    }

    public SetTrustLineFlagsOp build() {
      SetTrustLineFlagsOp val = new SetTrustLineFlagsOp();
      val.setTrustor(trustor);
      val.setAsset(asset);
      val.setClearFlags(clearFlags);
      val.setSetFlags(setFlags);
      return val;
    }
  }
}
