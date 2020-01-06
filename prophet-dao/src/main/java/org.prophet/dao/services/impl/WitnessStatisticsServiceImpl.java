package org.prophet.dao.services.impl;

import org.prophet.dao.business.WitnessStatisticsBusiness;
import org.prophet.dao.entities.ServiceResponse;
import org.prophet.dao.entities.WitnessStatistics;
import org.prophet.dao.services.WitnessStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WitnessStatisticsServiceImpl implements WitnessStatisticsService {
  @Autowired
  private WitnessStatisticsBusiness witnessStatisticsBusiness;

  @Override
  public ServiceResponse<List<WitnessStatistics>> getAllStatistics() {
    ServiceResponse<List<WitnessStatistics>> response = new ServiceResponse<>();
    List<WitnessStatistics> witnessStatistics = witnessStatisticsBusiness.getAllStatistics();
    response.setStatus(200);
    response.setMessage("ok");
    response.setData(witnessStatistics);
    return response;
  }

  @Override
  public ServiceResponse<String> addStatistic(WitnessStatistics statistics) {
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
