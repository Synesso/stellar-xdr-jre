// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  typedef PublicKey AccountID;

//  ===========================================================================
public class AccountID implements XdrElement {
  private PublicKey AccountID;

  public AccountID() {
  }

  public AccountID(PublicKey AccountID) {
    this.AccountID = AccountID;
  }

  public static void encode(XdrDataOutputStream stream, AccountID encodedAccountID) throws IOException {
    PublicKey.encode(stream, encodedAccountID.AccountID);
  }

  public static AccountID decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static AccountID decode(XdrDataInputStream stream) throws IOException {
    AccountID decodedAccountID = new AccountID();
    decodedAccountID.AccountID = PublicKey.decode(stream);
    return decodedAccountID;
  }

  public PublicKey getAccountID() {
    return this.AccountID;
  }

  public void setAccountID(PublicKey value) {
    this.AccountID = value;
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
    return Objects.hashCode(this.AccountID);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof AccountID)) {
      return false;
    }

    AccountID other = (AccountID) object;
    return Objects.equal(this.AccountID, other.AccountID);
  }
}
