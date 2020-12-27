// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import java.io.IOException;

// === xdr source ============================================================

//  enum ThresholdIndexes
//  {
//      THRESHOLD_MASTER_WEIGHT = 0,
//      THRESHOLD_LOW = 1,
//      THRESHOLD_MED = 2,
//      THRESHOLD_HIGH = 3
//  };

//  ===========================================================================
public enum ThresholdIndexes implements XdrElement {
  THRESHOLD_MASTER_WEIGHT(0),
  THRESHOLD_LOW(1),
  THRESHOLD_MED(2),
  THRESHOLD_HIGH(3),
  ;
  private final int mValue;

  ThresholdIndexes(int value) {
    mValue = value;
  }

  public static ThresholdIndexes decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return THRESHOLD_MASTER_WEIGHT;
      case 1:
        return THRESHOLD_LOW;
      case 2:
        return THRESHOLD_MED;
      case 3:
        return THRESHOLD_HIGH;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, ThresholdIndexes value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public int getValue() {
    return mValue;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
