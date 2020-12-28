// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  union LedgerKey switch (LedgerEntryType type)
//  {
//  case ACCOUNT:
//      struct
//      {
//          AccountID accountID;
//      } account;
//
//  case TRUSTLINE:
//      struct
//      {
//          AccountID accountID;
//          Asset asset;
//      } trustLine;
//
//  case OFFER:
//      struct
//      {
//          AccountID sellerID;
//          int64 offerID;
//      } offer;
//
//  case DATA:
//      struct
//      {
//          AccountID accountID;
//          string64 dataName;
//      } data;
//
//  case CLAIMABLE_BALANCE:
//      struct
//      {
//          ClaimableBalanceID balanceID;
//      } claimableBalance;
//  };

//  ===========================================================================
public class LedgerKey implements XdrElement {
  LedgerEntryType type;
  private LedgerKeyAccount account;
  private LedgerKeyTrustLine trustLine;
  private LedgerKeyOffer offer;
  private LedgerKeyData data;
  private LedgerKeyClaimableBalance claimableBalance;

  public LedgerKey() {
  }

  public static void encode(XdrDataOutputStream stream, LedgerKey encodedLedgerKey) throws IOException {
    //Xdrgen::AST::Identifier
    //LedgerEntryType
    stream.writeInt(encodedLedgerKey.getDiscriminant().getValue());
    switch (encodedLedgerKey.getDiscriminant()) {
      case ACCOUNT:
        LedgerKeyAccount.encode(stream, encodedLedgerKey.account);
        break;
      case TRUSTLINE:
        LedgerKeyTrustLine.encode(stream, encodedLedgerKey.trustLine);
        break;
      case OFFER:
        LedgerKeyOffer.encode(stream, encodedLedgerKey.offer);
        break;
      case DATA:
        LedgerKeyData.encode(stream, encodedLedgerKey.data);
        break;
      case CLAIMABLE_BALANCE:
        LedgerKeyClaimableBalance.encode(stream, encodedLedgerKey.claimableBalance);
        break;
    }
  }

  public static LedgerKey decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static LedgerKey decode(XdrDataInputStream stream) throws IOException {
    LedgerKey decodedLedgerKey = new LedgerKey();
    LedgerEntryType discriminant = LedgerEntryType.decode(stream);
    decodedLedgerKey.setDiscriminant(discriminant);
    switch (decodedLedgerKey.getDiscriminant()) {
      case ACCOUNT:
        decodedLedgerKey.account = LedgerKeyAccount.decode(stream);
        break;
      case TRUSTLINE:
        decodedLedgerKey.trustLine = LedgerKeyTrustLine.decode(stream);
        break;
      case OFFER:
        decodedLedgerKey.offer = LedgerKeyOffer.decode(stream);
        break;
      case DATA:
        decodedLedgerKey.data = LedgerKeyData.decode(stream);
        break;
      case CLAIMABLE_BALANCE:
        decodedLedgerKey.claimableBalance = LedgerKeyClaimableBalance.decode(stream);
        break;
    }
    return decodedLedgerKey;
  }

  public LedgerEntryType getDiscriminant() {
    return this.type;
  }

  public void setDiscriminant(LedgerEntryType value) {
    this.type = value;
  }

  public LedgerKeyAccount getAccount() {
    return this.account;
  }

  public void setAccount(LedgerKeyAccount value) {
    this.account = value;
  }

  public LedgerKeyTrustLine getTrustLine() {
    return this.trustLine;
  }

  public void setTrustLine(LedgerKeyTrustLine value) {
    this.trustLine = value;
  }

  public LedgerKeyOffer getOffer() {
    return this.offer;
  }

  public void setOffer(LedgerKeyOffer value) {
    this.offer = value;
  }

  public LedgerKeyData getData() {
    return this.data;
  }

  public void setData(LedgerKeyData value) {
    this.data = value;
  }

  public LedgerKeyClaimableBalance getClaimableBalance() {
    return this.claimableBalance;
  }

  public void setClaimableBalance(LedgerKeyClaimableBalance value) {
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
    if (!(object instanceof LedgerKey)) {
      return false;
    }

    LedgerKey other = (LedgerKey) object;
    return Objects.equal(this.account, other.account)
        && Objects.equal(this.trustLine, other.trustLine)
        && Objects.equal(this.offer, other.offer)
        && Objects.equal(this.data, other.data)
        && Objects.equal(this.claimableBalance, other.claimableBalance)
        && Objects.equal(this.type, other.type);
  }

  public static final class Builder {
    private LedgerEntryType discriminant;
    private LedgerKeyAccount account;
    private LedgerKeyTrustLine trustLine;
    private LedgerKeyOffer offer;
    private LedgerKeyData data;
    private LedgerKeyClaimableBalance claimableBalance;

