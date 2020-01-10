package org.tron.prophet.dao.entities;

import java.io.Serializable;
import java.sql.Date;

public class WitnessInfoHistory implements Serializable {
  private Date currDate;

  private String jsonData;

  public Date getCurrDate() {
    return currDate;
  }

  public void setCurrDate(Date currDate) {
    this.currDate = currDate;
  }

  public String getJsonData() {
    return jsonData;
  }

  public void setJsonData(String jsonData) {
    this.jsonData = jsonData;
  }
}
