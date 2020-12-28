// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

// === xdr source ============================================================

//  struct TransactionV0Envelope
//  {
//      TransactionV0 tx;
//      /* Each decorated signature is a signature over the SHA256 hash of
//       * a TransactionSignaturePayload */
//      DecoratedSignature signatures<20>;
//  };

//  ===========================================================================
public class TransactionV0Envelope implements XdrElement {
  private TransactionV0 tx;
  private DecoratedSignature[] signatures;

  public TransactionV0Envelope() {
  }

  public static void encode(XdrDataOutputStream stream, TransactionV0Envelope encodedTransactionV0Envelope)
      throws IOException {
    TransactionV0.encode(stream, encodedTransactionV0Envelope.tx);
    int signaturessize = encodedTransactionV0Envelope.getSignatures().length;
    stream.writeInt(signaturessize);
    for (int i = 0; i < signaturessize; i++) {
      DecoratedSignature.encode(stream, encodedTransactionV0Envelope.signatures[i]);
    }
  }

  public static TransactionV0Envelope decode(ByteString bs) throws IOException {
    return decode(new XdrDataInputStream(new ByteArrayInputStream(bs.toByteArray())));
  }

  public static TransactionV0Envelope decode(XdrDataInputStream stream) throws IOException {
    TransactionV0Envelope decodedTransactionV0Envelope = new TransactionV0Envelope();
    decodedTransactionV0Envelope.tx = TransactionV0.decode(stream);
    int signaturessize = stream.readInt();
    decodedTransactionV0Envelope.signatures = new DecoratedSignature[signaturessize];
    for (int i = 0; i < signaturessize; i++) {
      decodedTransactionV0Envelope.signatures[i] = DecoratedSignature.decode(stream);
    }
    return decodedTransactionV0Envelope;
  }

  public TransactionV0 getTx() {
    return this.tx;
  }

  public void setTx(TransactionV0 value) {
    this.tx = value;
  }

  public DecoratedSignature[] getSignatures() {
    return this.signatures;
  }

  public void setSignatures(DecoratedSignature[] value) {
    this.signatures = value;
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
    return Objects.hashCode(this.tx, Arrays.hashCode(this.signatures));
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof TransactionV0Envelope)) {
      return false;
    }

    TransactionV0Envelope other = (TransactionV0Envelope) object;
    return Objects.equal(this.tx, other.tx) && Arrays.equals(this.signatures, other.signatures);
  }

  public static final class Builder {
    private TransactionV0 tx;
    private DecoratedSignature[] signatures;

    public Builder tx(TransactionV0 tx) {
      this.tx = tx;
      return this;
    }

    public Builder signatures(DecoratedSignature[] signatures) {
      this.signatures = signatures;
      return this;
    }

    public TransactionV0Envelope build() {
      TransactionV0Envelope val = new TransactionV0Envelope();
      val.setTx(tx);
      val.setSignatures(signatures);
      return val;
    }
  }
}
