// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  enum AccountFlags
//  { // masks for each flag
//
//      // Flags set on issuer accounts
//      // TrustLines are created with authorized set to "false" requiring
//      // the issuer to set it for each TrustLine
//      AUTH_REQUIRED_FLAG = 0x1,
//      // If set, the authorized flag in TrustLines can be cleared
//      // otherwise, authorization cannot be revoked
//      AUTH_REVOCABLE_FLAG = 0x2,
//      // Once set, causes all AUTH_* flags to be read-only
//      AUTH_IMMUTABLE_FLAG = 0x4,
//      // Trustlines are created with clawback enabled set to "true",
//      // and claimable balances created from those trustlines are created
//      // with clawback enabled set to "true"
//      AUTH_CLAWBACK_ENABLED_FLAG = 0x8
//  };

//  ===========================================================================
public enum AccountFlags implements XdrElement {
  AUTH_REQUIRED_FLAG(1),
  AUTH_REVOCABLE_FLAG(2),
  AUTH_IMMUTABLE_FLAG(4),
  AUTH_CLAWBACK_ENABLED_FLAG(8),
  ;
  private int mValue;

  AccountFlags(int value) {
    mValue = value;
  }

  public static AccountFlags decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static AccountFlags decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 1:
        return AUTH_REQUIRED_FLAG;
      case 2:
        return AUTH_REVOCABLE_FLAG;
      case 4:
        return AUTH_IMMUTABLE_FLAG;
      case 8:
        return AUTH_CLAWBACK_ENABLED_FLAG;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, AccountFlags value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public int getValue() {
    return mValue;
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

}
