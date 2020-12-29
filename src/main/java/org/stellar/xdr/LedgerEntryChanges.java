// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

// === xdr source ============================================================

//  typedef LedgerEntryChange LedgerEntryChanges<>;

//  ===========================================================================
public class LedgerEntryChanges implements XdrElement {
  private LedgerEntryChange[] LedgerEntryChanges;

  public LedgerEntryChanges() {
  }

  public LedgerEntryChanges(LedgerEntryChange[] LedgerEntryChanges) {
    this.LedgerEntryChanges = LedgerEntryChanges;
  }

  public static void encode(XdrDataOutputStream stream, LedgerEntryChanges encodedLedgerEntryChanges)
      throws IOException {
    int LedgerEntryChangessize = encodedLedgerEntryChanges.getLedgerEntryChanges().length;
    stream.writeInt(LedgerEntryChangessize);
    for (int i = 0; i < LedgerEntryChangessize; i++) {
      LedgerEntryChange.encode(stream, encodedLedgerEntryChanges.LedgerEntryChanges[i]);
    }
  }

  public static LedgerEntryChanges decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static LedgerEntryChanges decode(XdrDataInputStream stream) throws IOException {
    LedgerEntryChanges decodedLedgerEntryChanges = new LedgerEntryChanges();
    int LedgerEntryChangessize = stream.readInt();
    decodedLedgerEntryChanges.LedgerEntryChanges = new LedgerEntryChange[LedgerEntryChangessize];
    for (int i = 0; i < LedgerEntryChangessize; i++) {
      decodedLedgerEntryChanges.LedgerEntryChanges[i] = LedgerEntryChange.decode(stream);
    }
    return decodedLedgerEntryChanges;
  }

  public LedgerEntryChange[] getLedgerEntryChanges() {
    return this.LedgerEntryChanges;
  }

  public void setLedgerEntryChanges(LedgerEntryChange[] value) {
    this.LedgerEntryChanges = value;
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
    return Arrays.hashCode(this.LedgerEntryChanges);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof LedgerEntryChanges)) {
      return false;
    }

    LedgerEntryChanges other = (LedgerEntryChanges) object;
    return Arrays.equals(this.LedgerEntryChanges, other.LedgerEntryChanges);
  }
}
