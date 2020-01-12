package org.tron.prophet.dao.services;

import org.tron.prophet.dao.dao.witnessinfohistory.WitnessInfoHistoryDao;
import org.tron.prophet.dao.dao.entities.ServiceResponse;
import org.tron.prophet.dao.dao.entities.WitnessInfoHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WitnessInfoHistoryService {
  @Autowired
  private WitnessInfoHistoryDao witnessInfoHistoryDao;

  public ServiceResponse<List<WitnessInfoHistory>> getAllHistories() {
    ServiceResponse<List<WitnessInfoHistory>> response = new ServiceResponse<>();
    List<WitnessInfoHistory> witnessStatistics = witnessInfoHistoryDao.getAllHistories();
    response.setStatus(200);
    response.setMessage("ok");
    response.setData(witnessStatistics);
    return response;
  }

  public ServiceResponse<String> addStatistic(WitnessInfoHistory statistics) {
    ServiceResponse<String> response = new ServiceResponse<>();
    try {
      witnessInfoHistoryDao.addStatistic(statistics);
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
