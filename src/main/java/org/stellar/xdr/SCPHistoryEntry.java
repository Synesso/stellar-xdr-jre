// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  union SCPHistoryEntry switch (int v)
//  {
//  case 0:
//      SCPHistoryEntryV0 v0;
//  };

//  ===========================================================================
public class SCPHistoryEntry implements XdrElement {
  Integer v;
  private SCPHistoryEntryV0 v0;

  public SCPHistoryEntry() {
  }

  public static void encode(XdrDataOutputStream stream, SCPHistoryEntry encodedSCPHistoryEntry) throws IOException {
    //Xdrgen::AST::Typespecs::Int
    //Integer
    stream.writeInt(encodedSCPHistoryEntry.getDiscriminant().intValue());
    switch (encodedSCPHistoryEntry.getDiscriminant()) {
      case 0:
        SCPHistoryEntryV0.encode(stream, encodedSCPHistoryEntry.v0);
        break;
    }
  }

  public static SCPHistoryEntry decode(XdrDataInputStream stream) throws IOException {
    SCPHistoryEntry decodedSCPHistoryEntry = new SCPHistoryEntry();
    Integer discriminant = stream.readInt();
    decodedSCPHistoryEntry.setDiscriminant(discriminant);
    switch (decodedSCPHistoryEntry.getDiscriminant()) {
      case 0:
        decodedSCPHistoryEntry.v0 = SCPHistoryEntryV0.decode(stream);
        break;
    }
    return decodedSCPHistoryEntry;
  }

  public Integer getDiscriminant() {
    return this.v;
  }

  public void setDiscriminant(Integer value) {
    this.v = value;
  }

  public SCPHistoryEntryV0 getV0() {
    return this.v0;
  }

  public void setV0(SCPHistoryEntryV0 value) {
    this.v0 = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.v0, this.v);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof SCPHistoryEntry)) {
      return false;
    }

    SCPHistoryEntry other = (SCPHistoryEntry) object;
    return Objects.equal(this.v0, other.v0) && Objects.equal(this.v, other.v);
  }
}