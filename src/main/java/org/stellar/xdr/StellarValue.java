// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

// === xdr source ============================================================

//  struct StellarValue
//  {
//      Hash txSetHash;      // transaction set to apply to previous ledger
//      TimePoint closeTime; // network close time
//
//      // upgrades to apply to the previous ledger (usually empty)
//      // this is a vector of encoded 'LedgerUpgrade' so that nodes can drop
//      // unknown steps during consensus if needed.
//      // see notes below on 'LedgerUpgrade' for more detail
//      // max size is dictated by number of upgrade types (+ room for future)
//      UpgradeType upgrades<6>;
//
//      // reserved for future use
//      union switch (StellarValueType v)
//      {
//      case STELLAR_VALUE_BASIC:
//          void;
//      case STELLAR_VALUE_SIGNED:
//          LedgerCloseValueSignature lcValueSignature;
//      }
//      ext;
//  };

//  ===========================================================================
public class StellarValue implements XdrElement {
  private Hash txSetHash;
  private TimePoint closeTime;
  private UpgradeType[] upgrades;
  private StellarValueExt ext;

  public StellarValue() {
  }

  public static void encode(XdrDataOutputStream stream, StellarValue encodedStellarValue) throws IOException {
    Hash.encode(stream, encodedStellarValue.txSetHash);
    TimePoint.encode(stream, encodedStellarValue.closeTime);
    int upgradessize = encodedStellarValue.getUpgrades().length;
    stream.writeInt(upgradessize);
    for (int i = 0; i < upgradessize; i++) {
      UpgradeType.encode(stream, encodedStellarValue.upgrades[i]);
    }
    StellarValueExt.encode(stream, encodedStellarValue.ext);
  }

  public static StellarValue decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static StellarValue decode(XdrDataInputStream stream) throws IOException {
    StellarValue decodedStellarValue = new StellarValue();
    decodedStellarValue.txSetHash = Hash.decode(stream);
    decodedStellarValue.closeTime = TimePoint.decode(stream);
    int upgradessize = stream.readInt();
    decodedStellarValue.upgrades = new UpgradeType[upgradessize];
    for (int i = 0; i < upgradessize; i++) {
      decodedStellarValue.upgrades[i] = UpgradeType.decode(stream);
    }
    decodedStellarValue.ext = StellarValueExt.decode(stream);
    return decodedStellarValue;
  }

  public Hash getTxSetHash() {
    return this.txSetHash;
  }

  public void setTxSetHash(Hash value) {
    this.txSetHash = value;
  }

  public TimePoint getCloseTime() {
    return this.closeTime;
  }

  public void setCloseTime(TimePoint value) {
    this.closeTime = value;
  }

  public UpgradeType[] getUpgrades() {
    return this.upgrades;
  }

  public void setUpgrades(UpgradeType[] value) {
    this.upgrades = value;
  }

  public StellarValueExt getExt() {
    return this.ext;
  }

  public void setExt(StellarValueExt value) {
    this.ext = value;
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
    return Objects.hashCode(this.txSetHash, this.closeTime, Arrays.hashCode(this.upgrades), this.ext);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof StellarValue)) {
      return false;
    }

    StellarValue other = (StellarValue) object;
    return Objects.equal(this.txSetHash, other.txSetHash)
        && Objects.equal(this.closeTime, other.closeTime)
        && Arrays.equals(this.upgrades, other.upgrades)
        && Objects.equal(this.ext, other.ext);
  }

  public static final class Builder {
    private Hash txSetHash;
    private TimePoint closeTime;
    private UpgradeType[] upgrades;
    private StellarValueExt ext;

    public Builder txSetHash(Hash txSetHash) {
      this.txSetHash = txSetHash;
      return this;
    }

    public Builder closeTime(TimePoint closeTime) {
      this.closeTime = closeTime;
      return this;
    }

    public Builder upgrades(UpgradeType[] upgrades) {
      this.upgrades = upgrades;
      return this;
    }

    public Builder ext(StellarValueExt ext) {
      this.ext = ext;
      return this;
    }

    public StellarValue build() {
      StellarValue val = new StellarValue();
      val.setTxSetHash(txSetHash);
      val.setCloseTime(closeTime);
      val.setUpgrades(upgrades);
      val.setExt(ext);
      return val;
    }
  }

  public static class StellarValueExt {
    StellarValueType v;
    private LedgerCloseValueSignature lcValueSignature;

    public StellarValueExt() {
    }

    public static void encode(XdrDataOutputStream stream, StellarValueExt encodedStellarValueExt) throws IOException {
      //Xdrgen::AST::Identifier
      //StellarValueType
      stream.writeInt(encodedStellarValueExt.getDiscriminant().getValue());
      switch (encodedStellarValueExt.getDiscriminant()) {
        case STELLAR_VALUE_BASIC:
          break;
        case STELLAR_VALUE_SIGNED:
          LedgerCloseValueSignature.encode(stream, encodedStellarValueExt.lcValueSignature);
          break;
      }
    }

    public static StellarValueExt decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static StellarValueExt decode(XdrDataInputStream stream) throws IOException {
      StellarValueExt decodedStellarValueExt = new StellarValueExt();
      StellarValueType discriminant = StellarValueType.decode(stream);
      decodedStellarValueExt.setDiscriminant(discriminant);
      switch (decodedStellarValueExt.getDiscriminant()) {
        case STELLAR_VALUE_BASIC:
          break;
        case STELLAR_VALUE_SIGNED:
          decodedStellarValueExt.lcValueSignature = LedgerCloseValueSignature.decode(stream);
          break;
      }
      return decodedStellarValueExt;
    }

    public StellarValueType getDiscriminant() {
      return this.v;
    }

    public void setDiscriminant(StellarValueType value) {
      this.v = value;
    }

    public LedgerCloseValueSignature getLcValueSignature() {
      return this.lcValueSignature;
    }

    public void setLcValueSignature(LedgerCloseValueSignature value) {
      this.lcValueSignature = value;
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
      return Objects.hashCode(this.lcValueSignature, this.v);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof StellarValueExt)) {
        return false;
      }

      StellarValueExt other = (StellarValueExt) object;
      return Objects.equal(this.lcValueSignature, other.lcValueSignature) && Objects.equal(this.v, other.v);
    }

    public static final class Builder {
      private StellarValueType discriminant;
      private LedgerCloseValueSignature lcValueSignature;

      public Builder discriminant(StellarValueType discriminant) {
        this.discriminant = discriminant;
        return this;
      }

      public Builder lcValueSignature(LedgerCloseValueSignature lcValueSignature) {
        this.lcValueSignature = lcValueSignature;
        return this;
      }

      public StellarValueExt build() {
        StellarValueExt val = new StellarValueExt();
        val.setDiscriminant(discriminant);
        val.setLcValueSignature(lcValueSignature);
        return val;
      }
    }
  }
}
