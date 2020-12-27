// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  struct Hello
//  {
//      uint32 ledgerVersion;
//      uint32 overlayVersion;
//      uint32 overlayMinVersion;
//      Hash networkID;
//      string versionStr<100>;
//      int listeningPort;
//      NodeID peerID;
//      AuthCert cert;
//      uint256 nonce;
//  };

//  ===========================================================================
public class Hello implements XdrElement {
  private Uint32 ledgerVersion;
  private Uint32 overlayVersion;
  private Uint32 overlayMinVersion;
  private Hash networkID;
  private XdrString versionStr;
  private Integer listeningPort;
  private NodeID peerID;
  private AuthCert cert;
  private Uint256 nonce;

  public Hello() {
  }

  public static void encode(XdrDataOutputStream stream, Hello encodedHello) throws IOException {
    Uint32.encode(stream, encodedHello.ledgerVersion);
    Uint32.encode(stream, encodedHello.overlayVersion);
    Uint32.encode(stream, encodedHello.overlayMinVersion);
    Hash.encode(stream, encodedHello.networkID);
    encodedHello.versionStr.encode(stream);
    stream.writeInt(encodedHello.listeningPort);
    NodeID.encode(stream, encodedHello.peerID);
    AuthCert.encode(stream, encodedHello.cert);
    Uint256.encode(stream, encodedHello.nonce);
  }

  public static Hello decode(XdrDataInputStream stream) throws IOException {
    Hello decodedHello = new Hello();
    decodedHello.ledgerVersion = Uint32.decode(stream);
    decodedHello.overlayVersion = Uint32.decode(stream);
    decodedHello.overlayMinVersion = Uint32.decode(stream);
    decodedHello.networkID = Hash.decode(stream);
    decodedHello.versionStr = XdrString.decode(stream, 100);
    decodedHello.listeningPort = stream.readInt();
    decodedHello.peerID = NodeID.decode(stream);
    decodedHello.cert = AuthCert.decode(stream);
    decodedHello.nonce = Uint256.decode(stream);
    return decodedHello;
  }

  public Uint32 getLedgerVersion() {
    return this.ledgerVersion;
  }

  public void setLedgerVersion(Uint32 value) {
    this.ledgerVersion = value;
  }

  public Uint32 getOverlayVersion() {
    return this.overlayVersion;
  }

  public void setOverlayVersion(Uint32 value) {
    this.overlayVersion = value;
  }

  public Uint32 getOverlayMinVersion() {
    return this.overlayMinVersion;
  }

  public void setOverlayMinVersion(Uint32 value) {
    this.overlayMinVersion = value;
  }

  public Hash getNetworkID() {
    return this.networkID;
  }

  public void setNetworkID(Hash value) {
    this.networkID = value;
  }

  public XdrString getVersionStr() {
    return this.versionStr;
  }

  public void setVersionStr(XdrString value) {
    this.versionStr = value;
  }

  public Integer getListeningPort() {
    return this.listeningPort;
  }

  public void setListeningPort(Integer value) {
    this.listeningPort = value;
  }

  public NodeID getPeerID() {
    return this.peerID;
  }

  public void setPeerID(NodeID value) {
    this.peerID = value;
  }

  public AuthCert getCert() {
    return this.cert;
  }

  public void setCert(AuthCert value) {
    this.cert = value;
  }

  public Uint256 getNonce() {
    return this.nonce;
  }

  public void setNonce(Uint256 value) {
    this.nonce = value;
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.ledgerVersion, this.overlayVersion, this.overlayMinVersion, this.networkID,
        this.versionStr, this.listeningPort, this.peerID, this.cert, this.nonce);
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof Hello)) {
      return false;
    }

    Hello other = (Hello) object;
    return Objects.equal(this.ledgerVersion, other.ledgerVersion) && Objects.equal(this.overlayVersion,
        other.overlayVersion) && Objects.equal(this.overlayMinVersion, other.overlayMinVersion) && Objects.equal(
        this.networkID, other.networkID) && Objects.equal(this.versionStr, other.versionStr) && Objects.equal(
        this.listeningPort, other.listeningPort) && Objects.equal(this.peerID, other.peerID) && Objects.equal(this.cert,
        other.cert) && Objects.equal(this.nonce, other.nonce);
  }
}
