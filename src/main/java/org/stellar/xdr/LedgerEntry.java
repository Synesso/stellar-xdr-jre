// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct LedgerEntry
//  {
//      uint32 lastModifiedLedgerSeq; // ledger the LedgerEntry was last changed
//
//      union switch (LedgerEntryType type)
//      {
//      case ACCOUNT:
//          AccountEntry account;
//      case TRUSTLINE:
//          TrustLineEntry trustLine;
//      case OFFER:
//          OfferEntry offer;
//      case DATA:
//          DataEntry data;
//      case CLAIMABLE_BALANCE:
//          ClaimableBalanceEntry claimableBalance;
//      }
//      data;
//
//      // reserved for future use
//      union switch (int v)
//      {
//      case 0:
//          void;
//      case 1:
//          LedgerEntryExtensionV1 v1;
//      }
//      ext;
//  };

//  ===========================================================================
public class LedgerEntry implements XdrElement {
  private Uint32 lastModifiedLedgerSeq;
  private LedgerEntryData data;
  private LedgerEntryExt ext;

  public LedgerEntry() {
  }

  public static void encode(XdrDataOutputStream stream, LedgerEntry encodedLedgerEntry) throws IOException {
    Uint32.encode(stream, encodedLedgerEntry.lastModifiedLedgerSeq);
    LedgerEntryData.encode(stream, encodedLedgerEntry.data);
    LedgerEntryExt.encode(stream, encodedLedgerEntry.ext);
  }

  public static LedgerEntry decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static LedgerEntry decode(XdrDataInputStream stream) throws IOException {
    LedgerEntry decodedLedgerEntry = new LedgerEntry();
    decodedLedgerEntry.lastModifiedLedgerSeq = Uint32.decode(stream);
    decodedLedgerEntry.data = LedgerEntryData.decode(stream);
    decodedLedgerEntry.ext = LedgerEntryExt.decode(stream);
    return decodedLedgerEntry;
  }

  public Uint32 getLastModifiedLedgerSeq() {
    return this.lastModifiedLedgerSeq;
  }

  public void setLastModifiedLedgerSeq(Uint32 value) {
    this.lastModifiedLedgerSeq = value;
  }

  public LedgerEntryData getData() {
    return this.data;
  }

  public void setData(LedgerEntryData value) {
    this.data = value;
  }

  public LedgerEntryExt getExt() {
    return this.ext;
  }

