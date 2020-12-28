// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct TransactionHistoryResultEntry
//  {
//      uint32 ledgerSeq;
//      TransactionResultSet txResultSet;
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
public class TransactionHistoryResultEntry implements XdrElement {
  private Uint32 ledgerSeq;
  private TransactionResultSet txResultSet;
  private TransactionHistoryResultEntryExt ext;

  public TransactionHistoryResultEntry() {
  }

  public static void encode(XdrDataOutputStream stream,
      TransactionHistoryResultEntry encodedTransactionHistoryResultEntry) throws IOException {
    Uint32.encode(stream, encodedTransactionHistoryResultEntry.ledgerSeq);
    TransactionResultSet.encode(stream, encodedTransactionHistoryResultEntry.txResultSet);
    TransactionHistoryResultEntryExt.encode(stream, encodedTransactionHistoryResultEntry.ext);
  }

  public static TransactionHistoryResultEntry decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static TransactionHistoryResultEntry decode(XdrDataInputStream stream) throws IOException {
    TransactionHistoryResultEntry decodedTransactionHistoryResultEntry = new TransactionHistoryResultEntry();
    decodedTransactionHistoryResultEntry.ledgerSeq = Uint32.decode(stream);
    decodedTransactionHistoryResultEntry.txResultSet = TransactionResultSet.decode(stream);
    decodedTransactionHistoryResultEntry.ext = TransactionHistoryResultEntryExt.decode(stream);
    return decodedTransactionHistoryResultEntry;
  }

  public Uint32 getLedgerSeq() {
    return this.ledgerSeq;
  }

  public void setLedgerSeq(Uint32 value) {
    this.ledgerSeq = value;
  }

  public TransactionResultSet getTxResultSet() {
    return this.txResultSet;
  }

  public void setTxResultSet(TransactionResultSet value) {
    this.txResultSet = value;
  }

  public TransactionHistoryResultEntryExt getExt() {
    return this.ext;
  }

  public void setExt(TransactionHistoryResultEntryExt value) {
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
    return Objects.hashCode(this.ledgerSeq, this.txResultSet, this.ext);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof TransactionHistoryResultEntry)) {
      return false;
    }

    TransactionHistoryResultEntry other = (TransactionHistoryResultEntry) object;
    return Objects.equal(this.ledgerSeq, other.ledgerSeq)
        && Objects.equal(this.txResultSet, other.txResultSet)
        && Objects.equal(this.ext, other.ext);
  }

  public static class TransactionHistoryResultEntryExt {
    Integer v;

    public TransactionHistoryResultEntryExt() {
    }

    public static void encode(XdrDataOutputStream stream,
        TransactionHistoryResultEntryExt encodedTransactionHistoryResultEntryExt) throws IOException {
      //Xdrgen::AST::Typespecs::Int
      //Integer
      stream.writeInt(encodedTransactionHistoryResultEntryExt.getDiscriminant().intValue());
      switch (encodedTransactionHistoryResultEntryExt.getDiscriminant()) {
        case 0:
          break;
      }
    }

    public static TransactionHistoryResultEntryExt decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static TransactionHistoryResultEntryExt decode(XdrDataInputStream stream) throws IOException {
      TransactionHistoryResultEntryExt decodedTransactionHistoryResultEntryExt = new TransactionHistoryResultEntryExt();
      Integer discriminant = stream.readInt();
      decodedTransactionHistoryResultEntryExt.setDiscriminant(discriminant);
      switch (decodedTransactionHistoryResultEntryExt.getDiscriminant()) {
        case 0:
          break;
      }
      return decodedTransactionHistoryResultEntryExt;
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
      if (object == null || !(object instanceof TransactionHistoryResultEntryExt)) {
        return false;
      }

      TransactionHistoryResultEntryExt other = (TransactionHistoryResultEntryExt) object;
      return Objects.equal(this.v, other.v);
    }
  }
}
