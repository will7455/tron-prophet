package org.tron.prophet.dao.dao.witnessinfohistory;

import org.tron.prophet.dao.dao.entities.WitnessInfoHistory;
import org.tron.prophet.dao.mappers.WitnessInfoHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class WitnessInfoHistoryDao {
  @Autowired
  private WitnessInfoHistoryMapper witnessInfoHistoryMapper;

  public List<WitnessInfoHistory> getAllHistories() {
    return witnessInfoHistoryMapper.getAllHistories();
  }

  @Transactional(rollbackFor = {Exception.class}, readOnly = false)
  public void addStatistic(WitnessInfoHistory statistics) {
    witnessInfoHistoryMapper.addHistory(statistics);
  }
}
