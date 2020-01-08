package org.prophet.container.bean;

public class WitnessBlockLoss {

  public WitnessBlockLoss(String address, String url, long count) {
    this.address = address;
    this.url = url;
    this.count = count;
  }

  private String address;
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  private volatile String url;
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  private long count;
  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }
}
