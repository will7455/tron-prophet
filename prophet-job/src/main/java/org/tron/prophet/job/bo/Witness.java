package org.tron.prophet.job.bo;

import java.io.Serializable;

public class Witness implements Serializable {
  private Witness() {
    address = "";
    voteCount = 0L;
    //pubKey = "";
    url = "";
    totalProduced = 0L;
    totalMissed = 0L;
    latestBlockNum = 0L;
    latestSlotNum = 0L;
    isJobs = false;
  }

  private String address;
  /**
   * <code>bytes address = 1;</code>
   */
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  private long voteCount;
  /**
   * <code>int64 voteCount = 2;</code>
   */
  public long getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(long voteCount) {
    this.voteCount = voteCount;
  }

  //private String pubKey;
  /**
   * <code>bytes pubKey = 3;</code>
   */
//  public String getPubKey() {
//    return pubKey;
//  }
//
//  public void setPubKey(String pubKey) {
//    this.pubKey = pubKey;
//  }

  private volatile String url;
  /**
   * <code>string url = 4;</code>
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  private long totalProduced;
  /**
   * <code>int64 totalProduced = 5;</code>
   */
  public long getTotalProduced() {
    return totalProduced;
  }

  public void setTotalProduced(long totalProduced) {
    this.totalProduced = totalProduced;
  }

  private long totalMissed;
  /**
   * <code>int64 totalMissed = 6;</code>
   */
  public long getTotalMissed() {
    return totalMissed;
  }

  public void setTotalMissed(long totalMissed) {
    this.totalMissed = totalMissed;
  }

  private long latestBlockNum;
  /**
   * <code>int64 latestBlockNum = 7;</code>
   */
  public long getLatestBlockNum() {
    return latestBlockNum;
  }

  public void setLatestBlockNum(long latestBlockNum) {
    this.latestBlockNum = latestBlockNum;
  }

  private long latestSlotNum;
  /**
   * <code>int64 latestSlotNum = 8;</code>
   */
  public long getLatestSlotNum() {
    return latestSlotNum;
  }

  public void setLatestSlotNum(long latestSlotNum) {
    this.latestSlotNum = latestSlotNum;
  }

  private boolean isJobs;
  /**
   * <code>bool isJobs = 9;</code>
   */
  public boolean getIsJobs() {
    return isJobs;
  }

  public void setJobs(boolean jobs) {
    isJobs = jobs;
  }

  @Override
  public String toString() {
    return "Witness{" +
            "address='" + address + '\'' +
            ", voteCount=" + voteCount +
            //", pubKey='" + pubKey + '\'' +
            ", url='" + url + '\'' +
            ", totalProduced=" + totalProduced +
            ", totalMissed=" + totalMissed +
            ", latestBlockNum=" + latestBlockNum +
            ", latestSlotNum=" + latestSlotNum +
            ", isJobs=" + isJobs +
            '}';
  }
}
