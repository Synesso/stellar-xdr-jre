// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;


import java.io.IOException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import okio.ByteString;

// === xdr source ============================================================

//  enum ClaimAtomType
//  {
//      CLAIM_ATOM_TYPE_V0 = 0,
//      CLAIM_ATOM_TYPE_ORDER_BOOK = 1,
//      CLAIM_ATOM_TYPE_LIQUIDITY_POOL = 2
//  };

//  ===========================================================================
public enum ClaimAtomType implements XdrElement {
  CLAIM_ATOM_TYPE_V0(0),
  CLAIM_ATOM_TYPE_ORDER_BOOK(1),
  CLAIM_ATOM_TYPE_LIQUIDITY_POOL(2),
  ;
  private int mValue;

  ClaimAtomType(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  public static ClaimAtomType decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static ClaimAtomType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return CLAIM_ATOM_TYPE_V0;
      case 1: return CLAIM_ATOM_TYPE_ORDER_BOOK;
      case 2: return CLAIM_ATOM_TYPE_LIQUIDITY_POOL;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, ClaimAtomType value) throws IOException {
    stream.writeInt(value.getValue());
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
