// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

// === xdr source ============================================================

//  struct TransactionResultSet
//  {
//      TransactionResultPair results<>;
//  };

//  ===========================================================================
public class TransactionResultSet implements XdrElement {
  public TransactionResultSet() {
  }

  private TransactionResultPair[] results;

  public TransactionResultPair[] getResults() {
    return this.results;
  }

  public void setResults(TransactionResultPair[] value) {
    this.results = value;
  }

  public static void encode(
      XdrDataOutputStream stream,
      TransactionResultSet encodedTransactionResultSet
  ) throws IOException {
    int resultssize = encodedTransactionResultSet.getResults().length;
    stream.writeInt(resultssize);
    for (int i = 0; i < resultssize; i++) {
      TransactionResultPair.encode(stream, encodedTransactionResultSet.results[i]);
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

  public static TransactionResultSet decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static TransactionResultSet decode(XdrDataInputStream stream) throws IOException {
    TransactionResultSet decodedTransactionResultSet = new TransactionResultSet();
    int resultssize = stream.readInt();
    decodedTransactionResultSet.results = new TransactionResultPair[resultssize];
    for (int i = 0; i < resultssize; i++) {
      decodedTransactionResultSet.results[i] = TransactionResultPair.decode(stream);
    }
    return decodedTransactionResultSet;
  }
  @Override
  public int hashCode() {
    return Arrays.hashCode(this.results);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof TransactionResultSet)) {
      return false;
    }

    TransactionResultSet other = (TransactionResultSet) object;
    return Arrays.equals(this.results, other.results);
  }

  public static final class Builder {
    private TransactionResultPair[] results;

    public Builder results(TransactionResultPair[] results) {
      this.results = results;
      return this;
    }

    public TransactionResultSet build() {
      TransactionResultSet val = new TransactionResultSet();
      val.setResults(results);
      return val;
    }
  }
}
