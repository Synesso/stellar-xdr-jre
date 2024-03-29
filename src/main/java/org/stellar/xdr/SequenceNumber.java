// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  typedef int64 SequenceNumber;

//  ===========================================================================
public class SequenceNumber implements XdrElement {
  private Int64 SequenceNumber;

  public SequenceNumber() {
  }

  public SequenceNumber(Int64 SequenceNumber) {
    this.SequenceNumber = SequenceNumber;
  }

  public Int64 getSequenceNumber() {
    return this.SequenceNumber;
  }

  public void setSequenceNumber(Int64 value) {
    this.SequenceNumber = value;
  }

  public static void encode(XdrDataOutputStream stream, SequenceNumber encodedSequenceNumber) throws IOException {
    Int64.encode(stream, encodedSequenceNumber.SequenceNumber);
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

  public static SequenceNumber decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static SequenceNumber decode(XdrDataInputStream stream) throws IOException {
    SequenceNumber decodedSequenceNumber = new SequenceNumber();
    decodedSequenceNumber.SequenceNumber = Int64.decode(stream);
    return decodedSequenceNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.SequenceNumber);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SequenceNumber)) {
      return false;
    }

    SequenceNumber other = (SequenceNumber) object;
    return Objects.equal(this.SequenceNumber, other.SequenceNumber);
  }
}
