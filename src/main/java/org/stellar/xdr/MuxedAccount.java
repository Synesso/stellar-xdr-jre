// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  union MuxedAccount switch (CryptoKeyType type)
//  {
//  case KEY_TYPE_ED25519:
//      uint256 ed25519;
//  case KEY_TYPE_MUXED_ED25519:
//      struct
//      {
//          uint64 id;
//          uint256 ed25519;
//      } med25519;
//  };

//  ===========================================================================
public class MuxedAccount implements XdrElement {
  CryptoKeyType type;
  private Uint256 ed25519;
  private MuxedAccountMed25519 med25519;

  public MuxedAccount() {
  }

  public static void encode(XdrDataOutputStream stream, MuxedAccount encodedMuxedAccount) throws IOException {
    //Xdrgen::AST::Identifier
    //CryptoKeyType
    stream.writeInt(encodedMuxedAccount.getDiscriminant().getValue());
    switch (encodedMuxedAccount.getDiscriminant()) {
      case KEY_TYPE_ED25519:
        Uint256.encode(stream, encodedMuxedAccount.ed25519);
        break;
      case KEY_TYPE_MUXED_ED25519:
        MuxedAccountMed25519.encode(stream, encodedMuxedAccount.med25519);
        break;
    }
  }

  public static MuxedAccount decode(XdrDataInputStream stream) throws IOException {
    MuxedAccount decodedMuxedAccount = new MuxedAccount();
    CryptoKeyType discriminant = CryptoKeyType.decode(stream);
    decodedMuxedAccount.setDiscriminant(discriminant);
    switch (decodedMuxedAccount.getDiscriminant()) {
      case KEY_TYPE_ED25519:
        decodedMuxedAccount.ed25519 = Uint256.decode(stream);
        break;
      case KEY_TYPE_MUXED_ED25519:
        decodedMuxedAccount.med25519 = MuxedAccountMed25519.decode(stream);
        break;
    }
    return decodedMuxedAccount;
  }

  public CryptoKeyType getDiscriminant() {
    return this.type;
  }

  public void setDiscriminant(CryptoKeyType value) {
    this.type = value;
  }

  public Uint256 getEd25519() {
    return this.ed25519;
  }

  public void setEd25519(Uint256 value) {
    this.ed25519 = value;
  }

  public MuxedAccountMed25519 getMed25519() {
    return this.med25519;
  }

  public void setMed25519(MuxedAccountMed25519 value) {
    this.med25519 = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.ed25519, this.med25519, this.type);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof MuxedAccount)) {
      return false;
    }

    MuxedAccount other = (MuxedAccount) object;
    return Objects.equal(this.ed25519, other.ed25519) && Objects.equal(this.med25519, other.med25519) && Objects.equal(
        this.type, other.type);
  }

  public static class MuxedAccountMed25519 {
    private Uint64 id;
    private Uint256 ed25519;

    public MuxedAccountMed25519() {
    }

    public static void encode(XdrDataOutputStream stream, MuxedAccountMed25519 encodedMuxedAccountMed25519)
        throws IOException {
      Uint64.encode(stream, encodedMuxedAccountMed25519.id);
      Uint256.encode(stream, encodedMuxedAccountMed25519.ed25519);
    }

    public static MuxedAccountMed25519 decode(XdrDataInputStream stream) throws IOException {
      MuxedAccountMed25519 decodedMuxedAccountMed25519 = new MuxedAccountMed25519();
      decodedMuxedAccountMed25519.id = Uint64.decode(stream);
      decodedMuxedAccountMed25519.ed25519 = Uint256.decode(stream);
      return decodedMuxedAccountMed25519;
    }

    public Uint64 getId() {
      return this.id;
    }

    public void setId(Uint64 value) {
      this.id = value;
    }

    public Uint256 getEd25519() {
      return this.ed25519;
    }

    public void setEd25519(Uint256 value) {
      this.ed25519 = value;
    }

    public void encode(XdrDataOutputStream stream) throws IOException {
      encode(stream, this);
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(this.id, this.ed25519);
    }

    @Override
    public boolean equals(Object object) {
      if (object == null || !(object instanceof MuxedAccountMed25519)) {
        return false;
      }

      MuxedAccountMed25519 other = (MuxedAccountMed25519) object;
      return Objects.equal(this.id, other.id) && Objects.equal(this.ed25519, other.ed25519);
    }
  }
}