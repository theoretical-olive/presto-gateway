package com.lyft.data.proxyserver;

import lombok.Data;

@Data
public class ProxyServerConfiguration {
  private String name;
  private int localPort;
  private String proxyTo;
  private String prefix = "/";
  private String trustAll = "true";
  private String preserveHost = "true";
  private String ssl = "false";
  private String keystorePath;
  private String keystorePass;

  protected String getPrefix() {
    return prefix;
  }

  protected String getTrustAll() {
    return trustAll;
  }

  protected String getPreserveHost() {
    return preserveHost;
  }

  protected boolean getSsl() {
    return Boolean.parseBoolean(ssl);
  }
}
