package org.tron.prophet.dao.dao.entities;

import java.io.Serializable;
import java.sql.Date;

public class WitnessInfoHistory implements Serializable {
  private Integer id;

  private Date createDate;

  private Integer updateTime;

  private String detail;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Integer getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Integer updateTime) {
    this.updateTime = updateTime;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }
}