    public Builder discriminant(LedgerEntryType discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public Builder account(LedgerKeyAccount account) {
      this.account = account;
      return this;
    }

    public Builder trustLine(LedgerKeyTrustLine trustLine) {
      this.trustLine = trustLine;
      return this;
    }

    public Builder offer(LedgerKeyOffer offer) {
      this.offer = offer;
      return this;
    }

    public Builder data(LedgerKeyData data) {
      this.data = data;
      return this;
    }

    public Builder claimableBalance(LedgerKeyClaimableBalance claimableBalance) {
      this.claimableBalance = claimableBalance;
      return this;
    }

    public LedgerKey build() {
      LedgerKey val = new LedgerKey();
      val.setDiscriminant(discriminant);
      val.setAccount(account);
      val.setTrustLine(trustLine);
      val.setOffer(offer);
      val.setData(data);
      val.setClaimableBalance(claimableBalance);
      return val;
    }
  }

  public static class LedgerKeyAccount {
    private AccountID accountID;

    public LedgerKeyAccount() {
    }

    public static void encode(XdrDataOutputStream stream, LedgerKeyAccount encodedLedgerKeyAccount) throws IOException {
      AccountID.encode(stream, encodedLedgerKeyAccount.accountID);
    }

    public static LedgerKeyAccount decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static LedgerKeyAccount decode(XdrDataInputStream stream) throws IOException {
      LedgerKeyAccount decodedLedgerKeyAccount = new LedgerKeyAccount();
      decodedLedgerKeyAccount.accountID = AccountID.decode(stream);
      return decodedLedgerKeyAccount;
    }

    public AccountID getAccountID() {
      return this.accountID;
    }

    public void setAccountID(AccountID value) {
      this.accountID = value;
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
      return Objects.hashCode(this.accountID);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof LedgerKeyAccount)) {
        return false;
      }

      LedgerKeyAccount other = (LedgerKeyAccount) object;
      return Objects.equal(this.accountID, other.accountID);
    }

    public static final class Builder {
      private AccountID accountID;

      public Builder accountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
      }

