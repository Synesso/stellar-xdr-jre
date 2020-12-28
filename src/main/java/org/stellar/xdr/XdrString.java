package org.stellar.xdr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okio.ByteString;

public class XdrString implements XdrElement {
  private final byte[] bytes;

  public XdrString(byte[] bytes) {
    this.bytes = bytes;
  }

  public XdrString(String text) {
    this.bytes = text.getBytes(StandardCharsets.UTF_8);
  }

  public static XdrString decode(XdrDataInputStream stream, int maxSize) throws IOException {
    int size = stream.readInt();
    if (size > maxSize) {
      throw new InvalidClassException("String length " + size + " exceeds max size " + maxSize);
    }
    byte[] bytes = new byte[size];
    stream.read(bytes);
    return new XdrString(bytes);
  }

  public static XdrString decode(ByteString bs, int maxSize) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())), maxSize);
  }

  @Override
  public void encode(XdrDataOutputStream stream) throws IOException {
    stream.writeInt(this.bytes.length);
    stream.write(this.bytes, 0, this.bytes.length);
  }

  public ByteString encode() throws IOException {
    ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
    XdrDataOutputStream xdrOutputStream = new XdrDataOutputStream(byteStream);
    encode(xdrOutputStream);
    return new ByteString(byteStream.toByteArray());
  }

  public byte[] getBytes() {
    return this.bytes;
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(this.bytes);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof XdrString)) {
      return false;
    }

    XdrString other = (XdrString) object;
    return Arrays.equals(this.bytes, other.bytes);
  }

  @Override
  public String toString() {
    return new String(bytes, StandardCharsets.UTF_8);
  }
}
