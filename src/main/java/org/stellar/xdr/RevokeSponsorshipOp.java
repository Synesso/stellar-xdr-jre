// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  union RevokeSponsorshipOp switch (RevokeSponsorshipType type)
//  {
//  case REVOKE_SPONSORSHIP_LEDGER_ENTRY:
//      LedgerKey ledgerKey;
//  case REVOKE_SPONSORSHIP_SIGNER:
//      struct
//      {
//          AccountID accountID;
//          SignerKey signerKey;
//      } signer;
//  };

//  ===========================================================================
public class RevokeSponsorshipOp implements XdrElement {
  public RevokeSponsorshipOp() {
  }

  RevokeSponsorshipType type;

  public RevokeSponsorshipType getDiscriminant() {
    return this.type;
  }

  public void setDiscriminant(RevokeSponsorshipType value) {
    this.type = value;
  }

  private LedgerKey ledgerKey;

  public LedgerKey getLedgerKey() {
    return this.ledgerKey;
  }

  public void setLedgerKey(LedgerKey value) {
    this.ledgerKey = value;
  }

  private RevokeSponsorshipOpSigner signer;

  public RevokeSponsorshipOpSigner getSigner() {
    return this.signer;
  }

  public void setSigner(RevokeSponsorshipOpSigner value) {
    this.signer = value;
  }

  public static final class Builder {
    private RevokeSponsorshipType discriminant;
    private LedgerKey ledgerKey;
    private RevokeSponsorshipOpSigner signer;

    public Builder discriminant(RevokeSponsorshipType discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public Builder ledgerKey(LedgerKey ledgerKey) {
      this.ledgerKey = ledgerKey;
      return this;
    }

    public Builder signer(RevokeSponsorshipOpSigner signer) {
      this.signer = signer;
      return this;
    }

    public RevokeSponsorshipOp build() {
      RevokeSponsorshipOp val = new RevokeSponsorshipOp();
      val.setDiscriminant(discriminant);
      val.setLedgerKey(ledgerKey);
      val.setSigner(signer);
      return val;
    }
  }

  public static void encode(
      XdrDataOutputStream stream,
      RevokeSponsorshipOp encodedRevokeSponsorshipOp
  ) throws IOException {
    //Xdrgen::AST::Identifier
    //RevokeSponsorshipType
    stream.writeInt(encodedRevokeSponsorshipOp.getDiscriminant().getValue());
    switch (encodedRevokeSponsorshipOp.getDiscriminant()) {
      case REVOKE_SPONSORSHIP_LEDGER_ENTRY:
        LedgerKey.encode(stream, encodedRevokeSponsorshipOp.ledgerKey);
        break;
      case REVOKE_SPONSORSHIP_SIGNER:
        RevokeSponsorshipOpSigner.encode(stream, encodedRevokeSponsorshipOp.signer);
        break;
    }
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

  public static RevokeSponsorshipOp decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static RevokeSponsorshipOp decode(XdrDataInputStream stream) throws IOException {
    RevokeSponsorshipOp decodedRevokeSponsorshipOp = new RevokeSponsorshipOp();
    RevokeSponsorshipType discriminant = RevokeSponsorshipType.decode(stream);
    decodedRevokeSponsorshipOp.setDiscriminant(discriminant);
    switch (decodedRevokeSponsorshipOp.getDiscriminant()) {
      case REVOKE_SPONSORSHIP_LEDGER_ENTRY:
        decodedRevokeSponsorshipOp.ledgerKey = LedgerKey.decode(stream);
        break;
      case REVOKE_SPONSORSHIP_SIGNER:
        decodedRevokeSponsorshipOp.signer = RevokeSponsorshipOpSigner.decode(stream);
        break;
    }
    return decodedRevokeSponsorshipOp;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.ledgerKey, this.signer, this.type);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof RevokeSponsorshipOp)) {
      return false;
    }

    RevokeSponsorshipOp other = (RevokeSponsorshipOp) object;
    return Objects.equal(this.ledgerKey, other.ledgerKey) && Objects.equal(this.signer, other.signer) && Objects
        .equal(this.type, other.type);
  }

  public static class RevokeSponsorshipOpSigner {
    public RevokeSponsorshipOpSigner() {
    }
    private AccountID accountID;
    public AccountID getAccountID() {
      return this.accountID;
    }

    public void setAccountID(AccountID value) {
      this.accountID = value;
    }

    private SignerKey signerKey;

    public SignerKey getSignerKey() {
      return this.signerKey;
    }

    public void setSignerKey(SignerKey value) {
      this.signerKey = value;
    }

    public static void encode(
        XdrDataOutputStream stream,
        RevokeSponsorshipOpSigner encodedRevokeSponsorshipOpSigner
    ) throws IOException {
      AccountID.encode(stream, encodedRevokeSponsorshipOpSigner.accountID);
      SignerKey.encode(stream, encodedRevokeSponsorshipOpSigner.signerKey);
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

    public static RevokeSponsorshipOpSigner decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static RevokeSponsorshipOpSigner decode(XdrDataInputStream stream) throws IOException {
      RevokeSponsorshipOpSigner decodedRevokeSponsorshipOpSigner = new RevokeSponsorshipOpSigner();
      decodedRevokeSponsorshipOpSigner.accountID = AccountID.decode(stream);
      decodedRevokeSponsorshipOpSigner.signerKey = SignerKey.decode(stream);
      return decodedRevokeSponsorshipOpSigner;
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(this.accountID, this.signerKey);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof RevokeSponsorshipOpSigner)) {
        return false;
      }

      RevokeSponsorshipOpSigner other = (RevokeSponsorshipOpSigner) object;
      return Objects.equal(this.accountID, other.accountID) && Objects.equal(this.signerKey, other.signerKey);
    }

    public static final class Builder {
      private AccountID accountID;
      private SignerKey signerKey;

      public Builder accountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
      }

      public Builder signerKey(SignerKey signerKey) {
        this.signerKey = signerKey;
        return this;
      }

      public RevokeSponsorshipOpSigner build() {
        RevokeSponsorshipOpSigner val = new RevokeSponsorshipOpSigner();
        val.setAccountID(accountID);
        val.setSignerKey(signerKey);
        return val;
      }
    }

  }
}
