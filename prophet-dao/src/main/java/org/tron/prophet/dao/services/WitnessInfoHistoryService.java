package org.tron.prophet.dao.services;

import org.tron.prophet.dao.business.WitnessInfoHistoryBusiness;
import org.tron.prophet.dao.entities.ServiceResponse;
import org.tron.prophet.dao.entities.WitnessInfoHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WitnessInfoHistoryService {
  @Autowired
  private WitnessInfoHistoryBusiness witnessStatisticsBusiness;

  public ServiceResponse<List<WitnessInfoHistory>> getAllStatistics() {
    ServiceResponse<List<WitnessInfoHistory>> response = new ServiceResponse<>();
    List<WitnessInfoHistory> witnessStatistics = witnessStatisticsBusiness.getAllStatistics();
    response.setStatus(200);
    response.setMessage("ok");
    response.setData(witnessStatistics);
    return response;
  }

  public ServiceResponse<String> addStatistic(WitnessInfoHistory statistics) {
    ServiceResponse<String> response = new ServiceResponse<>();
    try {
      witnessStatisticsBusiness.addStatistic(statistics);
      response.setMessage("ok");
      response.setStatus(200);
      response.setData("success");
    } catch (Exception e) {
      response.setMessage(e.getMessage());
      response.setStatus(500);
      response.setData("error");
    }
    return response;
  }
}
