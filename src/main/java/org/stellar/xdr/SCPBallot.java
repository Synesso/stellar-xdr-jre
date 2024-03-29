// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct SCPBallot
//  {
//      uint32 counter; // n
//      Value value;    // x
//  };

//  ===========================================================================
public class SCPBallot implements XdrElement {
  public SCPBallot() {
  }
  private Uint32 counter;
  public Uint32 getCounter() {
    return this.counter;
  }

  public void setCounter(Uint32 value) {
    this.counter = value;
  }

  private Value value;

  public Value getValue() {
    return this.value;
  }

  public void setValue(Value value) {
    this.value = value;
  }

  public static void encode(XdrDataOutputStream stream, SCPBallot encodedSCPBallot) throws IOException {
    Uint32.encode(stream, encodedSCPBallot.counter);
    Value.encode(stream, encodedSCPBallot.value);
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

  public static SCPBallot decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static SCPBallot decode(XdrDataInputStream stream) throws IOException {
    SCPBallot decodedSCPBallot = new SCPBallot();
    decodedSCPBallot.counter = Uint32.decode(stream);
    decodedSCPBallot.value = Value.decode(stream);
    return decodedSCPBallot;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.counter, this.value);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SCPBallot)) {
      return false;
    }

    SCPBallot other = (SCPBallot) object;
    return Objects.equal(this.counter, other.counter) && Objects.equal(this.value, other.value);
  }

  public static final class Builder {
    private Uint32 counter;
    private Value value;

    public Builder counter(Uint32 counter) {
      this.counter = counter;
      return this;
    }

    public Builder value(Value value) {
      this.value = value;
      return this;
    }

    public SCPBallot build() {
      SCPBallot val = new SCPBallot();
      val.setCounter(counter);
      val.setValue(value);
      return val;
    }
  }
}
