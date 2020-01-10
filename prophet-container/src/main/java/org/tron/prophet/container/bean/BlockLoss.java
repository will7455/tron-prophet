package org.tron.prophet.container.bean;

import java.util.List;

public class BlockLoss {

  private String date;
  private int count;
  private String comment;
  private List<WitnessBlockLoss> detail;

  public BlockLoss(String date, int count, String comment, List<WitnessBlockLoss> detail) {
    this.date = date;
    this.count = count;
    this.comment = comment;
    this.detail = detail;
  }

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

  public List<WitnessBlockLoss> getDetail() {
    return detail;
  }

  public void setDetail(List<WitnessBlockLoss> detail) {
    this.detail = detail;
  }
}
