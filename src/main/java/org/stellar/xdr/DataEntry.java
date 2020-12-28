// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct DataEntry
//  {
//      AccountID accountID; // account this data belongs to
//      string64 dataName;
//      DataValue dataValue;
//
//      // reserved for future use
//      union switch (int v)
//      {
//      case 0:
//          void;
//      }
//      ext;
//  };

//  ===========================================================================
public class DataEntry implements XdrElement {
  private AccountID accountID;
  private String64 dataName;
  private DataValue dataValue;
  private DataEntryExt ext;

  public DataEntry() {
  }

  public static void encode(XdrDataOutputStream stream, DataEntry encodedDataEntry) throws IOException {
    AccountID.encode(stream, encodedDataEntry.accountID);
    String64.encode(stream, encodedDataEntry.dataName);
    DataValue.encode(stream, encodedDataEntry.dataValue);
    DataEntryExt.encode(stream, encodedDataEntry.ext);
  }

  public static DataEntry decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static DataEntry decode(XdrDataInputStream stream) throws IOException {
    DataEntry decodedDataEntry = new DataEntry();
    decodedDataEntry.accountID = AccountID.decode(stream);
    decodedDataEntry.dataName = String64.decode(stream);
    decodedDataEntry.dataValue = DataValue.decode(stream);
    decodedDataEntry.ext = DataEntryExt.decode(stream);
    return decodedDataEntry;
  }

  public AccountID getAccountID() {
    return this.accountID;
  }

  public void setAccountID(AccountID value) {
    this.accountID = value;
  }

  public String64 getDataName() {
    return this.dataName;
  }

  public void setDataName(String64 value) {
    this.dataName = value;
  }

  public DataValue getDataValue() {
    return this.dataValue;
  }

  public void setDataValue(DataValue value) {
    this.dataValue = value;
  }

  public DataEntryExt getExt() {
    return this.ext;
  }

  public void setExt(DataEntryExt value) {
    this.ext = value;
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
    return Objects.hashCode(this.accountID, this.dataName, this.dataValue, this.ext);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof DataEntry)) {
      return false;
    }

    DataEntry other = (DataEntry) object;
    return Objects.equal(this.accountID, other.accountID)
        && Objects.equal(this.dataName, other.dataName)
        && Objects.equal(this.dataValue, other.dataValue)
        && Objects.equal(this.ext, other.ext);
  }

  public static class DataEntryExt {
    Integer v;

    public DataEntryExt() {
    }

    public static void encode(XdrDataOutputStream stream, DataEntryExt encodedDataEntryExt) throws IOException {
      //Xdrgen::AST::Typespecs::Int
      //Integer
      stream.writeInt(encodedDataEntryExt.getDiscriminant().intValue());
      switch (encodedDataEntryExt.getDiscriminant()) {
        case 0:
          break;
      }
    }

    public static DataEntryExt decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static DataEntryExt decode(XdrDataInputStream stream) throws IOException {
      DataEntryExt decodedDataEntryExt = new DataEntryExt();
      Integer discriminant = stream.readInt();
      decodedDataEntryExt.setDiscriminant(discriminant);
      switch (decodedDataEntryExt.getDiscriminant()) {
        case 0:
          break;
      }
      return decodedDataEntryExt;
    }

    public Integer getDiscriminant() {
      return this.v;
    }

    public void setDiscriminant(Integer value) {
      this.v = value;
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
      return Objects.hashCode(this.v);
    }

    @Override
    public boolean equals(Object object) {
      if (object == null || !(object instanceof DataEntryExt)) {
        return false;
      }

      DataEntryExt other = (DataEntryExt) object;
      return Objects.equal(this.v, other.v);
    }
  }
}
