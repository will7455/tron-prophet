package org.prophet.container.bean;

public class BlockLoss {

  private String date;
  private int count;
  private String comment;

  public BlockLoss(String date, int count, String comment) {
    this.date = date;
    this.count = count;
    this.comment = comment;
  }

  public String getDate() {
    return date;
  }

  public int getCount() {
    return count;
  }

  public String getComment() {
    return comment;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
