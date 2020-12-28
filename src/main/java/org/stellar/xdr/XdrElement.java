package org.stellar.xdr;

import java.io.IOException;
import okio.ByteString;

/**
 * Common parent for all generated classes.
 */
interface XdrElement {
  void encode(XdrDataOutputStream stream) throws IOException;

  ByteString encode() throws IOException;
}
