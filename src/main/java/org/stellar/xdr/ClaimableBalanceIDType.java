// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  enum ClaimableBalanceIDType
//  {
//      CLAIMABLE_BALANCE_ID_TYPE_V0 = 0
//  };

//  ===========================================================================
public enum ClaimableBalanceIDType implements XdrElement {
  CLAIMABLE_BALANCE_ID_TYPE_V0(0),
  ;
  private int mValue;

  ClaimableBalanceIDType(int value) {
    mValue = value;
  }

  public int getValue() {
    return mValue;
  }

  public static ClaimableBalanceIDType decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static ClaimableBalanceIDType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return CLAIMABLE_BALANCE_ID_TYPE_V0;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, ClaimableBalanceIDType value) throws IOException {
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