  public void setExt(LedgerEntryExt value) {
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
    return Objects.hashCode(this.lastModifiedLedgerSeq, this.data, this.ext);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof LedgerEntry)) {
      return false;
    }

    LedgerEntry other = (LedgerEntry) object;
    return Objects.equal(this.lastModifiedLedgerSeq, other.lastModifiedLedgerSeq) && Objects.equal(this.data,
        other.data) && Objects.equal(this.ext, other.ext);
  }

  public static final class Builder {
    private Uint32 lastModifiedLedgerSeq;
    private LedgerEntryData data;
    private LedgerEntryExt ext;

    public Builder lastModifiedLedgerSeq(Uint32 lastModifiedLedgerSeq) {
      this.lastModifiedLedgerSeq = lastModifiedLedgerSeq;
      return this;
    }

    public Builder data(LedgerEntryData data) {
      this.data = data;
      return this;
    }

    public Builder ext(LedgerEntryExt ext) {
      this.ext = ext;
      return this;
    }

    public LedgerEntry build() {
      LedgerEntry val = new LedgerEntry();
      val.setLastModifiedLedgerSeq(lastModifiedLedgerSeq);
      val.setData(data);
      val.setExt(ext);
      return val;
    }
  }

  public static class LedgerEntryData {
    LedgerEntryType type;
    private AccountEntry account;
    private TrustLineEntry trustLine;
    private OfferEntry offer;
    private DataEntry data;
    private ClaimableBalanceEntry claimableBalance;

    public LedgerEntryData() {
    }

    public static void encode(XdrDataOutputStream stream, LedgerEntryData encodedLedgerEntryData) throws IOException {
      //Xdrgen::AST::Identifier
      //LedgerEntryType
      stream.writeInt(encodedLedgerEntryData.getDiscriminant().getValue());
      switch (encodedLedgerEntryData.getDiscriminant()) {
        case ACCOUNT:
          AccountEntry.encode(stream, encodedLedgerEntryData.account);
          break;
        case TRUSTLINE:
          TrustLineEntry.encode(stream, encodedLedgerEntryData.trustLine);
          break;
        case OFFER:
          OfferEntry.encode(stream, encodedLedgerEntryData.offer);
          break;
        case DATA:
          DataEntry.encode(stream, encodedLedgerEntryData.data);
          break;
        case CLAIMABLE_BALANCE:
          ClaimableBalanceEntry.encode(stream, encodedLedgerEntryData.claimableBalance);
          break;
      }
    }

    public static LedgerEntryData decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static LedgerEntryData decode(XdrDataInputStream stream) throws IOException {
      LedgerEntryData decodedLedgerEntryData = new LedgerEntryData();
      LedgerEntryType discriminant = LedgerEntryType.decode(stream);
      decodedLedgerEntryData.setDiscriminant(discriminant);
      switch (decodedLedgerEntryData.getDiscriminant()) {
        case ACCOUNT:
          decodedLedgerEntryData.account = AccountEntry.decode(stream);
          break;
        case TRUSTLINE:
          decodedLedgerEntryData.trustLine = TrustLineEntry.decode(stream);
          break;
        case OFFER:
          decodedLedgerEntryData.offer = OfferEntry.decode(stream);
          break;
        case DATA:
          decodedLedgerEntryData.data = DataEntry.decode(stream);
          break;
        case CLAIMABLE_BALANCE:
          decodedLedgerEntryData.claimableBalance = ClaimableBalanceEntry.decode(stream);
          break;
      }
      return decodedLedgerEntryData;
    }

    public LedgerEntryType getDiscriminant() {
      return this.type;
    }

    public void setDiscriminant(LedgerEntryType value) {
      this.type = value;
    }

    public AccountEntry getAccount() {
      return this.account;
    }

    public void setAccount(AccountEntry value) {
      this.account = value;
    }

    public TrustLineEntry getTrustLine() {
      return this.trustLine;
    }

    public void setTrustLine(TrustLineEntry value) {
      this.trustLine = value;
    }

    public OfferEntry getOffer() {
      return this.offer;
    }

    public void setOffer(OfferEntry value) {
      this.offer = value;
    }

    public DataEntry getData() {
      return this.data;
    }

    public void setData(DataEntry value) {
      this.data = value;
    }

    public ClaimableBalanceEntry getClaimableBalance() {
      return this.claimableBalance;
    }

    public void setClaimableBalance(ClaimableBalanceEntry value) {
      this.claimableBalance = value;
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
      return Objects.hashCode(this.account, this.trustLine, this.offer, this.data, this.claimableBalance, this.type);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof LedgerEntryData)) {
        return false;
      }

      LedgerEntryData other = (LedgerEntryData) object;
      return Objects.equal(this.account, other.account)
          && Objects.equal(this.trustLine, other.trustLine)
          && Objects.equal(this.offer, other.offer)
          && Objects.equal(this.data, other.data)
          && Objects.equal(this.claimableBalance, other.claimableBalance)
          && Objects.equal(this.type, other.type);
    }

    public static final class Builder {
      private LedgerEntryType discriminant;
      private AccountEntry account;
      private TrustLineEntry trustLine;
      private OfferEntry offer;
      private DataEntry data;
      private ClaimableBalanceEntry claimableBalance;

      public Builder discriminant(LedgerEntryType discriminant) {
        this.discriminant = discriminant;
        return this;
      }

      public Builder account(AccountEntry account) {
        this.account = account;
        return this;
      }

      public Builder trustLine(TrustLineEntry trustLine) {
        this.trustLine = trustLine;
        return this;
      }

      public Builder offer(OfferEntry offer) {
        this.offer = offer;
        return this;
      }

      public Builder data(DataEntry data) {
        this.data = data;
        return this;
      }

      public Builder claimableBalance(ClaimableBalanceEntry claimableBalance) {
        this.claimableBalance = claimableBalance;
        return this;
      }

      public LedgerEntryData build() {
        LedgerEntryData val = new LedgerEntryData();
        val.setDiscriminant(discriminant);
        val.setAccount(account);
        val.setTrustLine(trustLine);
        val.setOffer(offer);
        val.setData(data);
        val.setClaimableBalance(claimableBalance);
        return val;
      }
    }
  }

  public static class LedgerEntryExt {
    Integer v;
    private LedgerEntryExtensionV1 v1;

    public LedgerEntryExt() {
    }

    public static void encode(XdrDataOutputStream stream, LedgerEntryExt encodedLedgerEntryExt) throws IOException {
      //Xdrgen::AST::Typespecs::Int
      //Integer
      stream.writeInt(encodedLedgerEntryExt.getDiscriminant().intValue());
      switch (encodedLedgerEntryExt.getDiscriminant()) {
        case 0:
          break;
        case 1:
          LedgerEntryExtensionV1.encode(stream, encodedLedgerEntryExt.v1);
          break;
      }
    }

    public static LedgerEntryExt decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static LedgerEntryExt decode(XdrDataInputStream stream) throws IOException {
      LedgerEntryExt decodedLedgerEntryExt = new LedgerEntryExt();
      Integer discriminant = stream.readInt();
      decodedLedgerEntryExt.setDiscriminant(discriminant);
      switch (decodedLedgerEntryExt.getDiscriminant()) {
        case 0:
          break;
        case 1:
          decodedLedgerEntryExt.v1 = LedgerEntryExtensionV1.decode(stream);
          break;
      }
      return decodedLedgerEntryExt;
    }

    public Integer getDiscriminant() {
      return this.v;
    }

    public void setDiscriminant(Integer value) {
      this.v = value;
    }

    public LedgerEntryExtensionV1 getV1() {
      return this.v1;
    }

    public void setV1(LedgerEntryExtensionV1 value) {
      this.v1 = value;
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
      return Objects.hashCode(this.v1, this.v);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof LedgerEntryExt)) {
        return false;
      }

      LedgerEntryExt other = (LedgerEntryExt) object;
      return Objects.equal(this.v1, other.v1) && Objects.equal(this.v, other.v);
    }

    public static final class Builder {
      private Integer discriminant;
      private LedgerEntryExtensionV1 v1;

      public Builder discriminant(Integer discriminant) {
        this.discriminant = discriminant;
        return this;
      }

      public Builder v1(LedgerEntryExtensionV1 v1) {
        this.v1 = v1;
        return this;
      }

      public LedgerEntryExt build() {
        LedgerEntryExt val = new LedgerEntryExt();
        val.setDiscriminant(discriminant);
        val.setV1(v1);
        return val;
      }
    }
  }
}
