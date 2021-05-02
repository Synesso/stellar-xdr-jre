// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct TransactionSignaturePayload
//  {
//      Hash networkId;
//      union switch (EnvelopeType type)
//      {
//      // Backwards Compatibility: Use ENVELOPE_TYPE_TX to sign ENVELOPE_TYPE_TX_V0
//      case ENVELOPE_TYPE_TX:
//          Transaction tx;
//      case ENVELOPE_TYPE_TX_FEE_BUMP:
//          FeeBumpTransaction feeBump;
//      }
//      taggedTransaction;
//  };

//  ===========================================================================
public class TransactionSignaturePayload implements XdrElement {
  private Hash networkId;
  private TransactionSignaturePayloadTaggedTransaction taggedTransaction;

  public TransactionSignaturePayload() {
  }

  public static void encode(
      XdrDataOutputStream stream,
      TransactionSignaturePayload encodedTransactionSignaturePayload
  ) throws IOException {
    Hash.encode(stream, encodedTransactionSignaturePayload.networkId);
    TransactionSignaturePayloadTaggedTransaction.encode(stream, encodedTransactionSignaturePayload.taggedTransaction);
  }

  public static TransactionSignaturePayload decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static TransactionSignaturePayload decode(XdrDataInputStream stream) throws IOException {
    TransactionSignaturePayload decodedTransactionSignaturePayload = new TransactionSignaturePayload();
    decodedTransactionSignaturePayload.networkId = Hash.decode(stream);
    decodedTransactionSignaturePayload.taggedTransaction = TransactionSignaturePayloadTaggedTransaction.decode(stream);
    return decodedTransactionSignaturePayload;
  }

  public Hash getNetworkId() {
    return this.networkId;
  }

  public void setNetworkId(Hash value) {
    this.networkId = value;
  }

  public TransactionSignaturePayloadTaggedTransaction getTaggedTransaction() {
    return this.taggedTransaction;
  }

  public void setTaggedTransaction(TransactionSignaturePayloadTaggedTransaction value) {
    this.taggedTransaction = value;
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

  @Override
  public int hashCode() {
    return Objects.hashCode(this.networkId, this.taggedTransaction);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof TransactionSignaturePayload)) {
      return false;
    }

    TransactionSignaturePayload other = (TransactionSignaturePayload) object;
    return Objects.equal(this.networkId, other.networkId) && Objects
        .equal(this.taggedTransaction, other.taggedTransaction);
  }

  public static final class Builder {
    private Hash networkId;
    private TransactionSignaturePayloadTaggedTransaction taggedTransaction;

    public Builder networkId(Hash networkId) {
      this.networkId = networkId;
      return this;
    }

    public Builder taggedTransaction(TransactionSignaturePayloadTaggedTransaction taggedTransaction) {
      this.taggedTransaction = taggedTransaction;
      return this;
    }

    public TransactionSignaturePayload build() {
      TransactionSignaturePayload val = new TransactionSignaturePayload();
      val.setNetworkId(networkId);
      val.setTaggedTransaction(taggedTransaction);
      return val;
    }
  }

  public static class TransactionSignaturePayloadTaggedTransaction {
    EnvelopeType type;
    private Transaction tx;
    private FeeBumpTransaction feeBump;

    public TransactionSignaturePayloadTaggedTransaction() {
    }

    public static void encode(
        XdrDataOutputStream stream,
        TransactionSignaturePayloadTaggedTransaction encodedTransactionSignaturePayloadTaggedTransaction
    ) throws IOException {
      //Xdrgen::AST::Identifier
      //EnvelopeType
      stream.writeInt(encodedTransactionSignaturePayloadTaggedTransaction.getDiscriminant().getValue());
      switch (encodedTransactionSignaturePayloadTaggedTransaction.getDiscriminant()) {
        case ENVELOPE_TYPE_TX:
          Transaction.encode(stream, encodedTransactionSignaturePayloadTaggedTransaction.tx);
          break;
        case ENVELOPE_TYPE_TX_FEE_BUMP:
          FeeBumpTransaction.encode(stream, encodedTransactionSignaturePayloadTaggedTransaction.feeBump);
          break;
      }
    }

    public static TransactionSignaturePayloadTaggedTransaction decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static TransactionSignaturePayloadTaggedTransaction decode(XdrDataInputStream stream) throws IOException {
      TransactionSignaturePayloadTaggedTransaction decodedTransactionSignaturePayloadTaggedTransaction =
          new TransactionSignaturePayloadTaggedTransaction();
      EnvelopeType discriminant = EnvelopeType.decode(stream);
      decodedTransactionSignaturePayloadTaggedTransaction.setDiscriminant(discriminant);
      switch (decodedTransactionSignaturePayloadTaggedTransaction.getDiscriminant()) {
        case ENVELOPE_TYPE_TX:
          decodedTransactionSignaturePayloadTaggedTransaction.tx = Transaction.decode(stream);
          break;
        case ENVELOPE_TYPE_TX_FEE_BUMP:
          decodedTransactionSignaturePayloadTaggedTransaction.feeBump = FeeBumpTransaction.decode(stream);
          break;
      }
      return decodedTransactionSignaturePayloadTaggedTransaction;
    }

    public EnvelopeType getDiscriminant() {
      return this.type;
    }

    public void setDiscriminant(EnvelopeType value) {
      this.type = value;
    }

    public Transaction getTx() {
      return this.tx;
    }

    public void setTx(Transaction value) {
      this.tx = value;
    }

    public FeeBumpTransaction getFeeBump() {
      return this.feeBump;
    }

    public void setFeeBump(FeeBumpTransaction value) {
      this.feeBump = value;
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

    @Override
    public int hashCode() {
      return Objects.hashCode(this.tx, this.feeBump, this.type);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof TransactionSignaturePayloadTaggedTransaction)) {
        return false;
      }

      TransactionSignaturePayloadTaggedTransaction other = (TransactionSignaturePayloadTaggedTransaction) object;
      return Objects.equal(this.tx, other.tx) && Objects.equal(this.feeBump, other.feeBump) && Objects
          .equal(this.type, other.type);
    }

    public static final class Builder {
      private EnvelopeType discriminant;
      private Transaction tx;
      private FeeBumpTransaction feeBump;

      public Builder discriminant(EnvelopeType discriminant) {
        this.discriminant = discriminant;
        return this;
      }

      public Builder tx(Transaction tx) {
        this.tx = tx;
        return this;
      }

      public Builder feeBump(FeeBumpTransaction feeBump) {
        this.feeBump = feeBump;
        return this;
      }

      public TransactionSignaturePayloadTaggedTransaction build() {
        TransactionSignaturePayloadTaggedTransaction val = new TransactionSignaturePayloadTaggedTransaction();
        val.setDiscriminant(discriminant);
        val.setTx(tx);
        val.setFeeBump(feeBump);
        return val;
      }
    }

  }
}
