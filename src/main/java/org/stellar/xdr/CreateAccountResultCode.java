// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.IOException;

// === xdr source ============================================================

//  enum CreateAccountResultCode
//  {
//      // codes considered as "success" for the operation
//      CREATE_ACCOUNT_SUCCESS = 0, // account was created
//  
//      // codes considered as "failure" for the operation
//      CREATE_ACCOUNT_MALFORMED = -1,   // invalid destination
//      CREATE_ACCOUNT_UNDERFUNDED = -2, // not enough funds in source account
//      CREATE_ACCOUNT_LOW_RESERVE =
//          -3, // would create an account below the min reserve
//      CREATE_ACCOUNT_ALREADY_EXIST = -4 // account already exists
//  };

//  ===========================================================================
public enum CreateAccountResultCode implements XdrElement {
  CREATE_ACCOUNT_SUCCESS(0),
  CREATE_ACCOUNT_MALFORMED(-1),
  CREATE_ACCOUNT_UNDERFUNDED(-2),
  CREATE_ACCOUNT_LOW_RESERVE(-3),
  CREATE_ACCOUNT_ALREADY_EXIST(-4),
  ;
  private final int mValue;

  CreateAccountResultCode(int value) {
    mValue = value;
  }

  public static CreateAccountResultCode decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return CREATE_ACCOUNT_SUCCESS;
      case -1:
        return CREATE_ACCOUNT_MALFORMED;
      case -2:
        return CREATE_ACCOUNT_UNDERFUNDED;
      case -3:
        return CREATE_ACCOUNT_LOW_RESERVE;
      case -4:
        return CREATE_ACCOUNT_ALREADY_EXIST;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, CreateAccountResultCode value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public int getValue() {
    return mValue;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}