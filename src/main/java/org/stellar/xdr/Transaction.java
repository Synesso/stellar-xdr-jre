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

//  struct Transaction
//  {
//      // account used to run the transaction
//      MuxedAccount sourceAccount;
//
//      // the fee the sourceAccount will pay
//      uint32 fee;
//
//      // sequence number to consume in the account
//      SequenceNumber seqNum;
//
//      // validity range (inclusive) for the last ledger close time
//      TimeBounds* timeBounds;
//
//      Memo memo;
//
//      Operation operations<MAX_OPS_PER_TX>;
//
//      // reserved for future use
//      union switch (int v)
//      {
//      case 0:
//          void;
//      }
//      ext;
//  };

//  ===========================================================================
public class Transaction implements XdrElement {
  private MuxedAccount sourceAccount;
  private Uint32 fee;
  private SequenceNumber seqNum;
  private TimeBounds timeBounds;
  private Memo memo;
  private Operation[] operations;
  private TransactionExt ext;

  public Transaction() {
  }

  public static void encode(XdrDataOutputStream stream, Transaction encodedTransaction) throws IOException {
    MuxedAccount.encode(stream, encodedTransaction.sourceAccount);
    Uint32.encode(stream, encodedTransaction.fee);
    SequenceNumber.encode(stream, encodedTransaction.seqNum);
    if (encodedTransaction.timeBounds != null) {
      stream.writeInt(1);
      TimeBounds.encode(stream, encodedTransaction.timeBounds);
    } else {
      stream.writeInt(0);
    }
    Memo.encode(stream, encodedTransaction.memo);
    int operationssize = encodedTransaction.getOperations().length;
    stream.writeInt(operationssize);
    for (int i = 0; i < operationssize; i++) {
      Operation.encode(stream, encodedTransaction.operations[i]);
    }
    TransactionExt.encode(stream, encodedTransaction.ext);
  }

  public static Transaction decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static Transaction decode(XdrDataInputStream stream) throws IOException {
    Transaction decodedTransaction = new Transaction();
    decodedTransaction.sourceAccount = MuxedAccount.decode(stream);
    decodedTransaction.fee = Uint32.decode(stream);
    decodedTransaction.seqNum = SequenceNumber.decode(stream);
    int timeBoundsPresent = stream.readInt();
    if (timeBoundsPresent != 0) {
      decodedTransaction.timeBounds = TimeBounds.decode(stream);
    }
    decodedTransaction.memo = Memo.decode(stream);
    int operationssize = stream.readInt();
    decodedTransaction.operations = new Operation[operationssize];
    for (int i = 0; i < operationssize; i++) {
      decodedTransaction.operations[i] = Operation.decode(stream);
    }
    decodedTransaction.ext = TransactionExt.decode(stream);
    return decodedTransaction;
  }

  public MuxedAccount getSourceAccount() {
    return this.sourceAccount;
  }

  public void setSourceAccount(MuxedAccount value) {
    this.sourceAccount = value;
  }

  public Uint32 getFee() {
    return this.fee;
  }

  public void setFee(Uint32 value) {
    this.fee = value;
  }

  public SequenceNumber getSeqNum() {
    return this.seqNum;
  }

  public void setSeqNum(SequenceNumber value) {
    this.seqNum = value;
  }

  public TimeBounds getTimeBounds() {
    return this.timeBounds;
  }

  public void setTimeBounds(TimeBounds value) {
    this.timeBounds = value;
  }

  public Memo getMemo() {
    return this.memo;
  }

  public void setMemo(Memo value) {
    this.memo = value;
  }

  public Operation[] getOperations() {
    return this.operations;
  }

  public void setOperations(Operation[] value) {
    this.operations = value;
  }

  public TransactionExt getExt() {
    return this.ext;
  }

  public void setExt(TransactionExt value) {
    this.ext = value;
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
    return Objects.hashCode(this.sourceAccount, this.fee, this.seqNum, this.timeBounds, this.memo,
        Arrays.hashCode(this.operations), this.ext);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof Transaction)) {
      return false;
    }

    Transaction other = (Transaction) object;
    return Objects.equal(this.sourceAccount, other.sourceAccount)
        && Objects.equal(this.fee, other.fee)
        && Objects.equal(this.seqNum, other.seqNum)
        && Objects.equal(this.timeBounds, other.timeBounds)
        && Objects.equal(this.memo, other.memo)
        && Arrays.equals(this.operations, other.operations)
        && Objects.equal(this.ext, other.ext);
  }

  public static class TransactionExt {
    Integer v;

    public TransactionExt() {
    }

    public static void encode(XdrDataOutputStream stream, TransactionExt encodedTransactionExt) throws IOException {
      //Xdrgen::AST::Typespecs::Int
      //Integer
      stream.writeInt(encodedTransactionExt.getDiscriminant().intValue());
      switch (encodedTransactionExt.getDiscriminant()) {
        case 0:
          break;
      }
    }

    public static TransactionExt decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static TransactionExt decode(XdrDataInputStream stream) throws IOException {
      TransactionExt decodedTransactionExt = new TransactionExt();
      Integer discriminant = stream.readInt();
      decodedTransactionExt.setDiscriminant(discriminant);
      switch (decodedTransactionExt.getDiscriminant()) {
        case 0:
          break;
      }
      return decodedTransactionExt;
    }

    public Integer getDiscriminant() {
      return this.v;
    }

    public void setDiscriminant(Integer value) {
      this.v = value;
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
      return Objects.hashCode(this.v);
    }

    @Override
    public boolean equals(Object object) {
      if (object == null || !(object instanceof TransactionExt)) {
        return false;
      }

      TransactionExt other = (TransactionExt) object;
      return Objects.equal(this.v, other.v);
    }
  }
}
