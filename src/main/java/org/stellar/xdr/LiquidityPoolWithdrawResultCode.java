// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;


import java.io.IOException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import okio.ByteString;

// === xdr source ============================================================

//  enum LiquidityPoolWithdrawResultCode
//  {
//      // codes considered as "success" for the operation
//      LIQUIDITY_POOL_WITHDRAW_SUCCESS = 0,
//
//      // codes considered as "failure" for the operation
//      LIQUIDITY_POOL_WITHDRAW_MALFORMED = -1,      // bad input
//      LIQUIDITY_POOL_WITHDRAW_NO_TRUST = -2,       // no trust line for one of the
//                                                   // assets
//      LIQUIDITY_POOL_WITHDRAW_UNDERFUNDED = -3,    // not enough balance of the
//                                                   // pool share
//      LIQUIDITY_POOL_WITHDRAW_LINE_FULL = -4,      // would go above limit for one
//                                                   // of the assets
//      LIQUIDITY_POOL_WITHDRAW_UNDER_MINIMUM = -5   // didn't withdraw enough
//  };

//  ===========================================================================
public enum LiquidityPoolWithdrawResultCode implements XdrElement {
  LIQUIDITY_POOL_WITHDRAW_SUCCESS(0),
  LIQUIDITY_POOL_WITHDRAW_MALFORMED(-1),
  LIQUIDITY_POOL_WITHDRAW_NO_TRUST(-2),
  LIQUIDITY_POOL_WITHDRAW_UNDERFUNDED(-3),
  LIQUIDITY_POOL_WITHDRAW_LINE_FULL(-4),
  LIQUIDITY_POOL_WITHDRAW_UNDER_MINIMUM(-5),
  ;
  private int mValue;

  LiquidityPoolWithdrawResultCode(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  public static LiquidityPoolWithdrawResultCode decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static LiquidityPoolWithdrawResultCode decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return LIQUIDITY_POOL_WITHDRAW_SUCCESS;
      case -1: return LIQUIDITY_POOL_WITHDRAW_MALFORMED;
      case -2: return LIQUIDITY_POOL_WITHDRAW_NO_TRUST;
      case -3: return LIQUIDITY_POOL_WITHDRAW_UNDERFUNDED;
      case -4: return LIQUIDITY_POOL_WITHDRAW_LINE_FULL;
      case -5: return LIQUIDITY_POOL_WITHDRAW_UNDER_MINIMUM;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, LiquidityPoolWithdrawResultCode value) throws IOException {
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
