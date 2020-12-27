// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Arrays;

// === xdr source ============================================================

//  struct CreateClaimableBalanceOp
//  {
//      Asset asset;
//      int64 amount;
//      Claimant claimants<10>;
//  };

//  ===========================================================================
public class CreateClaimableBalanceOp implements XdrElement {
  private Asset asset;
  private Int64 amount;
  private Claimant[] claimants;

  public CreateClaimableBalanceOp() {
  }

  public static void encode(XdrDataOutputStream stream, CreateClaimableBalanceOp encodedCreateClaimableBalanceOp)
      throws IOException {
    Asset.encode(stream, encodedCreateClaimableBalanceOp.asset);
    Int64.encode(stream, encodedCreateClaimableBalanceOp.amount);
    int claimantssize = encodedCreateClaimableBalanceOp.getClaimants().length;
    stream.writeInt(claimantssize);
    for (int i = 0; i < claimantssize; i++) {
      Claimant.encode(stream, encodedCreateClaimableBalanceOp.claimants[i]);
    }
  }

  public static CreateClaimableBalanceOp decode(XdrDataInputStream stream) throws IOException {
    CreateClaimableBalanceOp decodedCreateClaimableBalanceOp = new CreateClaimableBalanceOp();
    decodedCreateClaimableBalanceOp.asset = Asset.decode(stream);
    decodedCreateClaimableBalanceOp.amount = Int64.decode(stream);
    int claimantssize = stream.readInt();
    decodedCreateClaimableBalanceOp.claimants = new Claimant[claimantssize];
    for (int i = 0; i < claimantssize; i++) {
      decodedCreateClaimableBalanceOp.claimants[i] = Claimant.decode(stream);
    }
    return decodedCreateClaimableBalanceOp;
  }

  public Asset getAsset() {
    return this.asset;
  }

  public void setAsset(Asset value) {
    this.asset = value;
  }

  public Int64 getAmount() {
    return this.amount;
  }

  public void setAmount(Int64 value) {
    this.amount = value;
  }

  public Claimant[] getClaimants() {
    return this.claimants;
  }

  public void setClaimants(Claimant[] value) {
    this.claimants = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.asset, this.amount, Arrays.hashCode(this.claimants));
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof CreateClaimableBalanceOp)) {
      return false;
    }

    CreateClaimableBalanceOp other = (CreateClaimableBalanceOp) object;
    return Objects.equal(this.asset, other.asset) && Objects.equal(this.amount, other.amount) && Arrays.equals(
        this.claimants, other.claimants);
  }
}