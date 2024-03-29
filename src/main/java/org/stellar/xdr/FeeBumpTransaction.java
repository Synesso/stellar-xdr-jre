// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct FeeBumpTransaction
//  {
//      MuxedAccount feeSource;
//      int64 fee;
//      union switch (EnvelopeType type)
//      {
//      case ENVELOPE_TYPE_TX:
//          TransactionV1Envelope v1;
//      }
//      innerTx;
//      union switch (int v)
//      {
//      case 0:
//          void;
//      }
//      ext;
//  };

//  ===========================================================================
public class FeeBumpTransaction implements XdrElement {
  public FeeBumpTransaction() {
  }
  private MuxedAccount feeSource;
  public MuxedAccount getFeeSource() {
    return this.feeSource;
  }
  public void setFeeSource(MuxedAccount value) {
    this.feeSource = value;
  }

  private Int64 fee;
  public Int64 getFee() {
    return this.fee;
  }
  public void setFee(Int64 value) {
    this.fee = value;
  }

  private FeeBumpTransactionInnerTx innerTx;
  public FeeBumpTransactionInnerTx getInnerTx() {
    return this.innerTx;
  }

  public void setInnerTx(FeeBumpTransactionInnerTx value) {
    this.innerTx = value;
  }

  private FeeBumpTransactionExt ext;

  public FeeBumpTransactionExt getExt() {
    return this.ext;
  }

  public void setExt(FeeBumpTransactionExt value) {
    this.ext = value;
  }

