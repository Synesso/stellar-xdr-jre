// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.IOException;

// === xdr source ============================================================

//  enum LedgerEntryType
//  {
//      ACCOUNT = 0,
//      TRUSTLINE = 1,
//      OFFER = 2,
//      DATA = 3,
//      CLAIMABLE_BALANCE = 4
//  };

//  ===========================================================================
public enum LedgerEntryType implements XdrElement {
  ACCOUNT(0),
  TRUSTLINE(1),
  OFFER(2),
  DATA(3),
  CLAIMABLE_BALANCE(4),
  ;
  private final int mValue;

  LedgerEntryType(int value) {
    mValue = value;
  }

  public static LedgerEntryType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return ACCOUNT;
      case 1:
        return TRUSTLINE;
      case 2:
        return OFFER;
      case 3:
        return DATA;
      case 4:
        return CLAIMABLE_BALANCE;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, LedgerEntryType value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public int getValue() {
    return mValue;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
