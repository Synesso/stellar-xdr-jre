// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;


import java.io.IOException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import okio.ByteString;
import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct ClaimOfferAtomV0
//  {
//      // emitted to identify the offer
//      uint256 sellerEd25519; // Account that owns the offer
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
public class ClaimOfferAtomV0 implements XdrElement {
  public ClaimOfferAtomV0 () {}
  private Uint256 sellerEd25519;
  public Uint256 getSellerEd25519() {
    return this.sellerEd25519;
  }
  public void setSellerEd25519(Uint256 value) {
    this.sellerEd25519 = value;
  }
  private Int64 offerID;
  public Int64 getOfferID() {
    return this.offerID;
  }
  public void setOfferID(Int64 value) {
    this.offerID = value;
  }
  private Asset assetSold;
  public Asset getAssetSold() {
    return this.assetSold;
  }
  public void setAssetSold(Asset value) {
    this.assetSold = value;
  }
  private Int64 amountSold;
  public Int64 getAmountSold() {
    return this.amountSold;
  }
  public void setAmountSold(Int64 value) {
    this.amountSold = value;
  }
  private Asset assetBought;
  public Asset getAssetBought() {
    return this.assetBought;
  }
  public void setAssetBought(Asset value) {
    this.assetBought = value;
  }
  private Int64 amountBought;
  public Int64 getAmountBought() {
    return this.amountBought;
  }
  public void setAmountBought(Int64 value) {
    this.amountBought = value;
  }
  public static void encode(XdrDataOutputStream stream, ClaimOfferAtomV0 encodedClaimOfferAtomV0) throws IOException{
    Uint256.encode(stream, encodedClaimOfferAtomV0.sellerEd25519);
    Int64.encode(stream, encodedClaimOfferAtomV0.offerID);
    Asset.encode(stream, encodedClaimOfferAtomV0.assetSold);
    Int64.encode(stream, encodedClaimOfferAtomV0.amountSold);
    Asset.encode(stream, encodedClaimOfferAtomV0.assetBought);
    Int64.encode(stream, encodedClaimOfferAtomV0.amountBought);
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
  public static ClaimOfferAtomV0 decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static ClaimOfferAtomV0 decode(XdrDataInputStream stream) throws IOException {
    ClaimOfferAtomV0 decodedClaimOfferAtomV0 = new ClaimOfferAtomV0();
    decodedClaimOfferAtomV0.sellerEd25519 = Uint256.decode(stream);
    decodedClaimOfferAtomV0.offerID = Int64.decode(stream);
    decodedClaimOfferAtomV0.assetSold = Asset.decode(stream);
    decodedClaimOfferAtomV0.amountSold = Int64.decode(stream);
    decodedClaimOfferAtomV0.assetBought = Asset.decode(stream);
    decodedClaimOfferAtomV0.amountBought = Int64.decode(stream);
    return decodedClaimOfferAtomV0;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.sellerEd25519, this.offerID, this.assetSold, this.amountSold, this.assetBought, this.amountBought);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof ClaimOfferAtomV0)) {
      return false;
    }

    ClaimOfferAtomV0 other = (ClaimOfferAtomV0) object;
    return Objects.equal(this.sellerEd25519, other.sellerEd25519) && Objects.equal(this.offerID, other.offerID) && Objects.equal(this.assetSold, other.assetSold) && Objects.equal(this.amountSold, other.amountSold) && Objects.equal(this.assetBought, other.assetBought) && Objects.equal(this.amountBought, other.amountBought);
  }

  public static final class Builder {
    private Uint256 sellerEd25519;
    private Int64 offerID;
    private Asset assetSold;
    private Int64 amountSold;
    private Asset assetBought;
    private Int64 amountBought;

    public Builder sellerEd25519(Uint256 sellerEd25519) {
      this.sellerEd25519 = sellerEd25519;
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

    public ClaimOfferAtomV0 build() {
      ClaimOfferAtomV0 val = new ClaimOfferAtomV0();
      val.setSellerEd25519(sellerEd25519);
      val.setOfferID(offerID);
      val.setAssetSold(assetSold);
      val.setAmountSold(amountSold);
      val.setAssetBought(assetBought);
      val.setAmountBought(amountBought);
      return val;
    }
  }
}
