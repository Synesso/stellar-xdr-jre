// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct ClaimOfferAtom
//  {
//      // emitted to identify the offer
//      AccountID sellerID; // Account that owns the offer
//      int64 offerID;
//
//      // amount and asset taken from the owner
//      Asset assetSold;
//      int64 amountSold;
//
//      // amount and asset sent to the owner
//      Asset assetBought;
//      int64 amountBought;
//  };

//  ===========================================================================
public class ClaimOfferAtom implements XdrElement {
  private AccountID sellerID;
  private Int64 offerID;
  private Asset assetSold;
  private Int64 amountSold;
  private Asset assetBought;
  private Int64 amountBought;

  public ClaimOfferAtom() {
  }

  public static void encode(XdrDataOutputStream stream, ClaimOfferAtom encodedClaimOfferAtom) throws IOException {
    AccountID.encode(stream, encodedClaimOfferAtom.sellerID);
    Int64.encode(stream, encodedClaimOfferAtom.offerID);
    Asset.encode(stream, encodedClaimOfferAtom.assetSold);
    Int64.encode(stream, encodedClaimOfferAtom.amountSold);
    Asset.encode(stream, encodedClaimOfferAtom.assetBought);
    Int64.encode(stream, encodedClaimOfferAtom.amountBought);
  }

  public static ClaimOfferAtom decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static ClaimOfferAtom decode(XdrDataInputStream stream) throws IOException {
    ClaimOfferAtom decodedClaimOfferAtom = new ClaimOfferAtom();
    decodedClaimOfferAtom.sellerID = AccountID.decode(stream);
    decodedClaimOfferAtom.offerID = Int64.decode(stream);
    decodedClaimOfferAtom.assetSold = Asset.decode(stream);
    decodedClaimOfferAtom.amountSold = Int64.decode(stream);
    decodedClaimOfferAtom.assetBought = Asset.decode(stream);
    decodedClaimOfferAtom.amountBought = Int64.decode(stream);
    return decodedClaimOfferAtom;
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

  public Asset getAssetSold() {
    return this.assetSold;
  }

  public void setAssetSold(Asset value) {
    this.assetSold = value;
  }

  public Int64 getAmountSold() {
    return this.amountSold;
  }

  public void setAmountSold(Int64 value) {
    this.amountSold = value;
  }

  public Asset getAssetBought() {
    return this.assetBought;
  }

  public void setAssetBought(Asset value) {
    this.assetBought = value;
  }

  public Int64 getAmountBought() {
    return this.amountBought;
  }

  public void setAmountBought(Int64 value) {
    this.amountBought = value;
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
    return Objects.hashCode(this.sellerID, this.offerID, this.assetSold, this.amountSold, this.assetBought,
        this.amountBought);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof ClaimOfferAtom)) {
      return false;
    }

    ClaimOfferAtom other = (ClaimOfferAtom) object;
    return Objects.equal(this.sellerID, other.sellerID) && Objects.equal(this.offerID, other.offerID) && Objects.equal(
        this.assetSold, other.assetSold) && Objects.equal(this.amountSold, other.amountSold) && Objects.equal(
        this.assetBought, other.assetBought) && Objects.equal(this.amountBought, other.amountBought);
  }

  public static final class Builder {
    private AccountID sellerID;
    private Int64 offerID;
    private Asset assetSold;
    private Int64 amountSold;
    private Asset assetBought;
    private Int64 amountBought;

    public Builder sellerID(AccountID sellerID) {
      this.sellerID = sellerID;
      return this;
    }

    public Builder offerID(Int64 offerID) {
      this.offerID = offerID;
      return this;
    }

    public Builder assetSold(Asset assetSold) {
      this.assetSold = assetSold;
      return this;
    }

    public Builder amountSold(Int64 amountSold) {
      this.amountSold = amountSold;
      return this;
    }

    public Builder assetBought(Asset assetBought) {
      this.assetBought = assetBought;
      return this;
    }

    public Builder amountBought(Int64 amountBought) {
      this.amountBought = amountBought;
      return this;
    }

    public ClaimOfferAtom build() {
      ClaimOfferAtom val = new ClaimOfferAtom();
      val.setSellerID(sellerID);
      val.setOfferID(offerID);
      val.setAssetSold(assetSold);
      val.setAmountSold(amountSold);
      val.setAssetBought(assetBought);
      val.setAmountBought(amountBought);
      return val;
    }
  }
}
