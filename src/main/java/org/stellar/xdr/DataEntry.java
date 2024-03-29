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
  public DataEntry() {
  }
  private AccountID accountID;
  public AccountID getAccountID() {
    return this.accountID;
  }
  public void setAccountID(AccountID value) {
    this.accountID = value;
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

  private DataEntryExt ext;

  public DataEntryExt getExt() {
    return this.ext;
  }

  public void setExt(DataEntryExt value) {
    this.ext = value;
  }

  public static void encode(XdrDataOutputStream stream, DataEntry encodedDataEntry) throws IOException {
    AccountID.encode(stream, encodedDataEntry.accountID);
    String64.encode(stream, encodedDataEntry.dataName);
    DataValue.encode(stream, encodedDataEntry.dataValue);
    DataEntryExt.encode(stream, encodedDataEntry.ext);
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

  @Override
  public int hashCode() {
    return Objects.hashCode(this.accountID, this.dataName, this.dataValue, this.ext);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof DataEntry)) {
      return false;
    }

    DataEntry other = (DataEntry) object;
    return Objects.equal(this.accountID, other.accountID) && Objects.equal(this.dataName, other.dataName) && Objects
        .equal(this.dataValue, other.dataValue) && Objects.equal(this.ext, other.ext);
  }

  public static final class Builder {
    private AccountID accountID;
    private String64 dataName;
    private DataValue dataValue;
    private DataEntryExt ext;

    public Builder accountID(AccountID accountID) {
      this.accountID = accountID;
      return this;
    }

    public Builder dataName(String64 dataName) {
      this.dataName = dataName;
      return this;
    }

    public Builder dataValue(DataValue dataValue) {
      this.dataValue = dataValue;
      return this;
    }

    public Builder ext(DataEntryExt ext) {
      this.ext = ext;
      return this;
    }

    public DataEntry build() {
      DataEntry val = new DataEntry();
      val.setAccountID(accountID);
      val.setDataName(dataName);
      val.setDataValue(dataValue);
      val.setExt(ext);
      return val;
    }
  }

  public static class DataEntryExt {
    public DataEntryExt() {
    }

    Integer v;

    public Integer getDiscriminant() {
      return this.v;
    }

    public void setDiscriminant(Integer value) {
      this.v = value;
    }

    public static final class Builder {
      private Integer discriminant;

      public Builder discriminant(Integer discriminant) {
        this.discriminant = discriminant;
        return this;
      }

      public DataEntryExt build() {
        DataEntryExt val = new DataEntryExt();
        val.setDiscriminant(discriminant);
        return val;
      }
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

    public void encode(XdrDataOutputStream stream) throws IOException {
      encode(stream, this);
    }

    public ByteString encode() throws IOException {
      ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
      XdrDataOutputStream xdrOutputStream = new XdrDataOutputStream(byteStream);
      encode(xdrOutputStream);
      return new ByteString(byteStream.toByteArray());
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
    @Override
    public int hashCode() {
      return Objects.hashCode(this.v);
    }
    @Override
    public boolean equals(Object object) {
      if (!(object instanceof DataEntryExt)) {
        return false;
      }

      DataEntryExt other = (DataEntryExt) object;
      return Objects.equal(this.v, other.v);
    }

  }
}
