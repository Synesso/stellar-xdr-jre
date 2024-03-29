// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  enum AccountMergeResultCode
//  {
//      // codes considered as "success" for the operation
//      ACCOUNT_MERGE_SUCCESS = 0,
//      // codes considered as "failure" for the operation
//      ACCOUNT_MERGE_MALFORMED = -1,       // can't merge onto itself
//      ACCOUNT_MERGE_NO_ACCOUNT = -2,      // destination does not exist
//      ACCOUNT_MERGE_IMMUTABLE_SET = -3,   // source account has AUTH_IMMUTABLE set
//      ACCOUNT_MERGE_HAS_SUB_ENTRIES = -4, // account has trust lines/offers
//      ACCOUNT_MERGE_SEQNUM_TOO_FAR = -5,  // sequence number is over max allowed
//      ACCOUNT_MERGE_DEST_FULL = -6,       // can't add source balance to
//                                          // destination balance
//      ACCOUNT_MERGE_IS_SPONSOR = -7       // can't merge account that is a sponsor
//  };

//  ===========================================================================
public enum AccountMergeResultCode implements XdrElement {
  ACCOUNT_MERGE_SUCCESS(0),
  ACCOUNT_MERGE_MALFORMED(-1),
  ACCOUNT_MERGE_NO_ACCOUNT(-2),
  ACCOUNT_MERGE_IMMUTABLE_SET(-3),
  ACCOUNT_MERGE_HAS_SUB_ENTRIES(-4),
  ACCOUNT_MERGE_SEQNUM_TOO_FAR(-5),
  ACCOUNT_MERGE_DEST_FULL(-6),
  ACCOUNT_MERGE_IS_SPONSOR(-7),
  ;
  private int mValue;

  AccountMergeResultCode(int value) {
    mValue = value;
  }

  public int getValue() {
    return mValue;
  }

  public static AccountMergeResultCode decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static AccountMergeResultCode decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return ACCOUNT_MERGE_SUCCESS;
      case -1:
        return ACCOUNT_MERGE_MALFORMED;
      case -2:
        return ACCOUNT_MERGE_NO_ACCOUNT;
      case -3:
        return ACCOUNT_MERGE_IMMUTABLE_SET;
      case -4:
        return ACCOUNT_MERGE_HAS_SUB_ENTRIES;
      case -5:
        return ACCOUNT_MERGE_SEQNUM_TOO_FAR;
      case -6:
        return ACCOUNT_MERGE_DEST_FULL;
      case -7:
        return ACCOUNT_MERGE_IS_SPONSOR;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, AccountMergeResultCode value) throws IOException {
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
