package org.prophet.dao.business.impl;

import org.prophet.dao.business.WitnessStatisticsBusiness;
import org.prophet.dao.entities.WitnessStatistics;
import org.prophet.dao.mappers.WitnessStatisticsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class WitnessStatisticsBusinessImpl implements WitnessStatisticsBusiness {
  @Autowired
  private WitnessStatisticsMapper witnessStatisticsMapper;

  @Override
  public List<WitnessStatistics> getAllStatistics() {
    return witnessStatisticsMapper.getAllStatistics();
  }

  @Override
  @Transactional(rollbackFor = {Exception.class}, readOnly = false)
  public void addStatistic(WitnessStatistics statistics) {
    witnessStatisticsMapper.addStatistic(statistics);
  }
}
