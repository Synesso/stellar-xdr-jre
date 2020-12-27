// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.IOException;

// === xdr source ============================================================

//  enum TrustLineFlags
//  {
//      // issuer has authorized account to perform transactions with its credit
//      AUTHORIZED_FLAG = 1,
//      // issuer has authorized account to maintain and reduce liabilities for its
//      // credit
//      AUTHORIZED_TO_MAINTAIN_LIABILITIES_FLAG = 2
//  };

//  ===========================================================================
public enum TrustLineFlags implements XdrElement {
  AUTHORIZED_FLAG(1),
  AUTHORIZED_TO_MAINTAIN_LIABILITIES_FLAG(2),
  ;
  private final int mValue;

  TrustLineFlags(int value) {
    mValue = value;
  }

  public static TrustLineFlags decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 1:
        return AUTHORIZED_FLAG;
      case 2:
        return AUTHORIZED_TO_MAINTAIN_LIABILITIES_FLAG;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, TrustLineFlags value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public int getValue() {
    return mValue;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