      public LedgerKeyAccount build() {
        LedgerKeyAccount val = new LedgerKeyAccount();
        val.setAccountID(accountID);
        return val;
      }
    }
  }

  public static class LedgerKeyTrustLine {
    private AccountID accountID;
    private Asset asset;

    public LedgerKeyTrustLine() {
    }

    public static void encode(XdrDataOutputStream stream, LedgerKeyTrustLine encodedLedgerKeyTrustLine)
        throws IOException {
      AccountID.encode(stream, encodedLedgerKeyTrustLine.accountID);
      Asset.encode(stream, encodedLedgerKeyTrustLine.asset);
    }

    public static LedgerKeyTrustLine decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static LedgerKeyTrustLine decode(XdrDataInputStream stream) throws IOException {
      LedgerKeyTrustLine decodedLedgerKeyTrustLine = new LedgerKeyTrustLine();
      decodedLedgerKeyTrustLine.accountID = AccountID.decode(stream);
      decodedLedgerKeyTrustLine.asset = Asset.decode(stream);
      return decodedLedgerKeyTrustLine;
    }

    public AccountID getAccountID() {
      return this.accountID;
    }

    public void setAccountID(AccountID value) {
      this.accountID = value;
    }

    public Asset getAsset() {
      return this.asset;
    }

    public void setAsset(Asset value) {
      this.asset = value;
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
      return Objects.hashCode(this.accountID, this.asset);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof LedgerKeyTrustLine)) {
        return false;
      }

      LedgerKeyTrustLine other = (LedgerKeyTrustLine) object;
      return Objects.equal(this.accountID, other.accountID) && Objects.equal(this.asset, other.asset);
    }

    public static final class Builder {
      private AccountID accountID;
      private Asset asset;

      public Builder accountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
      }

      public Builder asset(Asset asset) {
        this.asset = asset;
        return this;
      }

      public LedgerKeyTrustLine build() {
        LedgerKeyTrustLine val = new LedgerKeyTrustLine();
        val.setAccountID(accountID);
        val.setAsset(asset);
        return val;
      }
    }
  }

  public static class LedgerKeyOffer {
    private AccountID sellerID;
    private Int64 offerID;

    public LedgerKeyOffer() {
    }

    public static void encode(XdrDataOutputStream stream, LedgerKeyOffer encodedLedgerKeyOffer) throws IOException {
      AccountID.encode(stream, encodedLedgerKeyOffer.sellerID);
      Int64.encode(stream, encodedLedgerKeyOffer.offerID);
    }

    public static LedgerKeyOffer decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static LedgerKeyOffer decode(XdrDataInputStream stream) throws IOException {
      LedgerKeyOffer decodedLedgerKeyOffer = new LedgerKeyOffer();
      decodedLedgerKeyOffer.sellerID = AccountID.decode(stream);
      decodedLedgerKeyOffer.offerID = Int64.decode(stream);
      return decodedLedgerKeyOffer;
    }

    public AccountID getSellerID() {
      return this.sellerID;
    }

    public void setSellerID(AccountID value) {
      this.sellerID = value;
    }

    public Int64 getOfferID() {
      return this.offerID;
    }

    public void setOfferID(Int64 value) {
      this.offerID = value;
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
      return Objects.hashCode(this.sellerID, this.offerID);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof LedgerKeyOffer)) {
        return false;
      }

      LedgerKeyOffer other = (LedgerKeyOffer) object;
      return Objects.equal(this.sellerID, other.sellerID) && Objects.equal(this.offerID, other.offerID);
    }

    public static final class Builder {
      private AccountID sellerID;
      private Int64 offerID;

      public Builder sellerID(AccountID sellerID) {
        this.sellerID = sellerID;
        return this;
      }

      public Builder offerID(Int64 offerID) {
        this.offerID = offerID;
        return this;
      }

      public LedgerKeyOffer build() {
        LedgerKeyOffer val = new LedgerKeyOffer();
        val.setSellerID(sellerID);
        val.setOfferID(offerID);
        return val;
      }
    }
  }

  public static class LedgerKeyData {
    private AccountID accountID;
    private String64 dataName;

    public LedgerKeyData() {
    }

    public static void encode(XdrDataOutputStream stream, LedgerKeyData encodedLedgerKeyData) throws IOException {
      AccountID.encode(stream, encodedLedgerKeyData.accountID);
      String64.encode(stream, encodedLedgerKeyData.dataName);
    }

    public static LedgerKeyData decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static LedgerKeyData decode(XdrDataInputStream stream) throws IOException {
      LedgerKeyData decodedLedgerKeyData = new LedgerKeyData();
      decodedLedgerKeyData.accountID = AccountID.decode(stream);
      decodedLedgerKeyData.dataName = String64.decode(stream);
      return decodedLedgerKeyData;
    }

    public AccountID getAccountID() {
      return this.accountID;
    }

    public void setAccountID(AccountID value) {
      this.accountID = value;
    }

    public String64 getDataName() {
      return this.dataName;
    }

    public void setDataName(String64 value) {
      this.dataName = value;
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
      return Objects.hashCode(this.accountID, this.dataName);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof LedgerKeyData)) {
        return false;
      }

      LedgerKeyData other = (LedgerKeyData) object;
      return Objects.equal(this.accountID, other.accountID) && Objects.equal(this.dataName, other.dataName);
    }

    public static final class Builder {
      private AccountID accountID;
      private String64 dataName;

      public Builder accountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
      }

      public Builder dataName(String64 dataName) {
        this.dataName = dataName;
        return this;
      }

      public LedgerKeyData build() {
        LedgerKeyData val = new LedgerKeyData();
        val.setAccountID(accountID);
        val.setDataName(dataName);
        return val;
      }
    }
  }

  public static class LedgerKeyClaimableBalance {
    private ClaimableBalanceID balanceID;

    public LedgerKeyClaimableBalance() {
    }

    public static void encode(XdrDataOutputStream stream, LedgerKeyClaimableBalance encodedLedgerKeyClaimableBalance)
        throws IOException {
      ClaimableBalanceID.encode(stream, encodedLedgerKeyClaimableBalance.balanceID);
    }

    public static LedgerKeyClaimableBalance decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static LedgerKeyClaimableBalance decode(XdrDataInputStream stream) throws IOException {
      LedgerKeyClaimableBalance decodedLedgerKeyClaimableBalance = new LedgerKeyClaimableBalance();
      decodedLedgerKeyClaimableBalance.balanceID = ClaimableBalanceID.decode(stream);
      return decodedLedgerKeyClaimableBalance;
    }

    public ClaimableBalanceID getBalanceID() {
      return this.balanceID;
    }

    public void setBalanceID(ClaimableBalanceID value) {
      this.balanceID = value;
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
      return Objects.hashCode(this.balanceID);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof LedgerKeyClaimableBalance)) {
        return false;
      }

      LedgerKeyClaimableBalance other = (LedgerKeyClaimableBalance) object;
      return Objects.equal(this.balanceID, other.balanceID);
    }

    public static final class Builder {
      private ClaimableBalanceID balanceID;

      public Builder balanceID(ClaimableBalanceID balanceID) {
        this.balanceID = balanceID;
        return this;
      }

      public LedgerKeyClaimableBalance build() {
        LedgerKeyClaimableBalance val = new LedgerKeyClaimableBalance();
        val.setBalanceID(balanceID);
        return val;
      }
    }
  }
}