  public static void encode(
      XdrDataOutputStream stream,
      FeeBumpTransaction encodedFeeBumpTransaction
  ) throws IOException {
    MuxedAccount.encode(stream, encodedFeeBumpTransaction.feeSource);
    Int64.encode(stream, encodedFeeBumpTransaction.fee);
    FeeBumpTransactionInnerTx.encode(stream, encodedFeeBumpTransaction.innerTx);
    FeeBumpTransactionExt.encode(stream, encodedFeeBumpTransaction.ext);
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

  public static FeeBumpTransaction decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static FeeBumpTransaction decode(XdrDataInputStream stream) throws IOException {
    FeeBumpTransaction decodedFeeBumpTransaction = new FeeBumpTransaction();
    decodedFeeBumpTransaction.feeSource = MuxedAccount.decode(stream);
    decodedFeeBumpTransaction.fee = Int64.decode(stream);
    decodedFeeBumpTransaction.innerTx = FeeBumpTransactionInnerTx.decode(stream);
    decodedFeeBumpTransaction.ext = FeeBumpTransactionExt.decode(stream);
    return decodedFeeBumpTransaction;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.feeSource, this.fee, this.innerTx, this.ext);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof FeeBumpTransaction)) {
      return false;
    }

    FeeBumpTransaction other = (FeeBumpTransaction) object;
    return Objects.equal(this.feeSource, other.feeSource) && Objects.equal(this.fee, other.fee) && Objects
        .equal(this.innerTx, other.innerTx) && Objects.equal(this.ext, other.ext);
  }

  public static final class Builder {
    private MuxedAccount feeSource;
    private Int64 fee;
    private FeeBumpTransactionInnerTx innerTx;
    private FeeBumpTransactionExt ext;

    public Builder feeSource(MuxedAccount feeSource) {
      this.feeSource = feeSource;
      return this;
    }

    public Builder fee(Int64 fee) {
      this.fee = fee;
      return this;
    }

    public Builder innerTx(FeeBumpTransactionInnerTx innerTx) {
      this.innerTx = innerTx;
      return this;
    }

    public Builder ext(FeeBumpTransactionExt ext) {
      this.ext = ext;
      return this;
    }

    public FeeBumpTransaction build() {
      FeeBumpTransaction val = new FeeBumpTransaction();
      val.setFeeSource(feeSource);
      val.setFee(fee);
      val.setInnerTx(innerTx);
      val.setExt(ext);
      return val;
    }
  }

  public static class FeeBumpTransactionInnerTx {
    public FeeBumpTransactionInnerTx() {
    }

    EnvelopeType type;

    public EnvelopeType getDiscriminant() {
      return this.type;
    }

    public void setDiscriminant(EnvelopeType value) {
      this.type = value;
    }

    private TransactionV1Envelope v1;

    public TransactionV1Envelope getV1() {
      return this.v1;
    }

    public void setV1(TransactionV1Envelope value) {
      this.v1 = value;
    }

    public static final class Builder {
      private EnvelopeType discriminant;
      private TransactionV1Envelope v1;

      public Builder discriminant(EnvelopeType discriminant) {
        this.discriminant = discriminant;
        return this;
      }

      public Builder v1(TransactionV1Envelope v1) {
        this.v1 = v1;
        return this;
      }

      public FeeBumpTransactionInnerTx build() {
        FeeBumpTransactionInnerTx val = new FeeBumpTransactionInnerTx();
        val.setDiscriminant(discriminant);
        val.setV1(v1);
        return val;
      }
    }

    public static void encode(
        XdrDataOutputStream stream,
        FeeBumpTransactionInnerTx encodedFeeBumpTransactionInnerTx
    ) throws IOException {
      //Xdrgen::AST::Identifier
      //EnvelopeType
      stream.writeInt(encodedFeeBumpTransactionInnerTx.getDiscriminant().getValue());
      switch (encodedFeeBumpTransactionInnerTx.getDiscriminant()) {
        case ENVELOPE_TYPE_TX:
          TransactionV1Envelope.encode(stream, encodedFeeBumpTransactionInnerTx.v1);
          break;
      }
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

    public static FeeBumpTransactionInnerTx decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static FeeBumpTransactionInnerTx decode(XdrDataInputStream stream) throws IOException {
      FeeBumpTransactionInnerTx decodedFeeBumpTransactionInnerTx = new FeeBumpTransactionInnerTx();
      EnvelopeType discriminant = EnvelopeType.decode(stream);
      decodedFeeBumpTransactionInnerTx.setDiscriminant(discriminant);
      switch (decodedFeeBumpTransactionInnerTx.getDiscriminant()) {
        case ENVELOPE_TYPE_TX:
          decodedFeeBumpTransactionInnerTx.v1 = TransactionV1Envelope.decode(stream);
          break;
      }
      return decodedFeeBumpTransactionInnerTx;
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(this.v1, this.type);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof FeeBumpTransactionInnerTx)) {
        return false;
      }

      FeeBumpTransactionInnerTx other = (FeeBumpTransactionInnerTx) object;
      return Objects.equal(this.v1, other.v1) && Objects.equal(this.type, other.type);
    }

  }

  public static class FeeBumpTransactionExt {
    public FeeBumpTransactionExt() {
    }

    Integer v;

    public Integer getDiscriminant() {
      return this.v;
    }

    public void setDiscriminant(Integer value) {
      this.v = value;
    }

    public static final class Builder {
      private Integer discriminant;

      public Builder discriminant(Integer discriminant) {
        this.discriminant = discriminant;
        return this;
      }

      public FeeBumpTransactionExt build() {
        FeeBumpTransactionExt val = new FeeBumpTransactionExt();
        val.setDiscriminant(discriminant);
        return val;
      }
    }

    public static void encode(
        XdrDataOutputStream stream,
        FeeBumpTransactionExt encodedFeeBumpTransactionExt
    ) throws IOException {
      //Xdrgen::AST::Typespecs::Int
      //Integer
      stream.writeInt(encodedFeeBumpTransactionExt.getDiscriminant().intValue());
      switch (encodedFeeBumpTransactionExt.getDiscriminant()) {
        case 0:
          break;
      }
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

    public static FeeBumpTransactionExt decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static FeeBumpTransactionExt decode(XdrDataInputStream stream) throws IOException {
      FeeBumpTransactionExt decodedFeeBumpTransactionExt = new FeeBumpTransactionExt();
      Integer discriminant = stream.readInt();
      decodedFeeBumpTransactionExt.setDiscriminant(discriminant);
      switch (decodedFeeBumpTransactionExt.getDiscriminant()) {
        case 0:
          break;
      }
      return decodedFeeBumpTransactionExt;
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(this.v);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof FeeBumpTransactionExt)) {
        return false;
      }

      FeeBumpTransactionExt other = (FeeBumpTransactionExt) object;
      return Objects.equal(this.v, other.v);
    }

  }
}
