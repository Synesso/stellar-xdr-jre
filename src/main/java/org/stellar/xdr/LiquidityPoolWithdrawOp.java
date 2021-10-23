// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;


import java.io.IOException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import okio.ByteString;
import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct LiquidityPoolWithdrawOp
//  {
//      PoolID liquidityPoolID;
//      int64 amount;         // amount of pool shares to withdraw
//      int64 minAmountA;     // minimum amount of first asset to withdraw
//      int64 minAmountB;     // minimum amount of second asset to withdraw
//  };

//  ===========================================================================
public class LiquidityPoolWithdrawOp implements XdrElement {
  public LiquidityPoolWithdrawOp () {}
  private PoolID liquidityPoolID;
  public PoolID getLiquidityPoolID() {
    return this.liquidityPoolID;
  }
  public void setLiquidityPoolID(PoolID value) {
    this.liquidityPoolID = value;
  }
  private Int64 amount;
  public Int64 getAmount() {
    return this.amount;
  }
  public void setAmount(Int64 value) {
    this.amount = value;
  }
  private Int64 minAmountA;
  public Int64 getMinAmountA() {
    return this.minAmountA;
  }
  public void setMinAmountA(Int64 value) {
    this.minAmountA = value;
  }
  private Int64 minAmountB;
  public Int64 getMinAmountB() {
    return this.minAmountB;
  }
  public void setMinAmountB(Int64 value) {
    this.minAmountB = value;
  }
  public static void encode(XdrDataOutputStream stream, LiquidityPoolWithdrawOp encodedLiquidityPoolWithdrawOp) throws IOException{
    PoolID.encode(stream, encodedLiquidityPoolWithdrawOp.liquidityPoolID);
    Int64.encode(stream, encodedLiquidityPoolWithdrawOp.amount);
    Int64.encode(stream, encodedLiquidityPoolWithdrawOp.minAmountA);
    Int64.encode(stream, encodedLiquidityPoolWithdrawOp.minAmountB);
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
  public static LiquidityPoolWithdrawOp decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static LiquidityPoolWithdrawOp decode(XdrDataInputStream stream) throws IOException {
    LiquidityPoolWithdrawOp decodedLiquidityPoolWithdrawOp = new LiquidityPoolWithdrawOp();
    decodedLiquidityPoolWithdrawOp.liquidityPoolID = PoolID.decode(stream);
    decodedLiquidityPoolWithdrawOp.amount = Int64.decode(stream);
    decodedLiquidityPoolWithdrawOp.minAmountA = Int64.decode(stream);
    decodedLiquidityPoolWithdrawOp.minAmountB = Int64.decode(stream);
    return decodedLiquidityPoolWithdrawOp;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.liquidityPoolID, this.amount, this.minAmountA, this.minAmountB);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof LiquidityPoolWithdrawOp)) {
      return false;
    }

    LiquidityPoolWithdrawOp other = (LiquidityPoolWithdrawOp) object;
    return Objects.equal(this.liquidityPoolID, other.liquidityPoolID) && Objects.equal(this.amount, other.amount) && Objects.equal(this.minAmountA, other.minAmountA) && Objects.equal(this.minAmountB, other.minAmountB);
  }

  public static final class Builder {
    private PoolID liquidityPoolID;
    private Int64 amount;
    private Int64 minAmountA;
    private Int64 minAmountB;

    public Builder liquidityPoolID(PoolID liquidityPoolID) {
      this.liquidityPoolID = liquidityPoolID;
      return this;
    }

    public Builder amount(Int64 amount) {
      this.amount = amount;
      return this;
    }

    public Builder minAmountA(Int64 minAmountA) {
      this.minAmountA = minAmountA;
      return this;
    }

    public Builder minAmountB(Int64 minAmountB) {
      this.minAmountB = minAmountB;
      return this;
    }

    public LiquidityPoolWithdrawOp build() {
      LiquidityPoolWithdrawOp val = new LiquidityPoolWithdrawOp();
      val.setLiquidityPoolID(liquidityPoolID);
      val.setAmount(amount);
      val.setMinAmountA(minAmountA);
      val.setMinAmountB(minAmountB);
      return val;
    }
  }
}
