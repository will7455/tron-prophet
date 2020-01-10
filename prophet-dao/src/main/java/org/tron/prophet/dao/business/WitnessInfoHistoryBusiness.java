package org.tron.prophet.dao.business;

import org.tron.prophet.dao.entities.WitnessInfoHistory;
import org.tron.prophet.dao.mappers.WitnessInfoHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class WitnessInfoHistoryBusiness {
  @Autowired
  private WitnessInfoHistoryMapper witnessInfoHistoryMapper;

  public List<WitnessInfoHistory> getAllStatistics() {
    return witnessInfoHistoryMapper.getAllStatistics();
  }

  @Transactional(rollbackFor = {Exception.class}, readOnly = false)
  public void addStatistic(WitnessInfoHistory statistics) {
    witnessInfoHistoryMapper.addStatistic(statistics);
  }
}
