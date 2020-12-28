// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.ByteString;

// === xdr source ============================================================

//  union Memo switch (MemoType type)
//  {
//  case MEMO_NONE:
//      void;
//  case MEMO_TEXT:
//      string text<28>;
//  case MEMO_ID:
//      uint64 id;
//  case MEMO_HASH:
//      Hash hash; // the hash of what to pull from the content server
//  case MEMO_RETURN:
//      Hash retHash; // the hash of the tx you are rejecting
//  };

//  ===========================================================================
public class Memo implements XdrElement {
  MemoType type;
  private XdrString text;
  private Uint64 id;
  private Hash hash;
  private Hash retHash;

  public Memo() {
  }

  public static void encode(XdrDataOutputStream stream, Memo encodedMemo) throws IOException {
    //Xdrgen::AST::Identifier
    //MemoType
    stream.writeInt(encodedMemo.getDiscriminant().getValue());
    switch (encodedMemo.getDiscriminant()) {
      case MEMO_NONE:
        break;
      case MEMO_TEXT:
        encodedMemo.text.encode(stream);
        break;
      case MEMO_ID:
        Uint64.encode(stream, encodedMemo.id);
        break;
      case MEMO_HASH:
        Hash.encode(stream, encodedMemo.hash);
        break;
      case MEMO_RETURN:
        Hash.encode(stream, encodedMemo.retHash);
        break;
    }
  }

  public static Memo decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static Memo decode(XdrDataInputStream stream) throws IOException {
    Memo decodedMemo = new Memo();
    MemoType discriminant = MemoType.decode(stream);
    decodedMemo.setDiscriminant(discriminant);
    switch (decodedMemo.getDiscriminant()) {
      case MEMO_NONE:
        break;
      case MEMO_TEXT:
        decodedMemo.text = XdrString.decode(stream, 28);
        break;
      case MEMO_ID:
        decodedMemo.id = Uint64.decode(stream);
        break;
      case MEMO_HASH:
        decodedMemo.hash = Hash.decode(stream);
        break;
      case MEMO_RETURN:
        decodedMemo.retHash = Hash.decode(stream);
        break;
    }
    return decodedMemo;
  }

  public MemoType getDiscriminant() {
    return this.type;
  }

  public void setDiscriminant(MemoType value) {
    this.type = value;
  }

  public XdrString getText() {
    return this.text;
  }

  public void setText(XdrString value) {
    this.text = value;
  }

  public Uint64 getId() {
    return this.id;
  }

  public void setId(Uint64 value) {
    this.id = value;
  }

  public Hash getHash() {
    return this.hash;
  }

  public void setHash(Hash value) {
    this.hash = value;
  }

  public Hash getRetHash() {
    return this.retHash;
  }

  public void setRetHash(Hash value) {
    this.retHash = value;
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
    return Objects.hashCode(this.text, this.id, this.hash, this.retHash, this.type);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof Memo)) {
      return false;
    }

    Memo other = (Memo) object;
    return Objects.equal(this.text, other.text) && Objects.equal(this.id, other.id) && Objects.equal(this.hash,
        other.hash) && Objects.equal(this.retHash, other.retHash) && Objects.equal(this.type, other.type);
  }
}
