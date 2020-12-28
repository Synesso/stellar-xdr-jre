// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct InnerTransactionResultPair
//  {
//      Hash transactionHash;          // hash of the inner transaction
//      InnerTransactionResult result; // result for the inner transaction
//  };

//  ===========================================================================
public class InnerTransactionResultPair implements XdrElement {
  private Hash transactionHash;
  private InnerTransactionResult result;

  public InnerTransactionResultPair() {
  }

  public static void encode(XdrDataOutputStream stream, InnerTransactionResultPair encodedInnerTransactionResultPair)
      throws IOException {
    Hash.encode(stream, encodedInnerTransactionResultPair.transactionHash);
    InnerTransactionResult.encode(stream, encodedInnerTransactionResultPair.result);
  }

  public static InnerTransactionResultPair decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static InnerTransactionResultPair decode(XdrDataInputStream stream) throws IOException {
    InnerTransactionResultPair decodedInnerTransactionResultPair = new InnerTransactionResultPair();
    decodedInnerTransactionResultPair.transactionHash = Hash.decode(stream);
    decodedInnerTransactionResultPair.result = InnerTransactionResult.decode(stream);
    return decodedInnerTransactionResultPair;
  }

  public Hash getTransactionHash() {
    return this.transactionHash;
  }

  public void setTransactionHash(Hash value) {
    this.transactionHash = value;
  }

  public InnerTransactionResult getResult() {
    return this.result;
  }

  public void setResult(InnerTransactionResult value) {
    this.result = value;
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
    return Objects.hashCode(this.transactionHash, this.result);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof InnerTransactionResultPair)) {
      return false;
    }

    InnerTransactionResultPair other = (InnerTransactionResultPair) object;
    return Objects.equal(this.transactionHash, other.transactionHash) && Objects.equal(this.result, other.result);
  }
}
