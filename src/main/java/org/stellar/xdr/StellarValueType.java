// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.IOException;

// === xdr source ============================================================

//  enum StellarValueType
//  {
//      STELLAR_VALUE_BASIC = 0,
//      STELLAR_VALUE_SIGNED = 1
//  };

//  ===========================================================================
public enum StellarValueType implements XdrElement {
  STELLAR_VALUE_BASIC(0),
  STELLAR_VALUE_SIGNED(1),
  ;
  private final int mValue;

  StellarValueType(int value) {
    mValue = value;
  }

  public static StellarValueType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return STELLAR_VALUE_BASIC;
      case 1:
        return STELLAR_VALUE_SIGNED;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, StellarValueType value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public int getValue() {
    return mValue;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
