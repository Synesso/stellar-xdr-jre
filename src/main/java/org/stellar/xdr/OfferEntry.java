// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  struct OfferEntry
//  {
//      AccountID sellerID;
//      int64 offerID;
//      Asset selling; // A
//      Asset buying;  // B
//      int64 amount;  // amount of A
//
//      /* price for this offer:
//          price of A in terms of B
//          price=AmountB/AmountA=priceNumerator/priceDenominator
//          price is after fees
//      */
//      Price price;
//      uint32 flags; // see OfferEntryFlags
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
public class OfferEntry implements XdrElement {
  private AccountID sellerID;
  private Int64 offerID;
  private Asset selling;
  private Asset buying;
  private Int64 amount;
  private Price price;
  private Uint32 flags;
  private OfferEntryExt ext;

  public OfferEntry() {
  }

  public static void encode(XdrDataOutputStream stream, OfferEntry encodedOfferEntry) throws IOException {
    AccountID.encode(stream, encodedOfferEntry.sellerID);
    Int64.encode(stream, encodedOfferEntry.offerID);
    Asset.encode(stream, encodedOfferEntry.selling);
    Asset.encode(stream, encodedOfferEntry.buying);
    Int64.encode(stream, encodedOfferEntry.amount);
    Price.encode(stream, encodedOfferEntry.price);
    Uint32.encode(stream, encodedOfferEntry.flags);
    OfferEntryExt.encode(stream, encodedOfferEntry.ext);
  }

  public static OfferEntry decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static OfferEntry decode(XdrDataInputStream stream) throws IOException {
    OfferEntry decodedOfferEntry = new OfferEntry();
    decodedOfferEntry.sellerID = AccountID.decode(stream);
    decodedOfferEntry.offerID = Int64.decode(stream);
    decodedOfferEntry.selling = Asset.decode(stream);
    decodedOfferEntry.buying = Asset.decode(stream);
    decodedOfferEntry.amount = Int64.decode(stream);
    decodedOfferEntry.price = Price.decode(stream);
    decodedOfferEntry.flags = Uint32.decode(stream);
    decodedOfferEntry.ext = OfferEntryExt.decode(stream);
    return decodedOfferEntry;
  }

  public AccountID getSellerID() {
    return this.sellerID;
  }

  public void setSellerID(AccountID value) {
    this.sellerID = value;
  }

  public Int64 getOfferID() {
    return this.offerID;
  }

  public void setOfferID(Int64 value) {
    this.offerID = value;
  }

  public Asset getSelling() {
    return this.selling;
  }

  public void setSelling(Asset value) {
    this.selling = value;
  }

  public Asset getBuying() {
    return this.buying;
  }

  public void setBuying(Asset value) {
    this.buying = value;
  }

  public Int64 getAmount() {
    return this.amount;
  }

  public void setAmount(Int64 value) {
    this.amount = value;
  }

  public Price getPrice() {
    return this.price;
  }

  public void setPrice(Price value) {
    this.price = value;
  }

  public Uint32 getFlags() {
    return this.flags;
  }

  public void setFlags(Uint32 value) {
    this.flags = value;
  }

  public OfferEntryExt getExt() {
    return this.ext;
  }

  public void setExt(OfferEntryExt value) {
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
    return Objects.hashCode(this.sellerID, this.offerID, this.selling, this.buying, this.amount, this.price, this.flags,
        this.ext);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof OfferEntry)) {
      return false;
    }

    OfferEntry other = (OfferEntry) object;
    return Objects.equal(this.sellerID, other.sellerID)
        && Objects.equal(this.offerID, other.offerID)
        && Objects.equal(this.selling, other.selling)
        && Objects.equal(this.buying, other.buying)
        && Objects.equal(this.amount, other.amount)
        && Objects.equal(this.price, other.price)
        && Objects.equal(this.flags, other.flags)
        && Objects.equal(this.ext, other.ext);
  }

  public static final class Builder {
    private AccountID sellerID;
    private Int64 offerID;
    private Asset selling;
    private Asset buying;
    private Int64 amount;
    private Price price;
    private Uint32 flags;
    private OfferEntryExt ext;

    public Builder sellerID(AccountID sellerID) {
      this.sellerID = sellerID;
      return this;
    }

    public Builder offerID(Int64 offerID) {
      this.offerID = offerID;
      return this;
    }

    public Builder selling(Asset selling) {
      this.selling = selling;
      return this;
    }

    public Builder buying(Asset buying) {
      this.buying = buying;
      return this;
    }

    public Builder amount(Int64 amount) {
      this.amount = amount;
      return this;
    }

    public Builder price(Price price) {
      this.price = price;
      return this;
    }

    public Builder flags(Uint32 flags) {
      this.flags = flags;
      return this;
    }

    public Builder ext(OfferEntryExt ext) {
      this.ext = ext;
      return this;
    }

    public OfferEntry build() {
      OfferEntry val = new OfferEntry();
      val.setSellerID(sellerID);
      val.setOfferID(offerID);
      val.setSelling(selling);
      val.setBuying(buying);
      val.setAmount(amount);
      val.setPrice(price);
      val.setFlags(flags);
      val.setExt(ext);
      return val;
    }
  }

  public static class OfferEntryExt {
    Integer v;

    public OfferEntryExt() {
    }

    public static void encode(XdrDataOutputStream stream, OfferEntryExt encodedOfferEntryExt) throws IOException {
      //Xdrgen::AST::Typespecs::Int
      //Integer
      stream.writeInt(encodedOfferEntryExt.getDiscriminant().intValue());
      switch (encodedOfferEntryExt.getDiscriminant()) {
        case 0:
          break;
      }
    }

    public static OfferEntryExt decode(ByteString bs) throws IOException {
      return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
    }

    public static OfferEntryExt decode(XdrDataInputStream stream) throws IOException {
      OfferEntryExt decodedOfferEntryExt = new OfferEntryExt();
      Integer discriminant = stream.readInt();
      decodedOfferEntryExt.setDiscriminant(discriminant);
      switch (decodedOfferEntryExt.getDiscriminant()) {
        case 0:
          break;
      }
      return decodedOfferEntryExt;
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
      if (!(object instanceof OfferEntryExt)) {
        return false;
      }

      OfferEntryExt other = (OfferEntryExt) object;
      return Objects.equal(this.v, other.v);
    }

    public static final class Builder {
      private Integer discriminant;

      public Builder discriminant(Integer discriminant) {
        this.discriminant = discriminant;
        return this;
      }

      public OfferEntryExt build() {
        OfferEntryExt val = new OfferEntryExt();
        val.setDiscriminant(discriminant);
        return val;
      }
    }
  }
}
