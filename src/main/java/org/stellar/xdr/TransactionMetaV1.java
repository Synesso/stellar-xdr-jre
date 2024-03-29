// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

// === xdr source ============================================================

//  struct TransactionMetaV1
//  {
//      LedgerEntryChanges txChanges; // tx level changes if any
//      OperationMeta operations<>;   // meta for each operation
//  };

//  ===========================================================================
public class TransactionMetaV1 implements XdrElement {
  public TransactionMetaV1() {
  }

  private LedgerEntryChanges txChanges;

  public LedgerEntryChanges getTxChanges() {
    return this.txChanges;
  }

  public void setTxChanges(LedgerEntryChanges value) {
    this.txChanges = value;
  }

  private OperationMeta[] operations;

  public OperationMeta[] getOperations() {
    return this.operations;
  }

  public void setOperations(OperationMeta[] value) {
    this.operations = value;
  }

  public static void encode(XdrDataOutputStream stream, TransactionMetaV1 encodedTransactionMetaV1) throws IOException {
    LedgerEntryChanges.encode(stream, encodedTransactionMetaV1.txChanges);
    int operationssize = encodedTransactionMetaV1.getOperations().length;
    stream.writeInt(operationssize);
    for (int i = 0; i < operationssize; i++) {
      OperationMeta.encode(stream, encodedTransactionMetaV1.operations[i]);
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

  public static TransactionMetaV1 decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static TransactionMetaV1 decode(XdrDataInputStream stream) throws IOException {
    TransactionMetaV1 decodedTransactionMetaV1 = new TransactionMetaV1();
    decodedTransactionMetaV1.txChanges = LedgerEntryChanges.decode(stream);
    int operationssize = stream.readInt();
    decodedTransactionMetaV1.operations = new OperationMeta[operationssize];
    for (int i = 0; i < operationssize; i++) {
      decodedTransactionMetaV1.operations[i] = OperationMeta.decode(stream);
    }
    return decodedTransactionMetaV1;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.txChanges, Arrays.hashCode(this.operations));
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof TransactionMetaV1)) {
      return false;
    }

    TransactionMetaV1 other = (TransactionMetaV1) object;
    return Objects.equal(this.txChanges, other.txChanges) && Arrays.equals(this.operations, other.operations);
  }

  public static final class Builder {
    private LedgerEntryChanges txChanges;
    private OperationMeta[] operations;

    public Builder txChanges(LedgerEntryChanges txChanges) {
      this.txChanges = txChanges;
      return this;
    }

    public Builder operations(OperationMeta[] operations) {
      this.operations = operations;
      return this;
    }

    public TransactionMetaV1 build() {
      TransactionMetaV1 val = new TransactionMetaV1();
      val.setTxChanges(txChanges);
      val.setOperations(operations);
      return val;
    }
  }
}
