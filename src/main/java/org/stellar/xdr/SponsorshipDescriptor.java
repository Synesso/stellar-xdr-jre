// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  typedef AccountID* SponsorshipDescriptor;

//  ===========================================================================
public class SponsorshipDescriptor implements XdrElement {
  private AccountID SponsorshipDescriptor;

  public SponsorshipDescriptor() {
  }

  public SponsorshipDescriptor(AccountID SponsorshipDescriptor) {
    this.SponsorshipDescriptor = SponsorshipDescriptor;
  }

  public static void encode(XdrDataOutputStream stream, SponsorshipDescriptor encodedSponsorshipDescriptor)
      throws IOException {
    if (encodedSponsorshipDescriptor.SponsorshipDescriptor != null) {
      stream.writeInt(1);
      AccountID.encode(stream, encodedSponsorshipDescriptor.SponsorshipDescriptor);
    } else {
      stream.writeInt(0);
    }
  }

  public static SponsorshipDescriptor decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static SponsorshipDescriptor decode(XdrDataInputStream stream) throws IOException {
    SponsorshipDescriptor decodedSponsorshipDescriptor = new SponsorshipDescriptor();
    int SponsorshipDescriptorPresent = stream.readInt();
    if (SponsorshipDescriptorPresent != 0) {
      decodedSponsorshipDescriptor.SponsorshipDescriptor = AccountID.decode(stream);
    }
    return decodedSponsorshipDescriptor;
  }

  public AccountID getSponsorshipDescriptor() {
    return this.SponsorshipDescriptor;
  }

  public void setSponsorshipDescriptor(AccountID value) {
    this.SponsorshipDescriptor = value;
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
    return Objects.hashCode(this.SponsorshipDescriptor);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SponsorshipDescriptor)) {
      return false;
    }

    SponsorshipDescriptor other = (SponsorshipDescriptor) object;
    return Objects.equal(this.SponsorshipDescriptor, other.SponsorshipDescriptor);
  }
}
