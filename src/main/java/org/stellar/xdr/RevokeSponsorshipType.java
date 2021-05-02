// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  enum RevokeSponsorshipType
//  {
//      REVOKE_SPONSORSHIP_LEDGER_ENTRY = 0,
//      REVOKE_SPONSORSHIP_SIGNER = 1
//  };

//  ===========================================================================
public enum RevokeSponsorshipType implements XdrElement {
  REVOKE_SPONSORSHIP_LEDGER_ENTRY(0),
  REVOKE_SPONSORSHIP_SIGNER(1),
  ;
  private int mValue;

  RevokeSponsorshipType(int value) {
    mValue = value;
  }

  public static RevokeSponsorshipType decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static RevokeSponsorshipType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return REVOKE_SPONSORSHIP_LEDGER_ENTRY;
      case 1:
        return REVOKE_SPONSORSHIP_SIGNER;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, RevokeSponsorshipType value) throws IOException {
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
