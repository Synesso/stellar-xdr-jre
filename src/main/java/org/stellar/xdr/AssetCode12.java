// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

// === xdr source ============================================================

//  typedef opaque AssetCode12[12];

//  ===========================================================================
public class AssetCode12 implements XdrElement {
  private byte[] AssetCode12;

  public static void encode(XdrDataOutputStream stream, AssetCode12 encodedAssetCode12) throws IOException {
    int AssetCode12size = encodedAssetCode12.AssetCode12.length;
    stream.write(encodedAssetCode12.getAssetCode12(), 0, AssetCode12size);
  }

  public static AssetCode12 decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static AssetCode12 decode(XdrDataInputStream stream) throws IOException {
    AssetCode12 decodedAssetCode12 = new AssetCode12();
    int AssetCode12size = 12;
    decodedAssetCode12.AssetCode12 = new byte[AssetCode12size];
    stream.read(decodedAssetCode12.AssetCode12, 0, AssetCode12size);
    return decodedAssetCode12;
  }

  public byte[] getAssetCode12() {
    return this.AssetCode12;
  }

  public void setAssetCode12(byte[] value) {
    this.AssetCode12 = value;
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
    return Arrays.hashCode(this.AssetCode12);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof AssetCode12)) {
      return false;
    }

    AssetCode12 other = (AssetCode12) object;
    return Arrays.equals(this.AssetCode12, other.AssetCode12);
  }
}
