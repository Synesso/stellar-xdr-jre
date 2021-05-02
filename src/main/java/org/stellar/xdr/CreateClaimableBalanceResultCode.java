// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  enum CreateClaimableBalanceResultCode
//  {
//      CREATE_CLAIMABLE_BALANCE_SUCCESS = 0,
//      CREATE_CLAIMABLE_BALANCE_MALFORMED = -1,
//      CREATE_CLAIMABLE_BALANCE_LOW_RESERVE = -2,
//      CREATE_CLAIMABLE_BALANCE_NO_TRUST = -3,
//      CREATE_CLAIMABLE_BALANCE_NOT_AUTHORIZED = -4,
//      CREATE_CLAIMABLE_BALANCE_UNDERFUNDED = -5
//  };

//  ===========================================================================
public enum CreateClaimableBalanceResultCode implements XdrElement {
  CREATE_CLAIMABLE_BALANCE_SUCCESS(0),
  CREATE_CLAIMABLE_BALANCE_MALFORMED(-1),
  CREATE_CLAIMABLE_BALANCE_LOW_RESERVE(-2),
  CREATE_CLAIMABLE_BALANCE_NO_TRUST(-3),
  CREATE_CLAIMABLE_BALANCE_NOT_AUTHORIZED(-4),
  CREATE_CLAIMABLE_BALANCE_UNDERFUNDED(-5),
  ;
  private int mValue;

  CreateClaimableBalanceResultCode(int value) {
    mValue = value;
  }

  public static CreateClaimableBalanceResultCode decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static CreateClaimableBalanceResultCode decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return CREATE_CLAIMABLE_BALANCE_SUCCESS;
      case -1:
        return CREATE_CLAIMABLE_BALANCE_MALFORMED;
      case -2:
        return CREATE_CLAIMABLE_BALANCE_LOW_RESERVE;
      case -3:
        return CREATE_CLAIMABLE_BALANCE_NO_TRUST;
      case -4:
        return CREATE_CLAIMABLE_BALANCE_NOT_AUTHORIZED;
      case -5:
        return CREATE_CLAIMABLE_BALANCE_UNDERFUNDED;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, CreateClaimableBalanceResultCode value) throws IOException {
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
