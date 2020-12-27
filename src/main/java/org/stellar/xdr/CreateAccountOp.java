// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  struct CreateAccountOp
//  {
//      AccountID destination; // account to create
//      int64 startingBalance; // amount they end up with
//  };

//  ===========================================================================
public class CreateAccountOp implements XdrElement {
  private AccountID destination;
  private Int64 startingBalance;

  public CreateAccountOp() {
  }

  public static void encode(XdrDataOutputStream stream, CreateAccountOp encodedCreateAccountOp) throws IOException {
    AccountID.encode(stream, encodedCreateAccountOp.destination);
    Int64.encode(stream, encodedCreateAccountOp.startingBalance);
  }

  public static CreateAccountOp decode(XdrDataInputStream stream) throws IOException {
    CreateAccountOp decodedCreateAccountOp = new CreateAccountOp();
    decodedCreateAccountOp.destination = AccountID.decode(stream);
    decodedCreateAccountOp.startingBalance = Int64.decode(stream);
    return decodedCreateAccountOp;
  }

  public AccountID getDestination() {
    return this.destination;
  }

  public void setDestination(AccountID value) {
    this.destination = value;
  }

  public Int64 getStartingBalance() {
    return this.startingBalance;
  }

  public void setStartingBalance(Int64 value) {
    this.startingBalance = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.destination, this.startingBalance);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof CreateAccountOp)) {
      return false;
    }

    CreateAccountOp other = (CreateAccountOp) object;
    return Objects.equal(this.destination, other.destination) && Objects.equal(this.startingBalance,
        other.startingBalance);
  }
}