// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Arrays;

// === xdr source ============================================================

//  struct ClaimableBalanceEntry
//  {
//      // Unique identifier for this ClaimableBalanceEntry
//      ClaimableBalanceID balanceID;
//  
//      // List of claimants with associated predicate
//      Claimant claimants<10>;
//  
//      // Any asset including native
//      Asset asset;
//  
//      // Amount of asset
//      int64 amount;
//  
//      // reserved for future use
//      union switch (int v)
//      {
//      case 0:
//          void;
//      }
//      ext;
//  };

//  ===========================================================================
public class ClaimableBalanceEntry implements XdrElement {
  private ClaimableBalanceID balanceID;
  private Claimant[] claimants;
  private Asset asset;
  private Int64 amount;
  private ClaimableBalanceEntryExt ext;

  public ClaimableBalanceEntry() {
  }

  public static void encode(XdrDataOutputStream stream, ClaimableBalanceEntry encodedClaimableBalanceEntry)
      throws IOException {
    ClaimableBalanceID.encode(stream, encodedClaimableBalanceEntry.balanceID);
    int claimantssize = encodedClaimableBalanceEntry.getClaimants().length;
    stream.writeInt(claimantssize);
    for (int i = 0; i < claimantssize; i++) {
      Claimant.encode(stream, encodedClaimableBalanceEntry.claimants[i]);
    }
    Asset.encode(stream, encodedClaimableBalanceEntry.asset);
    Int64.encode(stream, encodedClaimableBalanceEntry.amount);
    ClaimableBalanceEntryExt.encode(stream, encodedClaimableBalanceEntry.ext);
  }

  public static ClaimableBalanceEntry decode(XdrDataInputStream stream) throws IOException {
    ClaimableBalanceEntry decodedClaimableBalanceEntry = new ClaimableBalanceEntry();
    decodedClaimableBalanceEntry.balanceID = ClaimableBalanceID.decode(stream);
    int claimantssize = stream.readInt();
    decodedClaimableBalanceEntry.claimants = new Claimant[claimantssize];
    for (int i = 0; i < claimantssize; i++) {
      decodedClaimableBalanceEntry.claimants[i] = Claimant.decode(stream);
    }
    decodedClaimableBalanceEntry.asset = Asset.decode(stream);
    decodedClaimableBalanceEntry.amount = Int64.decode(stream);
    decodedClaimableBalanceEntry.ext = ClaimableBalanceEntryExt.decode(stream);
    return decodedClaimableBalanceEntry;
  }

  public ClaimableBalanceID getBalanceID() {
    return this.balanceID;
  }

  public void setBalanceID(ClaimableBalanceID value) {
    this.balanceID = value;
  }

  public Claimant[] getClaimants() {
    return this.claimants;
  }

  public void setClaimants(Claimant[] value) {
    this.claimants = value;
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

  public ClaimableBalanceEntryExt getExt() {
    return this.ext;
  }

  public void setExt(ClaimableBalanceEntryExt value) {
    this.ext = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.balanceID, Arrays.hashCode(this.claimants), this.asset, this.amount, this.ext);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof ClaimableBalanceEntry)) {
      return false;
    }

    ClaimableBalanceEntry other = (ClaimableBalanceEntry) object;
    return Objects.equal(this.balanceID, other.balanceID)
        && Arrays.equals(this.claimants, other.claimants)
        && Objects.equal(this.asset, other.asset)
        && Objects.equal(this.amount, other.amount)
        && Objects.equal(this.ext, other.ext);
  }

  public static class ClaimableBalanceEntryExt {
    Integer v;

    public ClaimableBalanceEntryExt() {
    }

    public static void encode(XdrDataOutputStream stream, ClaimableBalanceEntryExt encodedClaimableBalanceEntryExt)
        throws IOException {
      //Xdrgen::AST::Typespecs::Int
      //Integer
      stream.writeInt(encodedClaimableBalanceEntryExt.getDiscriminant().intValue());
      switch (encodedClaimableBalanceEntryExt.getDiscriminant()) {
        case 0:
          break;
      }
    }

    public static ClaimableBalanceEntryExt decode(XdrDataInputStream stream) throws IOException {
      ClaimableBalanceEntryExt decodedClaimableBalanceEntryExt = new ClaimableBalanceEntryExt();
      Integer discriminant = stream.readInt();
      decodedClaimableBalanceEntryExt.setDiscriminant(discriminant);
      switch (decodedClaimableBalanceEntryExt.getDiscriminant()) {
        case 0:
          break;
      }
      return decodedClaimableBalanceEntryExt;
    }

    public Integer getDiscriminant() {
      return this.v;
    }

    public void setDiscriminant(Integer value) {
      this.v = value;
    }

    public void encode(XdrDataOutputStream stream) throws IOException {
      encode(stream, this);
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(this.v);
    }

    @Override
    public boolean equals(Object object) {
      if (object == null || !(object instanceof ClaimableBalanceEntryExt)) {
        return false;
      }

      ClaimableBalanceEntryExt other = (ClaimableBalanceEntryExt) object;
      return Objects.equal(this.v, other.v);
    }
  }
}
