// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct ManageDataOp
//  {
//      string64 dataName;
//      DataValue* dataValue; // set to null to clear
//  };

//  ===========================================================================
public class ManageDataOp implements XdrElement {
  public ManageDataOp() {
  }

  private String64 dataName;

  public String64 getDataName() {
    return this.dataName;
  }

  public void setDataName(String64 value) {
    this.dataName = value;
  }

  private DataValue dataValue;

  public DataValue getDataValue() {
    return this.dataValue;
  }

  public void setDataValue(DataValue value) {
    this.dataValue = value;
  }

  public static void encode(XdrDataOutputStream stream, ManageDataOp encodedManageDataOp) throws IOException {
    String64.encode(stream, encodedManageDataOp.dataName);
    if (encodedManageDataOp.dataValue != null) {
      stream.writeInt(1);
      DataValue.encode(stream, encodedManageDataOp.dataValue);
    } else {
      stream.writeInt(0);
    }
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

  public static ManageDataOp decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static ManageDataOp decode(XdrDataInputStream stream) throws IOException {
    ManageDataOp decodedManageDataOp = new ManageDataOp();
    decodedManageDataOp.dataName = String64.decode(stream);
    int dataValuePresent = stream.readInt();
    if (dataValuePresent != 0) {
      decodedManageDataOp.dataValue = DataValue.decode(stream);
    }
    return decodedManageDataOp;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.dataName, this.dataValue);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof ManageDataOp)) {
      return false;
    }

    ManageDataOp other = (ManageDataOp) object;
    return Objects.equal(this.dataName, other.dataName) && Objects.equal(this.dataValue, other.dataValue);
  }

  public static final class Builder {
    private String64 dataName;
    private DataValue dataValue;

    public Builder dataName(String64 dataName) {
      this.dataName = dataName;
      return this;
    }

    public Builder dataValue(DataValue dataValue) {
      this.dataValue = dataValue;
      return this;
    }

    public ManageDataOp build() {
      ManageDataOp val = new ManageDataOp();
      val.setDataName(dataName);
      val.setDataValue(dataValue);
      return val;
    }
  }
}
