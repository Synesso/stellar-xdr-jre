// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

// === xdr source ============================================================

//  typedef opaque Thresholds[4];

//  ===========================================================================
public class Thresholds implements XdrElement {
  private byte[] Thresholds;

  public Thresholds() {
  }

  public Thresholds(byte[] Thresholds) {
    this.Thresholds = Thresholds;
  }

  public static void encode(XdrDataOutputStream stream, Thresholds encodedThresholds) throws IOException {
    int Thresholdssize = encodedThresholds.Thresholds.length;
    stream.write(encodedThresholds.getThresholds(), 0, Thresholdssize);
  }

  public static Thresholds decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static Thresholds decode(XdrDataInputStream stream) throws IOException {
    Thresholds decodedThresholds = new Thresholds();
    int Thresholdssize = 4;
    decodedThresholds.Thresholds = new byte[Thresholdssize];
    stream.read(decodedThresholds.Thresholds, 0, Thresholdssize);
    return decodedThresholds;
  }

  public byte[] getThresholds() {
    return this.Thresholds;
  }

  public void setThresholds(byte[] value) {
    this.Thresholds = value;
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
    return Arrays.hashCode(this.Thresholds);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Thresholds)) {
      return false;
    }

    Thresholds other = (Thresholds) object;
    return Arrays.equals(this.Thresholds, other.Thresholds);
  }
}
