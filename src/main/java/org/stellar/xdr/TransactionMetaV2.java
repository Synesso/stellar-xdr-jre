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

//  struct TransactionMetaV2
//  {
//      LedgerEntryChanges txChangesBefore; // tx level changes before operations
//                                          // are applied if any
//      OperationMeta operations<>;         // meta for each operation
//      LedgerEntryChanges txChangesAfter;  // tx level changes after operations are
//                                          // applied if any
//  };

//  ===========================================================================
public class TransactionMetaV2 implements XdrElement {
  private LedgerEntryChanges txChangesBefore;
  private OperationMeta[] operations;
  private LedgerEntryChanges txChangesAfter;

  public TransactionMetaV2() {
  }

  public static void encode(XdrDataOutputStream stream, TransactionMetaV2 encodedTransactionMetaV2) throws IOException {
    LedgerEntryChanges.encode(stream, encodedTransactionMetaV2.txChangesBefore);
    int operationssize = encodedTransactionMetaV2.getOperations().length;
    stream.writeInt(operationssize);
    for (int i = 0; i < operationssize; i++) {
      OperationMeta.encode(stream, encodedTransactionMetaV2.operations[i]);
    }
    LedgerEntryChanges.encode(stream, encodedTransactionMetaV2.txChangesAfter);
  }

  public static TransactionMetaV2 decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static TransactionMetaV2 decode(XdrDataInputStream stream) throws IOException {
    TransactionMetaV2 decodedTransactionMetaV2 = new TransactionMetaV2();
    decodedTransactionMetaV2.txChangesBefore = LedgerEntryChanges.decode(stream);
    int operationssize = stream.readInt();
    decodedTransactionMetaV2.operations = new OperationMeta[operationssize];
    for (int i = 0; i < operationssize; i++) {
      decodedTransactionMetaV2.operations[i] = OperationMeta.decode(stream);
    }
    decodedTransactionMetaV2.txChangesAfter = LedgerEntryChanges.decode(stream);
    return decodedTransactionMetaV2;
  }

  public LedgerEntryChanges getTxChangesBefore() {
    return this.txChangesBefore;
  }

  public void setTxChangesBefore(LedgerEntryChanges value) {
    this.txChangesBefore = value;
  }

  public OperationMeta[] getOperations() {
    return this.operations;
  }

  public void setOperations(OperationMeta[] value) {
    this.operations = value;
  }

  public LedgerEntryChanges getTxChangesAfter() {
    return this.txChangesAfter;
  }

  public void setTxChangesAfter(LedgerEntryChanges value) {
    this.txChangesAfter = value;
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
    return Objects.hashCode(this.txChangesBefore, Arrays.hashCode(this.operations), this.txChangesAfter);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof TransactionMetaV2)) {
      return false;
    }

    TransactionMetaV2 other = (TransactionMetaV2) object;
    return Objects.equal(this.txChangesBefore, other.txChangesBefore) && Arrays.equals(this.operations,
        other.operations) && Objects.equal(this.txChangesAfter, other.txChangesAfter);
  }
}
