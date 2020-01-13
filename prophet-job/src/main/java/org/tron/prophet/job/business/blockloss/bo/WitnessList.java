package org.tron.prophet.job.business.blockloss.bo;

import java.io.Serializable;
import java.util.List;

public class WitnessList implements Serializable {

  List<Witness> witnesses;

  public List<Witness> getWitnesses() {
    return witnesses;
  }

  public void setWitnesses(List<Witness> witnesses) {
    this.witnesses = witnesses;
  }

  @Override
  public String toString() {
    return "WitnessList{" +
            "witnesses=" + witnesses +
            '}';
  }
}
