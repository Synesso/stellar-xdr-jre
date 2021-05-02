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

//  struct SCPQuorumSet
//  {
//      uint32 threshold;
//      PublicKey validators<>;
//      SCPQuorumSet innerSets<>;
//  };

//  ===========================================================================
public class SCPQuorumSet implements XdrElement {
  private Uint32 threshold;
  private PublicKey[] validators;
  private SCPQuorumSet[] innerSets;

  public SCPQuorumSet() {
  }

  public static void encode(XdrDataOutputStream stream, SCPQuorumSet encodedSCPQuorumSet) throws IOException {
    Uint32.encode(stream, encodedSCPQuorumSet.threshold);
    int validatorssize = encodedSCPQuorumSet.getValidators().length;
    stream.writeInt(validatorssize);
    for (int i = 0; i < validatorssize; i++) {
      PublicKey.encode(stream, encodedSCPQuorumSet.validators[i]);
    }
    int innerSetssize = encodedSCPQuorumSet.getInnerSets().length;
    stream.writeInt(innerSetssize);
    for (int i = 0; i < innerSetssize; i++) {
      SCPQuorumSet.encode(stream, encodedSCPQuorumSet.innerSets[i]);
    }
  }

  public static SCPQuorumSet decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static SCPQuorumSet decode(XdrDataInputStream stream) throws IOException {
    SCPQuorumSet decodedSCPQuorumSet = new SCPQuorumSet();
    decodedSCPQuorumSet.threshold = Uint32.decode(stream);
    int validatorssize = stream.readInt();
    decodedSCPQuorumSet.validators = new PublicKey[validatorssize];
    for (int i = 0; i < validatorssize; i++) {
      decodedSCPQuorumSet.validators[i] = PublicKey.decode(stream);
    }
    int innerSetssize = stream.readInt();
    decodedSCPQuorumSet.innerSets = new SCPQuorumSet[innerSetssize];
    for (int i = 0; i < innerSetssize; i++) {
      decodedSCPQuorumSet.innerSets[i] = SCPQuorumSet.decode(stream);
    }
    return decodedSCPQuorumSet;
  }

  public Uint32 getThreshold() {
    return this.threshold;
  }

  public void setThreshold(Uint32 value) {
    this.threshold = value;
  }

  public PublicKey[] getValidators() {
    return this.validators;
  }

  public void setValidators(PublicKey[] value) {
    this.validators = value;
  }

  public SCPQuorumSet[] getInnerSets() {
    return this.innerSets;
  }

  public void setInnerSets(SCPQuorumSet[] value) {
    this.innerSets = value;
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
    return Objects.hashCode(this.threshold, Arrays.hashCode(this.validators), Arrays.hashCode(this.innerSets));
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SCPQuorumSet)) {
      return false;
    }

    SCPQuorumSet other = (SCPQuorumSet) object;
    return Objects.equal(this.threshold, other.threshold) && Arrays.equals(this.validators, other.validators) && Arrays
        .equals(this.innerSets, other.innerSets);
  }

  public static final class Builder {
    private Uint32 threshold;
    private PublicKey[] validators;
    private SCPQuorumSet[] innerSets;

    public Builder threshold(Uint32 threshold) {
      this.threshold = threshold;
      return this;
    }

    public Builder validators(PublicKey[] validators) {
      this.validators = validators;
      return this;
    }

    public Builder innerSets(SCPQuorumSet[] innerSets) {
      this.innerSets = innerSets;
      return this;
    }

    public SCPQuorumSet build() {
      SCPQuorumSet val = new SCPQuorumSet();
      val.setThreshold(threshold);
      val.setValidators(validators);
      val.setInnerSets(innerSets);
      return val;
    }
  }
}
