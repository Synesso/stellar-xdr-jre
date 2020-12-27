// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Arrays;

// === xdr source ============================================================

//  union InflationResult switch (InflationResultCode code)
//  {
//  case INFLATION_SUCCESS:
//      InflationPayout payouts<>;
//  default:
//      void;
//  };

//  ===========================================================================
public class InflationResult implements XdrElement {
  InflationResultCode code;
  private InflationPayout[] payouts;

  public InflationResult() {
  }

  public static void encode(XdrDataOutputStream stream, InflationResult encodedInflationResult) throws IOException {
    //Xdrgen::AST::Identifier
    //InflationResultCode
    stream.writeInt(encodedInflationResult.getDiscriminant().getValue());
    switch (encodedInflationResult.getDiscriminant()) {
      case INFLATION_SUCCESS:
        int payoutssize = encodedInflationResult.getPayouts().length;
        stream.writeInt(payoutssize);
        for (int i = 0; i < payoutssize; i++) {
          InflationPayout.encode(stream, encodedInflationResult.payouts[i]);
        }
        break;
      default:
        break;
    }
  }

  public static InflationResult decode(XdrDataInputStream stream) throws IOException {
    InflationResult decodedInflationResult = new InflationResult();
    InflationResultCode discriminant = InflationResultCode.decode(stream);
    decodedInflationResult.setDiscriminant(discriminant);
    switch (decodedInflationResult.getDiscriminant()) {
      case INFLATION_SUCCESS:
        int payoutssize = stream.readInt();
        decodedInflationResult.payouts = new InflationPayout[payoutssize];
        for (int i = 0; i < payoutssize; i++) {
          decodedInflationResult.payouts[i] = InflationPayout.decode(stream);
        }
        break;
      default:
        break;
    }
    return decodedInflationResult;
  }

  public InflationResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(InflationResultCode value) {
    this.code = value;
  }

  public InflationPayout[] getPayouts() {
    return this.payouts;
  }

  public void setPayouts(InflationPayout[] value) {
    this.payouts = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(Arrays.hashCode(this.payouts), this.code);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof InflationResult)) {
      return false;
    }

    InflationResult other = (InflationResult) object;
    return Arrays.equals(this.payouts, other.payouts) && Objects.equal(this.code, other.code);
  }
}
