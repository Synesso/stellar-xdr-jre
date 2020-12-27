// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  struct ClaimClaimableBalanceOp
//  {
//      ClaimableBalanceID balanceID;
//  };

//  ===========================================================================
public class ClaimClaimableBalanceOp implements XdrElement {
  private ClaimableBalanceID balanceID;

  public ClaimClaimableBalanceOp() {
  }

  public static void encode(XdrDataOutputStream stream, ClaimClaimableBalanceOp encodedClaimClaimableBalanceOp)
      throws IOException {
    ClaimableBalanceID.encode(stream, encodedClaimClaimableBalanceOp.balanceID);
  }

  public static ClaimClaimableBalanceOp decode(XdrDataInputStream stream) throws IOException {
    ClaimClaimableBalanceOp decodedClaimClaimableBalanceOp = new ClaimClaimableBalanceOp();
    decodedClaimClaimableBalanceOp.balanceID = ClaimableBalanceID.decode(stream);
    return decodedClaimClaimableBalanceOp;
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

  @Override
  public int hashCode() {
    return Objects.hashCode(this.balanceID);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof ClaimClaimableBalanceOp)) {
      return false;
    }

    ClaimClaimableBalanceOp other = (ClaimClaimableBalanceOp) object;
    return Objects.equal(this.balanceID, other.balanceID);
  }
}