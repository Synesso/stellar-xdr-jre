package org.stellar.xdr;

import java.io.IOException;
import okio.ByteString;

/**
 * Common parent for all generated classes.
 */
interface XdrElement {
  public abstract void encode(XdrDataOutputStream stream) throws IOException;
  public abstract ByteString encode() throws IOException;
}
